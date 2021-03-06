package model;

import javafx.scene.Node;
import javafx.scene.shape.Shape;

public interface gameSprite {

	public double getX();
	public double getY();
	
	public boolean checkSides();
	public boolean checkCollisions();
	public boolean collide(Node other);
	Shape createSprite();
	
	
}//end of interface
