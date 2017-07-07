import java.util.Random;
public class Randoms {
	public static void main(String[] args) {
		Random dice =new Random();
		int number;
		for (int counter =1; counter<=20; counter++ ){
			number = 1+dice.nextInt(6);
			System.out.print(number+" ");
		}

	}

}
