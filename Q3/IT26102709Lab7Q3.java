import java.util.Scanner;

public class IT26102709Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer);
            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char mode = Character.toUpperCase(input.next().charAt(0));

            if (mode == 'C') {
                double discount = bill * 0.05;
                System.out.printf("Discount is : %.2f%n", discount);
                System.out.printf("Amount to be paid: %.2f%n", bill - discount);
            } else if (mode == 'O') {
                System.out.println("No discount applicable");
                System.out.printf("Amount to be paid: %.2f%n", bill);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
            System.out.println();
        }
        input.close();
    }
}