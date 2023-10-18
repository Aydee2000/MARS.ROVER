package atl.academy.MarsRover.Services;

import atl.academy.MarsRover.Dto.ObstacleDto;
import atl.academy.MarsRover.Models.Obstacle;
import atl.academy.MarsRover.Repository.ObstacleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ObstacleServiceImp implements ObstacleService{

    @Autowired
    private ObstacleRepository repository;

    @Override
    public List<Obstacle> findAll() {
        return repository.findAll();
    }

    @Override
    public void create(ObstacleDto obstacleDto) {

    }
}
