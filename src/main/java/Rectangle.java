import java.util.Scanner;

/**
 * TODO FOR HOMEWORK - Rectangle.java
 *      [ ] Update both the set method for rectangle like you did for square
 *      [ ] Write the setters for the Rectangle Class
 *      [ ] Write methods for the Rectangle Class
 */
public class Rectangle {
    /**
     * The length of the rectangle
     */
    private double length;

    /**
     * The width of the rectangle
     */
    private double width;

    /**
     * Creates an instance of the Rectangle class
     */
    public Rectangle() {
    }

    /**
     * Gets the length of the rectangle
     * @return The length
     */
    public double getLength() {
        return length;
    }


    /**
     * Sets the Length
     * @param length The rectangle length size
     */
    public void setLength(double length) {
        if ( length > 0 ) {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    /**
     * Sets the Width
     * @param width The rectangle width size
     */
    public void setWidth(double width) {
        if ( width > 0 ) {
            this.width = width;
        }
    }

    /**
     * Calculates the area of the rectangle object
     * @return The area of the rectangle
     */
    public double area() {
        return length * width;
    }

    /**
     * Calculates the perimeter of the rectangle object
     * @return The perimeter of the rectangle
     */
    public double perimeter() {
        return (2 * length) + (2 * width);
    }

    // TODO FOR HOMEWORK: Write a main method

    /**
     * The main method for the Square class
     * @param args The arguments passed into the main method
     */
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        Scanner scanner = new Scanner(System.in );

        System.out.println("Gimme a dang length: ");
        double length = scanner.nextDouble();
        r.setLength(length);

        System.out.println("Gimme a dang width: ");
        double width = scanner.nextDouble();
        r.setWidth(width);

        double area = r.area();
        double perimeter = r.perimeter();

        System.out.println("A rectangle with a length of " + r.getLength() + " and a width of " + r.getWidth() + " has an area of: " + area);
        System.out.println("A rectangle with a length of " + r.getLength() + " and a width of " + r.getWidth() + " has a perimeter of: " + perimeter);
    }
}