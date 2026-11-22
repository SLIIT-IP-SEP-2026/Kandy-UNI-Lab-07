import java.util.Scanner;

public class IT26102471Lab7Q1b{
	public static void main(String[]args){
		int Student_Count=1;
		double Mark1,Mark2,Mark3,Mark4,Average;
		String grade;
		
		Scanner input=new Scanner(System.in);
		while(Student_Count<=3){
			System.out.println("student "+Student_Count);
			
			System.out.print("Enter marks: ");
			Mark1=input.nextDouble();
			Mark2=input.nextDouble();
			Mark3=input.nextDouble();
		    Mark4=input.nextDouble();
			
			Average=(Mark1 + Mark2 + Mark3 + Mark4)/4.0;
			System.out.println("Average is : "+Average);
			
			if(Average>=75){
				grade="Distinction";
			}
			else if(Average>=50){
				grade="Credit";
			}
			else {
				grade="Fail";
			}
			
			System.out.println("Overall Grade is :"+grade);
			System.out.println();
			
			Student_Count++;
		
	    }
	}
}

	
			
		