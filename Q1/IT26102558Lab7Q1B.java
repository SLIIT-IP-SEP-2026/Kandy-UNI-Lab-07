import java.util.Scanner;

public class IT26102558Lab7Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double mark1, mark2, mark3, mark4, average;

        for (int i = 1; i <= 3; i++) {

            System.out.println("Student " + i);

            System.out.print("Enter marks: ");
            mark1 = input.nextDouble();
            mark2 = input.nextDouble();
            mark3 = input.nextDouble();
            mark4 = input.nextDouble();

            average = (mark1 + mark2 + mark3 + mark4) / 4;

            System.out.println("Average is : " + average);

            if (average >= 75) {
                System.out.println("Overall Grade is : Distinction");
            }
            else if (average >= 50) {
                System.out.println("Overall Grade is : Credit");
            }
            else if (average >= 0) {
                System.out.println("Overall Grade is : Fail");
            }
            else {
                System.out.println("Invalid marks!");
            }

            System.out.println();
        }

        input.close();
    }
}
