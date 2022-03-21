package week1.day1.assignment;

public class Factorial {
	
	public static void main(String[] args) {
		
		int input = 3;
		int a = 1;
		
		for (int i = 1; i <=input; i++) {
			a = a * i;
		}
		
		System.out.println("The Factorial of "+ input + " is = "+ a);
		
	}

}
