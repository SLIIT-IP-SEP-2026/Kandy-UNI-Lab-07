import java.util.Scanner;

public class IT26102549Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");
            
            double total = 0;
            for (int subject = 1; subject <= 4; subject++) {
                total += scanner.nextDouble();
            }

            double average = total / 4.0;
            String grade;

            if (average >= 75 && average <= 100) {
                grade = "Distinction";
            } else if (average >= 50 && average < 75) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade + "\n");
        }

        scanner.close();
    }
}
