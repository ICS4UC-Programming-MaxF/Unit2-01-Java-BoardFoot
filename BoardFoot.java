/* 
* Calculates the required length to equal exactly 1 board foot (144 in³).
* 
* @param width  The width of the wood in inches.
* @param height The thickness/height of the wood in inches.
* @return The calculated length in inches.
* @author  MF-ROB
* @version 1.0
* @since   2026-24-09
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class BoardFoot {

    // Function: calculates the length needed for 1 board foot
    // 144 cubic inches = width x height x length, so length = 144 / (width x height)
    public static double CalculateBoardFoot(double width, double height) {
        double length = 144.0 / (width * height);
        return length;
    }

    // main: handles input, error checking, and output
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
        // Get the width from the user
        System.out.print("Hello. Please enter the width (in inches): ");
        double width = input.nextDouble();

        // Get the height from the user
        System.out.print("Next, please enter the height (in inches): ");
        double height = input.nextDouble();
        
        // Error check: both numbers must be greater than 0
        if (width <= 0 || height <= 0) {
            System.out.println("Error: please enter a number greater than 0.");
        } else {
            // Call the function and display the result
            double length = CalculateBoardFoot(width, height);
            System.out.printf("The length needed for 1 board foot is %.2f inches.%n", length);
        }
    } catch (InputMismatchException e) {
        System.out.println("Sorry. please enter a number and not a letter");
    } finally {
        // Close the scanner
        input.close();
        }
    }
}