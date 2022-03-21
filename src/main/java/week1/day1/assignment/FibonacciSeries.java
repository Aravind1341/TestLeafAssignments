package week1.day1.assignment;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int firstNum = 0;
		int secnum = 1;
		int range = 8;
		int sum;
		
//		System.out.println(firstNum);
//		System.out.println(secnum);
		
		for (int i = 1; i<=range; i++) {
			
			sum = firstNum + secnum;
			System.out.println(sum);

			firstNum = secnum;
			secnum = sum;
	
		}
		
	}

}
