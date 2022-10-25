/*
- A no-arg constructor that creates a regular polygon with default values.
- A constructor that creates a regular polygon with the specified number of sides and length of side, centered at (0, 0).
- A constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates.
- The accessor and mutator methods for all data fields.
- The method getPerimeter() that returns the perimeter of the polygon.
- The method getArea() that returns the area of the polygon.
The formula for computing the area of a regular polygon is: Area = n * s^2 / (4 * tan(pi / n))
Write a test program that creates three RegularPolygon objects, created using the no-arg constructor, using RegularPolygon(6, 4), and using RegularPolygon(10, 4, 5.6, 7.8).
For each object, display its perimeter and area.
Sample Run
Polygon 1 perimeter: 3.0
Polygon 1 area: 0.43301270189221946
Polygon 2 perimeter: 24.0
Polygon 2 area: 41.569219381653056
Polygon 3 perimeter: 40.0
Polygon 3 area: 123.10734148701015
*/

public class Exercise09_09 {
    public static void main(String[] args) {

    }
    public class RegularPolygon {
        private int n = 3;
        private double sidethat = 1;
        private double x = 0;
        private double y = 0;
        public RegularPolygon() {
            //create regular polygon with default values?
        }
        
    }
}
