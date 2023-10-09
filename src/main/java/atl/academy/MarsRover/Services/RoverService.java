package atl.academy.MarsRover.Services;

import atl.academy.MarsRover.Models.Rover;


public interface RoverService {
    public Rover get();

    void sendCommand(String command);
}
