package atl.academy.MarsRover.Repository;

import atl.academy.MarsRover.Models.Rover;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoverRepository extends JpaRepository<Rover, Long> {
}
