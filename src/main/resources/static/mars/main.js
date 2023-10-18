
const container = document.getElementById("container");
const rover = document.getElementById("rover");
const Sound = document.getElementById("sound");
const btnTL = document.getElementById("btnTL");
const btnA = document.getElementById("btnA");
const btnB = document.getElementById("btnB");
const btnTR = document.getElementById("btnTR");

let roverDirection = "up";

playSoundMars();

createMap();

async function createMap() {
    refreshRover();

    const obstaclesResponse = await fetch('/api/obstacle/', {
        method: 'GET',
        headers: {
            'Content-type': 'application/json'
        }
    });
    const obstaclesJson = await obstaclesResponse.json();

    obstaclesJson.forEach(obstacleJson => {
        createRock(obstacleJson.x, obstacleJson.y);
    });
}

async function refreshRover() {
    const roverResponse = await fetch('/api/rover/', {
        method: 'GET',
        headers: {
            'Content-type': 'application/json'
        }
    });
    const roverJson = await roverResponse.json();
    moveRover(roverJson.x, roverJson.y);
}

function moveRover(x, y) {
    rover.style.left = (x * 100) + 'px';
    rover.style.top = (y * 100) + 'px';
    playMoveSound();
}

function createRock(x, y) {
    const rock = document.createElement("img");
    rock.setAttribute("src", "../image/stone.png");
    rock.setAttribute("class", "rocks");

    container.appendChild(rock);

    rock.style.left = (x * 100) + 'px';
    rock.style.top = (y * 100) + 'px';
}

function changeImageDirection(newDirection) {
    const roverImage = document.getElementById("rover");

    const imagePaths = {
        "advance": "../image/rover-advance.png",
        "back": "../image/rover-back.png",
        "left": "../image/rover-left.png",
        "right": "../image/rover-right.png"
    };

    if (imagePaths[newDirection]) {
        roverImage.src = imagePaths[newDirection];
    } else {
        console.error("Dirección no válida");
    }
}


btnTL.addEventListener('click', () => {
    clickTurnLeft();
});

btnA.addEventListener('click', () => {
    clickAdvance();
});

btnB.addEventListener('click', () => {
    clickBack();
});

btnTR.addEventListener('click', () => {
    clickTurnRight();
});


//  arreglar direccion de imagen del rover
//  al girar cambia de direccion pero al avanzar de vuelta su direccion cambia


function clickTurnLeft() {
    sendCommand("L");
    changeImageDirection("left");
    console.log("left");
}

function clickAdvance() {
    sendCommand("A");
    // changeImageDirection("back");
    changeImageDirection("right");
    console.log("advance");
}

function clickBack() {
    sendCommand("B");
    // changeImageDirection("advance");
    changeImageDirection("left");
    console.log("back");
}

function clickTurnRight() {
    sendCommand("R");
    changeImageDirection("right");
    console.log("right");
}

async function sendCommand(command) {
    const commands = {
        "commands": [command]
    };

    await fetch('/api/rover/command', {
        method: 'POST',
        headers: {
            'Content-type': 'application/json'
        },
        body: JSON.stringify(commands)
    });
    await refreshRover();
}

function playMoveSound() {
    const soundMove = document.createElement('audio');
    soundMove.src = "../sounds/move.wav";
    soundMove.autoplay = true;
    soundMove.volume = 1;
    Sound.appendChild(soundMove);
}

function playSoundMars() {
    const soundMars = document.createElement('audio');
    soundMars.src = "../sounds/mars.mp3";
    soundMars.autoplay = true;
    soundMars.volume = 1;
    container.appendChild(soundMars);
}
