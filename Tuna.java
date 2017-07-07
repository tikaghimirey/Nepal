public class Tuna{
	public static void main(String[] args){
		int age = 82;
		if (age <= 50){
			System.out.println("You are young");
		}
		else {
			System.out.println("You are old");
			if (age<70){
				System.out.println("But we will consider you.");
			}
			else {
				System.out.println("And I further see that");
			
			if (age > 80){
				System.out.println("You are Really old.");
			}
			else {
				System.out.println("You are too old for the reconsideratin.");
			}
			}
		}
	}
}