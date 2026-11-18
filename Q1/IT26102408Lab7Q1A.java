import java.util.Scanner;

public class IT26102408Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for four subjects:");
        System.out.print("Enter Subject Mark 1: ");
        double m1 = input.nextDouble();
        System.out.print("Enter Subject Mark 2: ");
        double m2 = input.nextDouble();
        System.out.print("Enter Subject Mark 3: ");
        double m3 = input.nextDouble();
        System.out.print("Enter Subject Mark 4: ");
        double m4 = input.nextDouble();

        double average = (m1 + m2 + m3 + m4) / 4;

        System.out.println();
        System.out.println("Average is : " + average);

        if (average >= 75) {
            System.out.println("Overall Grade is : Distinction");
        } else if (average >= 50) {
            System.out.println("Overall Grade is : Credit");
        } else {
            System.out.println("Overall Grade is : Fail");
        }
    }
}
