package week1.day1.assignment;


public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int input = 37;
		boolean flag = true;
		
		for (int i = 2; i < input; i++) {
			if (input%i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(input + " is a Prime Number");
		}else {
			System.out.println(input + " is not a Prime Number");
		}

		
	}
		

}
