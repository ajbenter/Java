
mport java.awt.Color;

public class Sierpinski {
	public static void main(String[] args) {
		//defining the input variable for amount of times of recursion
		int n = Integer.parseInt(args[0]);
		
		//color and scale of triangles
		Color red = new Color(250, 0, 0);
		StdDraw.setPenColor(red);
		StdDraw.setXscale(0.0, 1.0);
        StdDraw.setYscale(0.0, 1.0);
       
		
        //vertex and length of first triangle
		double x = 0.5;
		double y = 0.0;
		double len = 0.5;
		drawSierpinski(x, y, len, n);
	}

	public static void drawSierpinski(double x, double y, double len, int n) {

		//when the factorial gets to 0 - stop drawing
		if (n==0) {

			return;

		}

		//the new points of the triangle during recursion
		else {
			filledTriangle(x,y,len);
			drawSierpinski(x + len/2,y,len/2,n-1);
			drawSierpinski(x - len/2,y,len/2,n-1);
			drawSierpinski(x,y + (Math.sqrt(3)/2 * len),len/2,n-1);

		}



	}

	public static void filledTriangle(double x, double y, double len) {
		//the new points of each filled triangle 
		double[] xPoints = {x, x - len/2 , x + len/2};
		double[] yPoints = {y, y + (Math.sqrt(3)/2 * len), y + (Math.sqrt(3)/2 * len)};

		//drawing the triangle
		StdDraw.filledPolygon(xPoints, yPoints);
	}
}