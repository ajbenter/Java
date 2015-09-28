import java.awt.Color;

public class Art{
public static void main(String[] args) {
int n = Integer.parseInt(args[0]);

StdDraw.setXscale(0.0,1.0);
StdDraw.setYscale(0.0,1.0);

double x = 0.5;
double y = 0.5;
double len = 0.5;

drawArt(x,y,len,n);
}
public static void drawArt(double x, double y, double len, int n) {
if (n==0){
return;
}
else {
filledHourglass(x, y, len);
drawArt(x+(Math.sqrt(2)*len)/4,y+(Math.sqrt(2)*len)/4,len/2,n-1);
drawArt(x-(Math.sqrt(2)*len)/4,y-(Math.sqrt(2)*len)/4,len/2,n-1);

}
}
public static void filledHourglass(double x, double y, double len) {
double [] xP = {x, x, x-(Math.sqrt(2)*len)/2};
double [] yP = {y, y + (Math.sqrt(2)*len)/2, y};
double [] xC = {x, x, x+(Math.sqrt(2)*len)/2};
double [] yC = {y,y - (Math.sqrt(2)*len)/2, y};
StdDraw.setPenColor(new Color(255,128,0));
StdDraw.filledPolygon(xP,yP);
StdDraw.setPenColor(new Color(0,0,255));
StdDraw.filledPolygon(xC,yC);
}
}