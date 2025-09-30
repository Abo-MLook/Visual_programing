
package basics_oop.thoretical;

//slide  31

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to translate the point by dx and dy
    void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    // Method to get the X coordinate
    int getX() {
        return x;
    }
}

// The `Object` class is the root class of all Java classes. Every class in Java, 
// directly or indirectly, inherits from `Object`. An `Object` reference can 
// store a reference to any type of object. However, to access subclass-specific methods, 
// you must cast the `Object` reference to the appropriate class type.

public class CastingExample {
    public static void main(String[] args) {
        // Object o1 is an Object reference, but it points to a Point object
        Object o1 = new Point(5, -3); // Point object is created and assigned to o1

        // Casting o1 to Point to use methods specific to the Point class
        ((Point) o1).translate(6, 2);  // This works, since o1 refers to a Point object

        // Now, we store the casted object into a Point reference for easier access
        Point p = (Point) o1;

        // Accessing the Point method getX() after casting
        int x = p.getX(); // This works, because o1 was cast to Point

        // Printing the updated X coordinate
        System.out.println("Updated x: " + x);  // Outputs: Updated x: 11

        // Object o2 is an Object reference pointing to a String object
        Object o2 = "hello there"; // o2 points to a String object

        // Casting o2 to String and calling String's length() method
        int len = ((String) o2).length();  // Works fine since o2 refers to a String object

        // Printing the length of the string
        System.out.println("Length of the string: " + len);  // Outputs: Length of the string: 11

        // Example where casting might fail: trying to cast String to Point
        try {
            Point invalidPoint = (Point) o2;  // This will throw ClassCastException
        } catch (ClassCastException e) {
            System.out.println("ClassCastException occurred: " + e);
        }
    }
}

