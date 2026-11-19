import java.util.Scanner;

public class IT26102484Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for four subjects:");
        System.out.print("Enter Subject Mark 1: ");
        int m1 = input.nextInt();
        System.out.print("Enter Subject Mark 2: ");
        int m2 = input.nextInt();
        System.out.print("Enter Subject Mark 3: ");
        int m3 = input.nextInt();
        System.out.print("Enter Subject Mark 4: ");
        int m4 = input.nextInt();

        double average = (m1 + m2 + m3 + m4) / 4.0;

        String grade;
        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println();
        System.out.println("Average is : " + average);
        System.out.println("Overall Grade is : " + grade);
    }
}
