import java.util.Scanner;

public class IT26102304Lab7Q3{
	public static void main(String[]args){
		
	Scanner input = new Scanner(System.in);
    int amount ;
	double paid , dis=0.05 ,discount  ;
	char mode;
	
	for(int j=1 ; j<=5 ; j++)
	{
	System.out.println("customer" +j);
	
	System.out.println("Enter total bill amount :");
	amount = input.nextInt();
	
	System.out.println("Enter mode of payment(C for cash,O for other)");
	mode = input.next().charAt(0);
	
	discount = (double) amount * dis;
	paid = (double) amount - discount;
	
	if(mode=='C' || mode=='c' )
	{
		System.out.println("Discount is :" +discount);
		System.out.println("Amount to be paid :" +paid); 
	}
	else if(mode=='O' || mode=='o')
	{
		System.out.println("No discount applicable");
		System.out.println("Amount to be paid :" +(double)amount); 
		
	}
	else
	{
		System.out.println("Payment mode is not valid" ); 
	}		
	System.out.println(" ");
	}
		
	}
}