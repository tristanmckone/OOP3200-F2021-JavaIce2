/**
 * @author Tristan Mckone
 * @date 2021-11-15
 */
package ca.durhamcollege;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        // import scanner
        Scanner keyboard = new Scanner(System.in);
        String prompt = "";

        // prompt for first point
        Vector2D point1 = new Vector2D();
        System.out.print("Enter the first point (x, y): ");

        // split to get both values
        prompt = keyboard.nextLine();
        var values = prompt.split(",");
        point1.set(Float.parseFloat(values[0]), Float.parseFloat(values[1]));

        // same to get second input
        System.out.println("\n--------------------------------------------------------------" );
        System.out.println("You Entered " + point1.toString() + " for the first point" );
        System.out.println("--------------------------------------------------------------\n" );
        Vector2D point2 =  new Vector2D();
        System.out.print("Enter the second point (x, y): ");

        prompt = keyboard.nextLine();
        values = prompt.split(",");
        point2.set(Float.parseFloat(values[0]), Float.parseFloat(values[1]));

        // output values
        System.out.println("\n--------------------------------------------------------------" );
        System.out.println("You Entered " + point2.toString() + " for the second point" );
        System.out.println("--------------------------------------------------------------\n" );

        System.out.printf("Magnitude of first point is: %.3f \n", point1.getMagnitude());
        System.out.printf("Magnitude of second point is: %.3f \n",point2.getMagnitude());
        System.out.printf("Distance between first point and second point is: %.3f \n", Vector2D.distance(point1, point2));
        System.out.println("--------------------------------------------------------------\n" );
    }
}
