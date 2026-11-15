import java.util.Scanner;

public class IT26102558Lab7Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double mark1, mark2, mark3, mark4, average;

        System.out.print("Enter Subject Mark 1: ");
        mark1 = input.nextDouble();

        System.out.print("Enter Subject Mark 2: ");
        mark2 = input.nextDouble();

        System.out.print("Enter Subject Mark 3: ");
        mark3 = input.nextDouble();

        System.out.print("Enter Subject Mark 4: ");
        mark4 = input.nextDouble();

        average = (mark1 + mark2 + mark3 + mark4) / 4;

        System.out.println("Average is: " + average);

        if (average >= 75 && average <= 100) {
            System.out.println("Overall Grade: Distinction");
        }
        else if (average >= 50 && average < 75) {
            System.out.println("Overall Grade: Credit");
        }
        else if (average >= 0 && average < 50) {
            System.out.println("Overall Grade: Fail");
        }
        else {
            System.out.println("Invalid marks!");
        }

        input.close();
    }
}