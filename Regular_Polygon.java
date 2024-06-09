public class Regular_Polygon {
    //variables
    private int n;
	private double side;
	private double x;
	private double y; 

    //default regular polygon
    Regular_Polygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }
    //creates a regular polygon with a amount of sides and the length 
    Regular_Polygon(int sideAmnt, double sideLength){
        n = sideAmnt;
        side = sideLength;
        x = 0;
        y = 0;
    }
    //creates a regular polygon with a amount of sides, length for the sides, a x cordinate and a y coordinate
    Regular_Polygon(int sideAmnt, double sideLength, double xCord, double yCord){
        n = sideAmnt;
        side = sideLength;
        x = xCord;
        y = yCord;
    }
    //sets the amount of sides a regular poygon will have
    public void setSideAmnt(int sideAmnt){
        n = sideAmnt;
    }
   //sets the side length of a regular polygon
    public void setSideLength(double sideLength){
        side = sideLength;
    }
    //sets the x coordinate of a regular polygon
    public void setXCord(double xCord){
        x = xCord;
    }
    //sets the y coordinate of a regular polygon
    public void setYCord(double yCord){
        y = yCord;
    }
    //gets the amount of sides of a regular polygon
    public int getSideAmnt(){
        return n;
    }
    //gets the length of the sides of a regular polygon
    public double getSideLength(){
        return side;
    }
    //gets the x of a regular polygon
    public double getXCord(){
        return x;
    }
    //gets the y of a regular polygon
    public double getYCord(){
        return y;
    }
    //retrieves the perimeter of a regular polygon
    public double getPerimeter(){
        return side * n;
    }
    //retrieves the area of a regular polygon
    public double getArea(){
        return ((n * (side * side)) / (4 * Math.tan(Math.PI / n)));
    }
};
