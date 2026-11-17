import java.util.Scanner;

public class IT26101644Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer);
            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char mode = input.next().charAt(0);

            if (mode == 'C' || mode == 'c') {
                double discount = bill * 5 / 100;
                double amount = bill - discount;
                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amount);
            } else if (mode == 'O' || mode == 'o') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + bill);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
            System.out.println();
        }
    }
}
