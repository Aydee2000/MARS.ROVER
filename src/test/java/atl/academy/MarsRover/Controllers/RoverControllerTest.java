package atl.academy.MarsRover.Controllers;

import atl.academy.MarsRover.Models.Rover;
import atl.academy.MarsRover.Services.RoverService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class RoverControllerTest {

    @Mock
    private RoverService roverService;

    @InjectMocks
    private RoverController controller;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetRover() {
        Rover expectedRover = new Rover();
        when(roverService.get()).thenReturn(expectedRover);

        Rover result = controller.get();

        assertEquals(expectedRover, result);
    }
}