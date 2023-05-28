import java.util.Scanner;

public class a1q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean quit = false;

        while (!quit) {
            System.out.println("Enter a command (if, switch, for, while, do-while) or 'q' to quit: ");
            input = scanner.nextLine();

            switch (input) {
                case "if":
                    System.out.println("The 'if' statement is used to specify a block of code to be executed if a condition is true.");
                    break;
                case "switch":
                    System.out.println("The 'switch' statement is used to select one of many code blocks to be executed.");
                    break;
                case "for":
                    System.out.println("The 'for' loop is used when you know how many times you want to iterate through a block of code.");
                    break;
                case "while":
                    System.out.println("The 'while' loop is used when you want to repeat a block of code an unknown number of times until a condition is met.");
                    break;
                case "do-while":
                    System.out.println("The 'do-while' loop is similar to the 'while' loop but the code block will always be executed at least once.");
                    break;
                case "q":
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
        scanner.close();
    }
}