package atl.academy.MarsRover.Controllers;

import atl.academy.MarsRover.Dto.CommandDto;
import atl.academy.MarsRover.Dto.RoverDto;
import atl.academy.MarsRover.Models.Rover;
import atl.academy.MarsRover.Services.RoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoverController {

    @Autowired
    RoverService service;
    @GetMapping("api/rover/")
    public Rover get(){
       return service.get();
    }

    @PostMapping("api/rover/")
    public void create(@RequestBody RoverDto rover){
     System.out.println(rover);
    }

    @PostMapping("api/rover/command")
    public void sendCommand(@RequestBody CommandDto commands){
        System.out.println(commands);

        for (String command:commands.getCommands()) {
            service.sendCommand(command);
            System.out.println(command);
        }
    }
}
