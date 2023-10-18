package atl.academy.MarsRover.Services;

import atl.academy.MarsRover.Models.Direction;
import atl.academy.MarsRover.Models.Obstacle;
import atl.academy.MarsRover.Models.Rover;
import atl.academy.MarsRover.Repository.ObstacleRepository;
import atl.academy.MarsRover.Repository.RoverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoverServiceImp implements RoverService {
    @Autowired
    RoverRepository repository;

    @Autowired
    ObstacleRepository obstacleRepository;


    @Override
    public Rover get() {
        List<Rover> roverList = repository.findAll();
        return roverList.get(0);
    }

    @Override
    public void sendCommand(String command) {
        Rover rover = get();

        if (rover == null) {
            return;
        }

        switch (command) {
            case "B":
            case "A":
                getPosition(rover, "A".equals(command));
                break;
            case "L":
            case "R":
                rotateRover(rover, "R".equals(command));
                break;
        }
        repository.save(rover);
    }

    private void rotateRover(Rover rover, boolean isRight) {
        Direction direction = rover.getDirection();
        Direction finalDirection;

        if (isRight) {
            finalDirection = Direction.values()[(direction.ordinal() + 1) % Direction.values().length];
        } else {
            int numDirections = Direction.values().length;
            int newIndex = (direction.ordinal() - 1 + numDirections) % numDirections;
            finalDirection = Direction.values()[newIndex];
        }

        rover.setDirection(finalDirection);
    }

    private void getPosition(Rover rover, boolean isForward) {
        int positionXFinal = rover.getX();
        int positionYFinal = rover.getY();
        Direction direction = rover.getDirection();

        int movement = isForward ? direction.getDirection() : -direction.getDirection();

        if (Direction.EAST.equals(direction) || Direction.WEST.equals(direction)) {
            positionYFinal -= movement;
        } else if (Direction.NORTH.equals(direction) || Direction.SOUTH.equals(direction)) {
            positionXFinal -= movement;
        }


        if (iCanMoveToThisPosition(positionXFinal, positionYFinal)) {
            rover.setX(positionXFinal);
            rover.setY(positionYFinal);
        } else {
            stopRover(rover, false);
        }
    }

    private void stopRover(Rover rover, boolean isMoving) {
        rover.setMoving(isMoving);
    }

   private boolean iCanMoveToThisPosition(int positionXFinal, int positionYFinal) {
        List<Obstacle> obstacles = obstacleRepository.findAll();

        for (Obstacle obstacle : obstacles) {
            if (obstacle.getY() == positionYFinal && obstacle.getX() == positionXFinal) {
                return false;
            }
        }
        return true;
    }

}

