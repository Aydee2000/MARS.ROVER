const container = document.getElementById("container")
const Rover = document.getElementById("rover")
const Sound = document.getElementById("sound")
let Rock = document.getElementsByClassName("rokcs")

let btnTl = document.getElementById("btnTL")
let btnA = document.getElementById("btnA")
let btnB = document.getElementById("btnB")
let btnTr = document.getElementById("btnTR")

playSoundMars();
// LLama al backend
createMap()


async function createMap() {
    
    // Obtener la informacion del Rover
    refreshRover();
    
    // Obtener la informacion de los obstaculos
    let obstaclesReponse = await fetch('/api/obstacle/', {
        method: 'GET',
        headers: {
            'Content-type': 'application/json'
        }
    })
    let obstaclesJson = await obstaclesReponse.json();

    obstaclesJson.forEach(obstacleJson => {
        createRock(obstacleJson.x, obstacleJson.y)
    });

}

async function refreshRover() {
    let roverReponse = await fetch('/api/rover/', {
        method: 'GET',
        headers: {
            'Content-type': 'application/json'
        }
    });
    let roverJson = await roverReponse.json();
    moveRover(roverJson.x, roverJson.y);
}

function moveRover(x, y) {
    Rover.style.left = (x * 100) + 'px'
    Rover.style.top = (y * 100) + 'px'
    playMoveSound()
}

function createRock(x, y) {
    let rock = document.createElement("img")
    rock.setAttribute("src", "../image/stone.png")
    rock.setAttribute("class", "rocks")

    let container = document.getElementById("container")
    container.appendChild(rock)

    rock.style.left = (x * 100) + 'px'
    rock.style.top = (y * 100) + 'px'
}



btnTl.addEventListener('click', () => {
    clickTurnLeft()
});

btnA.addEventListener('click', () => {
    clickAdvance()
});

btnB.addEventListener('click', () => {
    clickBack()
});

btnTr.addEventListener('click', () => {
    clickTurnRight()
});

function clickTurnLeft() {
    sendCommand("L")
}

function clickAdvance() {
    sendCommand("A")
}

function clickBack() {
    sendCommand("B")
}

function clickTurnRight() {
    sendCommand("R")
}

async function sendCommand(command) {
    let commands = {
        "commands": [command]
    }

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
    let SoundMove = document.createElement('audio')
    SoundMove.src = "../sounds/move.wav"
    SoundMove.autoplay = true
    SoundMove.volume = 1
    Sound.appendChild(SoundMove)
}

function playSoundMars() {
    let SoundMars = document.createElement('audio')
    SoundMars.src = "../sounds/mars.mp3"
    SoundMars.autoplay = true
    SoundMars.volume = 1
    container.appendChild(SoundMars)
}



// createMap();

// async function createMap() {
//     refreshRover();

//     // Obtener la informacion de los obstaculos
//     let obstacleResponse = await fetch('/api/obstacle/', {
//         method: 'GET',
//         headers: {
//             'Content-Type': 'application/json'
//         }
//     });
//     let obstaclesJson = await obstacleResponse.json();

//     obstaclesJson.forEach(obstacleJson => {
//         createRock(obstacleJson.x, obstacleJson.y);
//     });
// }

// async function refreshRover() {
//     let roverResponse = await fetch('/api/rover/', {
//         method: 'GET',
//         headers: {
//             'Content-Type': 'application/json'
//         }
//     });
//     let roverJson = await roverResponse.json();
//     moveRover(roverJson.x, roverJson.y);
// }

// function moveRover(x, y) {
//     document.getElementById("rover").style.left = (x * 100) + 'px'
//     document.getElementById("rover").style.top = (y * 100) + 'px';
//     playMoveSound();
// }

// function createRock(x, y) {
//     var rock = document.createElement("img");
//     rock.setAttribute("src", "../image/stone.png");
//     rock.setAttribute("class", "rock");
//     var container = document.getElementById("container");
//     container.appendChild(rock);
//     rock.style.left = (x * 100) + 'px'
//     rock.style.top = (y * 100) + 'px';
// }

// var posX = 0;
// var posY = 0;

// function clickBtnRotateLeft() {
//     sendCommand("L");
// }

// function clickBtnRotateRight() {
//     sendCommand("R");
// }

// async function moveForward() {
//     sendCommand("F");
// }

// function moveBack() {
//     sendCommand("B");
// }

// async function sendCommand(command) {
//     let requestBody = {
//         "commands": [command]
//     };

//     await fetch('/api/rover/command/', {
//         method: 'POST',
//         headers: {
//             'Content-Type': 'application/json'
//         },
//         body: JSON.stringify(requestBody)
//     });
//     await refreshRover();
// }

// function playMoveSound() {
//     var audioElement = document.createElement("audio");
//     audioElement.src = "sounds/move.wav";
//     audioElement.autoplay = true;
//     document.getElementById("container").appendChild(audioElement);
// }