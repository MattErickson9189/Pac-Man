package model;

import java.util.ArrayList;
import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.*;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class red_Blinky implements Ghost {
	
	private static double xPos;
	private static double yPos;
	private static double dest_x;
	private static double dest_y;
	private static int speed;
	private static Rectangle red;
	private ArrayList<Double> xCoord = new ArrayList<Double>();
	private ArrayList<Double> yCoord = new ArrayList<Double>();

	// First have ghost move at slower speed with no collision at the space pacman is on to make something 
	//playable. use animation timer.
	//TODO Make ghost move in same direction until collision then decide where to go using if statements
	// check to see if pacman is on same X or Y to make the corners, 
	
	
	public red_Blinky() {
		red = new Rectangle(8,8);
		red.setTranslateX(650);
		red.setTranslateY(323);
		red.setFill(Color.RED);
		xPos = createSprite().getX() + 4; // getX -> upper left corner + 4 = center of side of square
		yPos = createSprite().getY() + 4; // getX -> upper left corner + 4 = center of side of square
		
		xCoord.add(xPos);
		yCoord.add(yPos);
		
	}

	public void updatePosition(player p) {
    	
		moveX(p);
		moveY(p);

	}
	
	@Override
	public Rectangle createSprite() {
		return red;
	}

	public void move() {
		//TODO: Matt add movement styles
	}
	
	public void moveX(player p) {
		dest_x = p.getX();
		if (xPos < dest_x) {
    		createSprite().setX(createSprite().getX() + 4 + speed);
    		xPos += speed;
    	} else if (xPos > dest_x) {
    		createSprite().setX(createSprite().getX() + 4 - speed);
    		xPos -= speed;
    	}
	}
	
	public void moveY(player p) {
		
		dest_y = p.getY();
		
    	        
    	if (yPos < dest_y) {
    		createSprite().setY(createSprite().getY() + 4 + speed);
    		yPos += speed;
    	} else if (yPos > dest_y) {
    		createSprite().setY(createSprite().getY() + 4 - speed);
    		yPos -= speed;
    	}
	}
	
	
	@Override
	public double getX() {
		return xPos;
	}

	@Override
	public double getY() {
		return yPos;
	}

	@Override
	public boolean checkSides() {
		return false;
	}

	@Override
	public boolean checkCollisions() {
		return false;
	}

	@Override
	public boolean collide(Node other) {
		return false;
	}

}
