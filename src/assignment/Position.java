package assignment;

public class Position {
    private int x, y;
    private Direction direction;

    public Position(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void moveForward() {
        switch (direction) {
            case NORTH: y++; break;
            case SOUTH: y--; break;
            case EAST: x++; break;
            case WEST: x--; break;
        }
    }

    public void turnLeft() {
        direction = direction.left();
    }

    public void turnRight() {
        direction = direction.right();
    }

    public String report() {
        return "Rover is at (" + x + ", " + y + ") facing " + direction.name();
    }
}
