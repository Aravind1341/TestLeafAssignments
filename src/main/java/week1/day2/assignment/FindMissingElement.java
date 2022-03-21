package week1.day2.assignment;

import java.util.Arrays;

public class FindMissingElement {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		for (int i = arr[0]; i < arr.length; i++) {
			int val=arr[i+1]-1;
			if(val!=arr[i]){
				System.out.println("Missing Element is "+val);
				break;
			}

		}
			
	}
	

}
