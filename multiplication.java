import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();

        // Perform multiplication
        int result = num1 * num2 * num3;

        // Print the result
        System.out.println("The result of the multiplication is: " + result);

        scanner.close();
    }
}
