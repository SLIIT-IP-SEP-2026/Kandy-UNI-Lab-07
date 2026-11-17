import java.util.Scanner;

public class IT26102709Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        System.out.println("Enter marks for four subjects:");
        for (int subject = 1; subject <= 4; subject++) {
            System.out.print("Enter Subject Mark " + subject + ": ");
            total += input.nextInt();
        }
        double average = total / 4.0;
        System.out.printf("\nAverage is : %.1f%n", average);
        System.out.println("Overall Grade is : " + gradeFor(average));
        input.close();
    }
    private static String gradeFor(double average) {
        if (average >= 75) return "Distinction";
        if (average >= 55) return "Credit";
        if (average >= 40) return "Pass";
        return "Fail";
    }
}