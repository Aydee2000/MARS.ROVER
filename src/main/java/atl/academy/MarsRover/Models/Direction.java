package atl.academy.MarsRover.Models;

public enum Direction {
    NORTH(1), EAST(1), SOUTH(-1), WEST(-1);
    // NORTE ESTE SUR OESTE
    private int value;

    Direction(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
