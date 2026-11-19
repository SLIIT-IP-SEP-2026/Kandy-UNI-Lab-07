import java.util.Scanner;

public class IT26102484Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");
            int m1 = input.nextInt();
            int m2 = input.nextInt();
            int m3 = input.nextInt();
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

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();
        }
    }
}
