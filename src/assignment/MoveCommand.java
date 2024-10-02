package assignment;

public class MoveCommand implements Command {
	private Rover rover;

    public MoveCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        if (rover.canMoveForward()) {
            rover.getPosition().moveForward();
            System.out.println("Rover moved forward.");
        } else {
            System.out.println("Obstacle detected! Can't move forward.");
        }
    }
}