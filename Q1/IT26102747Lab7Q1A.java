import java.util.Scanner;

   public class IT26102747Lab7Q1A {
     public static void main (String[] args) {
		 
		 Scanner input = new Scanner(System.in);
		 
		 int mark1,mark2,mark3,mark4;
		 double average;
		 
		 System.out.println("Enter subject 1 marks : ");
		 mark1 = input.nextInt();
		 
		 System.out.println("Enter subject 2 marks : ");
		 mark2 = input.nextInt();
		 
		 System.out.println("Enter subject 3 marks : ");
		 mark3 = input.nextInt();
		 
		 System.out.println("Enter subject 4 marks : ");
		 mark4 = input.nextInt();
		 
		 average = (mark1 + mark2 + mark3 + mark4) / 4.0;
		 
		 System.out.println("Average" + average);
		 
		 if (average >=75) {
			 System.out.println("Grade : Distinction");
		 }
			 
		 else if (average >=50) {
			System.out.println("Grade : Credit");
		 }
			
		 else {
			 System.out.println("Grade : Fail");
		 }
		 
		 input.close();
		
	 }
   }
			 
			 
			 
			 
		 
			
		 
			
		
		 
		 
		 
		 
		 
		 
		
		
	  
	  