package assignment;

import java.util.HashSet;
import java.util.Set;

public class Grid {

	    private int width, height;
	    private Set<String> obstacles;

	    public Grid(int width, int height) {
	        this.width = width;
	        this.height = height;
	        this.obstacles = new HashSet<>();
	    }

	    public void addObstacle(int x, int y) {
	        obstacles.add(x + "," + y);
	    }

	    public boolean isObstacle(int x, int y) {
	        return obstacles.contains(x + "," + y);
	    }

	    public boolean isWithinBounds(int x, int y) {
	        return x >= 0 && x < width && y >= 0 && y < height;
	    }
	}
