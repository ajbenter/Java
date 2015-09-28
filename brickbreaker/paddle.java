import java.awt.geom.*;
import java.awt.*;

public class Ball extends ColorShape {

// location and size variables
private int xPos;
private int yPos;
private int xSpeed;
private int ySpeed;
private static final int height = 20;
private static final int width = 20;
private static final Ellipse2D.Double shape = new Ellipse2D.Double(0, 0, width, height);

// constructor
public Ball() {
super(shape);

// set ball color
super.setFillColor(Color.RED);
super.setBorderColor(Color.RED);

// set initial values for x and y position and speed
xPos = 300;
yPos = 250;
xSpeed = 1;
ySpeed = 1;
}

public void move() {
// move ball
xPos = xPos + xSpeed;
yPos = yPos + ySpeed;

// detect if ball should bounce off an edge
	if (xPos == 0) {
		xSpeed = 1;
	}

	if ((xPos + width) == 590) {
		xSpeed = -1;
	}

	if (yPos == 0) {
		ySpeed = 1;
	}
// update shape to new values
shape.setFrame(xPos, yPos, width, height);
}

public void setXspeed(int newSpeed) {
xSpeed = newSpeed;
}

public void setYspeed(int newSpeed) {
ySpeed = newSpeed;
}

public int getX() {
return xPos;
}

public int getY() {
return yPos;
}

public int getWidth() {
return width;
}

public int getHeight() {
return height;
}

public Ellipse2D.Double getShape() {
return shape;
}
}