public class Assignment_4_Test {
    public static void main(String[] args) {
        //creates the three polygons
        Regular_Polygon defaultPolygon = new Regular_Polygon();
        Regular_Polygon halfPolygon = new Regular_Polygon(6,4);
        Regular_Polygon fullPolygon = new Regular_Polygon(10,4,5.6,7.8);

        //displays info for the three polygons
        System.out.println("Default polygon \n" + defaultPolygon.getPerimeter() + "<-Perimeter--Area->" + defaultPolygon.getArea());
        System.out.println("------------------------------------------");
        System.out.println("Partially constructed Polygon \n" + halfPolygon.getPerimeter() + "<-Perimeter--Area->" + halfPolygon.getArea());
        System.out.println("------------------------------------------");
        System.out.println("Fully constructed Polygon \n" + fullPolygon.getPerimeter() + "<-Perimeter--Area->" + fullPolygon.getArea());
    }
}   
