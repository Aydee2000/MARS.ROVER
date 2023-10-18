package atl.academy.MarsRover.Controllers;

import atl.academy.MarsRover.Dto.ObstacleDto;
import atl.academy.MarsRover.Models.Obstacle;
import atl.academy.MarsRover.Services.ObstacleService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ObstacleControllerTest {

    @Mock
    private ObstacleService obstacleService;

    @InjectMocks
    private ObstacleController controller;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateObstacle() {
        ObstacleDto obstacleDto = new ObstacleDto();
        obstacleDto.setX(5);
        obstacleDto.setY(0);
        controller.create(obstacleDto);
    }

    @Test
    public void testFindAllObstacles() {
        List<Obstacle> expectedObstacles = new ArrayList<>();
        when(obstacleService.findAll()).thenReturn(expectedObstacles);

        List<Obstacle> result = controller.findAll();

        assertEquals(expectedObstacles, result);
    }

}

