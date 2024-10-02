package assignment;

public class Rover {
    private Position position;
    private Grid grid;

    public Rover(Position position, Grid grid) {
        this.position = position;
        this.grid = grid;
    }

    public void executeCommand(Command command) {
        command.execute();
    }

    public Position getPosition() {
        return position;
    }

    public boolean canMoveForward() {
        Position temp = new Position(position.getX(), position.getY(), position.getDirection());
        temp.moveForward();
        return grid.isWithinBounds(temp.getX(), temp.getY()) && !grid.isObstacle(temp.getX(), temp.getY());
    }

    public String statusReport() {
        return position.report();
    }
}