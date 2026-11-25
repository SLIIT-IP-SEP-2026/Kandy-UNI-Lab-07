import java.util.Scanner;
public class IT26102304Lab7Q1B{
	public static void main(String[]args){
		
		int m1 , m2 , m3 , m4 , st=1 ;
		double avg ;
		String grade  ;
		
		
		while(st <= 3){
			
			System.out.println("Student" +st);
		
		 Scanner input = new Scanner(System.in);	
		
		System.out.println("Enter marks for four subjects:");
		
		System.out.println("Enter subject mark 1:");
		m1 = input.nextInt();
		
		System.out.println("Enter subject mark 2:");
		m2 = input.nextInt();
		
		System.out.println("Enter subject mark 3:");
		m3 = input.nextInt();
		
		System.out.println("Enter subject mark 4:");
		m4 = input.nextInt();
		
		avg = (m1 + m2 + m3 + m4)/4.0 ;
		
		if(avg >= 75)
		{
			grade = "Distinction";
		}
		else if(avg >= 50 )
		{
			grade = "Credit";
		}
		else
		{
			grade = "Fail";
		}
		
		System.out.println("Average is:" +avg);
		System.out.println("Ovarall Grade is:" +grade);
		
		
		st++ ; }
	}
}