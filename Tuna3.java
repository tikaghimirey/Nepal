import java.util.Scanner;
public class Tuna3 {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
int total = 0;
int grade;
int counter =0 ;
int average;
while(counter<10){
	grade = input.nextInt();
	total = total + grade;
	counter++;
}
average = total/10;	
System.out.println("The average = " + average);
	}

}
