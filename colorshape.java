import java.awt.*;
import java.awt.geom.*;

public class Paddle extends ColorShape{
	
	// location and size variables
	private static int speed;
	private static int xPos;
	private static final int yPos = 420;
	private static final int width = 70;
	private static final int height = 30;

private static final Rectangle2D.Double shape = new Rectangle2D.Double(200,yPos,width,height);

public Paddle() {
super(shape);

// set paddle color
setFillColor(Color.BLUE);
setBorderColor(Color.BLACK);

// set paddle position and speed
xPos = 300;
speed = 0;
}

public void move() {
// move paddle
xPos += speed;

// stop the paddle from moving at the edges
if (xPos <= 2) {
xPos = 2;
}

if (xPos > (600 - width)) {
xPos = 600 - width;
}

// update shape
shape.setRect(xPos, yPos, width, height);
}

public void setSpeed(int newSpeed) {
speed = newSpeed;
}

public int getWidth() {
return width;
}

public int getHeight() {
return height;
}

public int getX() {
return xPos;
}

public Rectangle2D.Double getShape() {
return shape;
} 
}