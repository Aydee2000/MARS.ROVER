package atl.academy.MarsRover.Services;


import atl.academy.MarsRover.Models.Direction;
import atl.academy.MarsRover.Models.Obstacle;
import atl.academy.MarsRover.Models.Rover;
import atl.academy.MarsRover.Repository.RoverRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.verification.VerificationMode;

import java.util.Collections;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class RoverServiceImpTest {

    @Mock
    private RoverRepository roverRepository;

    @InjectMocks
    private RoverServiceImp service;

    @Mock
    private ObstacleService obstacleService;

    /*
    @Test
    public void callService_whenReceiveCommand() {

    }

    @Test
    public void testSendCommand() {
        Rover rover = new Rover();
        rover.setX(0);
        rover.setY(0);
        rover.setDirection(Direction.NORTH);

        RoverService roverService = null;
        roverService.sendCommand("A"); // Debería avanzar hacia el norte.

        assertEquals(0, rover.getX()); // La posición X no debe cambiar.
        assertEquals(1, rover.getY()); // Debería haber avanzado en la dirección Y.
    }

    @Test
    public void testSendCommandNoRover() {
        // Simula la situación en la que no hay rover en la base de datos.
        ObstacleService repository = null;
        when(repository.findAll()).thenReturn(Collections.emptyList());

        RoverService roverService = null;
        roverService.sendCommand("A"); // No debería lanzar excepciones y simplemente salir de la función.

        // Asegúrate de que no haya intentos de actualizar la base de datos u otras operaciones.
        verify(repository, never());
    }

    private Properties verify(ObstacleService repository, VerificationMode never) {
        return null;
    }

    @Test
    public void testSendCommandObstacle() {
        Rover rover = new Rover();
        rover.setX(1);
        rover.setY(1);
        rover.setDirection(Direction.NORTH);

        Obstacle obstacle = new Obstacle();
        obstacle.setX(1);
        obstacle.setY(2);

         // Simula la presencia de un obstáculo en la base de datos.

        when(obstacleService.findAll()).thenReturn(Collections.singletonList(obstacle));

        RoverServiceImp roverService = null;
        roverService.sendCommand("A"); // Debería detenerse debido al obstáculo.

        assertFalse(rover.isMoving()); // Debería estar detenido. */

}
