
package theLoverChoice;

import java.util.Scanner;

public class evenNo_StartToEnd {
	public static void evenNumbers(int start, int end) {
		if(start % 2 != 0) {
			start++;
		}
		for(int i=start; i <= end; i+=2) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the start number");
		int start = scan.nextInt();
		
		System.out.println("Enter the end number");
		int end = scan.nextInt();
		
		evenNumbers(start,end);

	}

}
