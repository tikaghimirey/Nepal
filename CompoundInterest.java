
public class CompoundInterest {

	public static void main(String[] args) {
		double P = 165000;
		double A;
		double R = .0372/12;
		for (double Month =1;Month <=360; Month++ ){
			
			A= P*Math.pow(1+R, Month);
			System.out.println(Month + "    "+ A);
		
		}
	

	}

}
