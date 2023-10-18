package atl.academy.MarsRover.Services;

import atl.academy.MarsRover.Dto.ObstacleDto;
import atl.academy.MarsRover.Models.Obstacle;


import java.util.List;

public interface ObstacleService {

    public List<Obstacle> findAll();

    void create(ObstacleDto obstacleDto);
}
