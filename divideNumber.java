package theLoverChoice;

import java.util.Scanner;

public class divideNumber {
	
//	F1 In this function we return some value "Here return type is int".
	public static int divNum(int numi, int deno) {
		if(deno == 0) {
			return Integer.MIN_VALUE;
		}
		return numi / deno;
	}
	
//	F2 In this function we not return any value "return type is void".
	public static void printDivResult(int numi, int deno){
		if(deno == 0) {
			System.out.println("Divison by 0 is not allowed");
			return;
		}
		System.out.println(numi / deno);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numi = scan.nextInt();
		int deno = scan.nextInt();
		
//		Calling first function "return type int".
		System.out.println("\n First Function Result");
		int result = divNum(numi,deno);
		System.out.println(result);
		
//	Calling Second function "return type void".	
		System.out.println("\n Second Function Result");
		printDivResult(numi, deno);

	}

}
