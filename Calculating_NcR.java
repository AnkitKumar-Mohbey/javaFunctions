package ninjas;
import java.util.Scanner;
public class Calculating_NcR {
	
	 public static int factorial(int num) {
		 int fact = 1;
		 for(int i = 1; i <= num; i++) {
			 fact = fact * i;
		 }
		 return fact;
	 }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int n = scan.nextInt();
		int r = scan.nextInt();
		
		int factN = factorial(n);
		int factR = factorial(r);
		int factNR = factorial(n-r);
//		
//		int factN = 1;
//		for(int i = 1; i <= n; i++) {
//			factN = factN * i;		
//		}
//		
//		int factR = 1;
//		for(int i = 1; i <= r; i++) {
//			factR = factR * i;
//		}
//		
//		int factNR = 1;
//		for (int i = 1 ; i <= n-r; i++) {
//			factNR = factNR * i;
//		}
		
		int result = factN / (factR * factNR);
		System.out.println(result);
	}

}
