package assignment;

public class TurnRightCommand implements Command {
	private Rover rover;

    public TurnRightCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.getPosition().turnRight();
        System.out.println("Rover turned right.");
    }
}
