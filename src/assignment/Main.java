package assignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter grid width: ");
		        int gridWidth = scanner.nextInt();
		        System.out.print("Enter grid height: ");
		        int gridHeight = scanner.nextInt();
		        Grid grid = new Grid(gridWidth, gridHeight);

		      
		        System.out.print("Enter number of obstacles: ");
		        int numObstacles = scanner.nextInt();
		        for (int i = 0; i < numObstacles; i++) {
		            System.out.print("Enter obstacle " + (i + 1) + " coordinates (x y): ");
		            int x = scanner.nextInt();
		            int y = scanner.nextInt();
		            grid.addObstacle(x, y);
		        }
		        
		        scanner.nextLine();

		        System.out.print("Enter starting position and direction (x y direction [N, S, E, W]): ");
		        int startX = scanner.nextInt();
		        int startY = scanner.nextInt();
		        String directionInput = scanner.next().toUpperCase();
		        scanner.nextLine();
		        
		        Direction startDirection;
		        switch (directionInput) {
		            case "N":
		                startDirection = Direction.NORTH;
		                break;
		            case "S":
		                startDirection = Direction.SOUTH;
		                break;
		            case "E":
		                startDirection = Direction.EAST;
		                break;
		            case "W":
		                startDirection = Direction.WEST;
		                break;
		            default:
		                System.out.println("Invalid direction. Defaulting to NORTH.");
		                startDirection = Direction.NORTH;
		        }
		        Position startPosition = new Position(startX, startY, startDirection);
		        Rover rover = new Rover(startPosition, grid);

		        while (true) {
		            System.out.print("Enter command (M=Move, L=Left, R=Right, Report=Status, Q=Quit): ");
		            String commandInput = scanner.nextLine().toUpperCase();

		            if (commandInput.equals("Q")) {
		            	 System.out.println("Exiting the simulation.");
		                break;
		            }

		           Command command = null;
		           switch (commandInput) {
		            case "M":
		                command = new MoveCommand(rover);
		                rover.executeCommand(command);
		                System.out.println(rover.statusReport());  
		                break;
		            case "L":
		                command = new TurnLeftCommand(rover);
		                rover.executeCommand(command);
		                System.out.println(rover.statusReport()); 
		                break;
		            case "R":
		                command = new TurnRightCommand(rover);
		                rover.executeCommand(command);
		                System.out.println(rover.statusReport());
		                break;
		            case "REPORT":
		                System.out.println(rover.statusReport());
		                break;
		            default:
		                System.out.println("Invalid command.");
		                continue;
		        }
		    }
		}
		}