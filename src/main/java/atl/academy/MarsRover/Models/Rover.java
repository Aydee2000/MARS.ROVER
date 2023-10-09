package atl.academy.MarsRover.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "rover")
public class Rover {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "positionX")
    private Integer x;

    @Column(name = "positionY")
    private Integer y;

    @Enumerated(EnumType.STRING)
    @Column(name = "direction")
    private Direction direction;

    private boolean isMoving;

    public void setMoving(boolean isMoving) {
        this.isMoving = isMoving;
    }
}
