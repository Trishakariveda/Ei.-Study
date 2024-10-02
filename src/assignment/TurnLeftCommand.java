package assignment;

public class TurnLeftCommand implements Command{
	private Rover rover;

public TurnLeftCommand(Rover rover) {
    this.rover = rover;
}

@Override
public void execute() {
    rover.getPosition().turnLeft();
    System.out.println("Rover turned left.");
}
}