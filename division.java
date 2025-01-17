import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the third number:");
        double num3 = scanner.nextDouble();

        // Check for division by zero
        if (num2 == 0 || num3 == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            // Perform division
            double result = num1 / num2 / num3;

            // Print the result
            System.out.println("The result of the division is: " + result);
        }

        scanner.close();
    }
}
