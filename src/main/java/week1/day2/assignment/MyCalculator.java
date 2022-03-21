package week1.day2.assignment;

public class MyCalculator extends Calculator{
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(2, 5, 12));
		System.out.println(cal.sub(6, 3));
		System.out.println(cal.mul(1.23, 2.5));
		System.out.println(cal.divide(12f, 1.5f));
		
	}

}
