package atl.academy.MarsRover.Repository;

import atl.academy.MarsRover.Models.Obstacle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface
ObstacleRepository extends JpaRepository<Obstacle, Long> {
}
