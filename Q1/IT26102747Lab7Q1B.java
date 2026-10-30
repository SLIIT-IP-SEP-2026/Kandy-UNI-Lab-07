import java.util.Scanner;

 public class IT26102747Lab7Q1B {
	 public static void main(String[] args) {
		 
		 Scanner input = new Scanner (System.in);
		 
		 for (int i = 1; i <= 3; i++) {
			 
			 System.out.println("Student" + i);
			 
			 System.out.println("Enter for subjects marks : ");
			 
			int m1 = input.nextInt();
            int m2 = input.nextInt();
            int m3 = input.nextInt();
            int m4 = input.nextInt();

            double average = (m1 + m2 + m3 + m4) / 4.0;

            System.out.println("Average: " + average);

            if (average >= 75) {
                System.out.println("Grade: Distinction");
            }
            else if (average >= 50) {
                System.out.println("Grade: Credit");
            }
            else {
                System.out.println("Grade: Fail");
            }

            System.out.println();
        }

        input.close();
    }
}