import java.util.Scanner;

public class IT26102471Lab7Q1a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for four subjects:");
        System.out.print("Enter Subject Mark 1: ");
        double mark1 = input.nextDouble();
        System.out.print("Enter Subject Mark 2: ");
        double mark2 = input.nextDouble();
        System.out.print("Enter Subject Mark 3: ");
        double mark3 = input.nextDouble();
        System.out.print("Enter Subject Mark 4: ");
        double mark4 = input.nextDouble();

        double average = (mark1 + mark2 + mark3 + mark4) / 4;

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