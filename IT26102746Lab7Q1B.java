
import java.util.Scanner;

public class IT26102746Lab7Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mark1, mark2, mark3, mark4;
        double average;
        String grade;

        for (int student = 1; student <= 3; student++) {

            System.out.println("Student " + student);

            System.out.print("Enter four subject marks separated by spaces: ");

            mark1 = input.nextInt();
            mark2 = input.nextInt();
            mark3 = input.nextInt();
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
            System.out.println();
        }

        input.close();
    }
}
