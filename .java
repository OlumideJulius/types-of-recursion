import java.util.Scanner;

public class PowerLogarithmic {

    // Main method - Entry point of the program
    public static void main(string[] args) throws Exception { 
        // Create a Scanner object to read input from the user
        Scanner scn = new Scanner(System.in);

        // Ask the user to enter the base (x)
        System.out.print("Enter the base (x): ");
        int x = scn.nextInt();

        // Ask the user to enter the exponent (n)
        System.out.print("Enter the exponent (n): ");
        int n = scn.nextInt();

        // call the power method to calculate x^n
        int xpn = power(x, n);

        // Print the result
        System.out.printin("Result: + xpn);
    }

    // Method to compute the power using logarithmic time complexity (0(log n))
    public static int power(int x, int n) {