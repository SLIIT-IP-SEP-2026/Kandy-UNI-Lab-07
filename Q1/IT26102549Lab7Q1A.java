import java.util.Scanner;

public class IT26102549Lab7Q1A {
	
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        System.out.println("Enter marks for four subjects:");
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter Subject Mark " + i + ": ");
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

        System.out.println("\nAverage is : " + average);
        System.out.println("Overall Grade is : " + grade);
        
        scanner.close();
    }
}
