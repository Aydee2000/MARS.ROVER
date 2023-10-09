package atl.academy.MarsRover.Dto;

import atl.academy.MarsRover.Models.Direction;
import lombok.Data;

@Data
public class RoverDto {
    private Integer x;
    private Integer y;
    private Direction direction;
}
