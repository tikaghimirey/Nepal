import java.util.Scanner;
public class Play {

	public static void main(String[] args) {
		int x=1;
		do{
			
		try{
		int a ;
				int b ;
				Scanner input = new Scanner(System.in);
				
				System.out.println("Enter The First Number");
				a= input.nextInt();
				System.out.println("Enter The Second Number");
				b= input.nextInt();
				int  c = a/b;
				System.out.println("The Result = "+c);
				x=2;
		}
		catch (Exception e){
			System.out.println("Invalid Entry! ");
			
		}
		} while (x==1);
	}

}

