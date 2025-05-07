import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Display greeting message
        System.out.print("Hello! Please enter your name: ");

        // Read user input
        String name = scanner.nextLine();

        // Display personalized greeting
        System.out.println("Hello, " + name + "! Welcome!");

        // Close the scanner
        scanner.close();
    }
}

