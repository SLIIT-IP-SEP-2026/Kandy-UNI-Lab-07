import java.util.Scanner;

public class IT26101292Lab7Q1B{
  public static void main(String[] args){
	int mark1,mark2,mark3,mark4,studentCount=0;
	double avrg;
	String grd;
	
	Scanner input=new Scanner(System.in);
	while (studentCount<=3){
	
	System.out.println("Student" +studentCount ":");

	
	System.out.println("Enter subject mark:");
	mark1=input.nextInt();
	mark2=input.nextInt();
	mark3=input.nextInt();
	mark4=input.nextInt();
	
	avrg=(mark1+mark2+mark3+mark4)/4.0;
	
	
	if(avrg>=75){
	grd="Distinction";}
	else if(avrg>=50){
	grd="Credit";}
	else{
	grd="Fail";}
	
	System.out.println("Average is :" +avrg);
	System.out.println("Overall Grade is :" +grd);
	
	studentCount++;
	}
	
	
  }
}
	
	
	
	
	