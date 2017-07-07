import java.util.*;

public class ExceptionHandling {
	public static void main(String[]args){
		int x=1;
	
		do{
		
		try{
		Scanner input = new Scanner(System.in);
		int m;
		int n;
		int sum;
		System.out.println("Enter the First Number Here: ");
		m= input.nextInt();
		System.out.println("Enter The Second Number Here: ");
		n= input.nextInt();
		sum = m+n;
		System.out.println(sum);
	
		} catch(Exception ex){
			System.out.println("Invalied Entry");
			
		} 
		
		}x=2;	
		
	}while (x==1);
}


