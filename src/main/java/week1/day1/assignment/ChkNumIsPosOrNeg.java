package week1.day1.assignment;

public class ChkNumIsPosOrNeg {
	
	public static void main(String[] args) {
		
		int input = 0;
		
		if(input<0) {
			System.out.println("Input number is negative = " + input);
		}else if(input>0) {
			System.out.println("Input number is Positive = " + input);
		}else {
			System.out.println("Input number is neither positive nor negative = " + input);
		}
		
	}

}
