import java.util.Scanner;
public class Bhutan{
public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number");
	int x= input.nextInt();
	
	for(int i=x;i>=1; i--){
		for (int a = 1;a<=i;a++){
			System.out.print("*");
		}
	System.out.println();
	}
	for(int i=2; i<=x; i++){
		for(int j=1;j<=i; j++){
			System.out.print("*");
		}
		System.out.println();
	}
	
	}
}