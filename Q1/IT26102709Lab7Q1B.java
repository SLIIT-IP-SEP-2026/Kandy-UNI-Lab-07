import java.util.Scanner;

public class IT26102709Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");
            int total = 0;
            for (int subject = 0; subject < 4; subject++) total += input.nextInt();
            double average = total / 4.0;
            System.out.printf("Average is : %.2f%n", average);
            System.out.println("Overall Grade is : " + gradeFor(average));
            System.out.println();
        }
        input.close();
    }
    private static String gradeFor(double average) {
        if (average >= 75) return "Distinction";
        if (average >= 55) return "Credit";
        if (average >= 40) return "Pass";
        return "Fail";
    }
}