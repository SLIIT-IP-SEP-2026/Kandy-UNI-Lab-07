import java.util.Scanner;

public class IT26102558Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double bill, discount, amount;
        char payment;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Customer " + i);

            System.out.print("Enter total bill amount: ");
            bill = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            payment = input.next().charAt(0);

            while (payment != 'C' && payment != 'c' &&
                   payment != 'O' && payment != 'o') {

                System.out.println("Payment Mode is Not Valid");

                System.out.print("Enter mode of payment (C for cash, O for other): ");
                payment = input.next().charAt(0);
            }

            if (payment == 'C' || payment == 'c') {

                discount = bill * 0.05;
                System.out.println("Discount is : " + discount);

            } else {

                discount = 0;
                System.out.println("No discount applicable");
            }

            amount = bill - discount;

            System.out.println("Amount to be paid: " + amount);
            System.out.println();
        }

        input.close();
    }
}
