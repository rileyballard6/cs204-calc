import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            String[] parts = command.split(" ");

            if (parts.length < 2) {
                System.out.println("Invalid command format.");
                continue;
            }

            String operation = parts[0];

            try {
                switch (operation) {
                    case "add":
                        System.out.println(calculator.add(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
                        break;
                    case "subtract":
                        System.out.println(calculator.subtract(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
                        break;
                    case "multiply":
                        System.out.println(calculator.multiply(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
                        break;
                    case "divide":
                        System.out.println(calculator.divide(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
                        break;
                    case "fibonacci":
                        System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(parts[1])));
                        break;
                    case "binary":
                        System.out.println(calculator.intToBinaryNumber(Integer.parseInt(parts[1])));
                        break;
                    case "exit":
                        System.out.println("Exiting program...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Unknown command.");
                }
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid input format. Please enter numbers correctly.");
            } catch (ArithmeticException e) {
                System.out.println("Math error: " + e.getMessage());
            }
        }
    }
}
