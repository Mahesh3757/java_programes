import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for multiplication table: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication Table for " + number + ":");

        // Print the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
