import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;

        while (true) {
            System.out.print("Enter temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid numeric value.");
                scanner.nextLine();
            }
        }

        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println("Equivalent temperature in Fahrenheit: " + fahrenheit);
    }
}
