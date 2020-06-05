import java.util.Scanner;

/**
 * TODO FOR HOMEWORK - Square.java
 *      [X] Correct the setSide method
 *      [ ] Fix the main method
 */
public class Square {

    /**
     * The side length
     */
    private double side;

    /**
     * Creates an instance of the Square class
     */
    public Square() {
    }

    /**
     * Gets the Side Length
     * @return The Side Length
     */
    public double getSide() {
        return side;
    }

    /**
     * Sets the Side Length
     * @param side The Side Length of a square
     */
    public void setSide(double side) {
        if ( side > 0 ) {
            this.side = side;
        }
    }

    /**
     * Calculates the area of the square object
     * @return The area of the square
     */
    public double area() {
        return side * side;
    }

    /**
     * Calculates the perimeter of the square object
     * @return The perimeter of the square
     */
    public double perimeter() {
        return 4 * side;
    }

    /**
     * The main method for the Square class
     * @param args The arguments passed into the main method
     */
    public static void main(String[] args) {
        Square s = new Square();

        Scanner scanner = new Scanner(System.in );
        System.out.println("Gimme a dang number: ");
        double sideLength = scanner.nextDouble();

        s.setSide(sideLength);

        double area = s.area();
        double perimeter = s.perimeter();

        System.out.println("A square with side length of " + s.getSide() + " has an area of: " + area);
        System.out.println("A square with side length of " + s.getSide() + " has a perimeter of: " + perimeter);
    }
}