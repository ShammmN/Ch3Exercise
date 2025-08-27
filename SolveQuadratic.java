/*
* Name: Ch3Code
* Purpose: Get the roots by using a quadratic formula
* Programmer: Sham Nemer
* Date: 8 / 26 / 2025
*/ 
// Import the Scanner class to get user input
import java.util.Scanner;
// Create the main class
public class SolveQuadratic {
// Using Scanner to get the user input for A, B, and C
    public static void main(String[] args) {
        Scanner userValues = new Scanner(System.in);

        System.out.println("Please enter values for A, B, and C:");
// Assigning the user input for A, B, and C to variables
        double aValue = userValues.nextDouble();
        double bValue = userValues.nextDouble();
        double cValue = userValues.nextDouble();    
// Calculating the discriminant and the two roots using the quadratic formula    
        double discriminant = Math.pow(bValue,2) - 4 * aValue * cValue;
        double root1 =  (-bValue + Math.sqrt(discriminant)) / (2 * aValue);
        double root2 =  (-bValue - Math.sqrt(discriminant)) / (2 * aValue);

// Outputting the results based on the value of the discriminant
        if (discriminant > 0) {
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            System.out.println("The roots is " + root1);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}