import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner in = new Scanner(System.in);

        // Define variables
        String choice = "";

        // Prompt user with menu choices
        System.out.println("Choose your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your choice (D/R/I): ");

        choice = in.nextLine();

        // Use cascaded if structure to determine output
        if (choice.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (choice.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (choice.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get an Other.");
        }
    }
}