package atl.academy.MarsRover.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "obstacle")
public class Obstacle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "positionX")
    private int x;

    @Column(name = "positionY")
    private int y;

}
