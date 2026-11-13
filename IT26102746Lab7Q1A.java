
import java.util.Scanner;

public class IT26102746Lab7Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mark1, mark2, mark3, mark4;
        double average;
        String grade;

        System.out.print("Enter marks for Subject 1: ");
        mark1 = input.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        mark2 = input.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        mark3 = input.nextInt();

        System.out.print("Enter marks for Subject 4: ");
        mark4 = input.nextInt();

        average = (mark1 + mark2 + mark3 + mark4) / 4.0;

        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println("Average Marks: " + average);
        System.out.println("Overall Grade: " + grade);

        input.close();
    }
}
