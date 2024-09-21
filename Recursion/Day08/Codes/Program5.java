/*
	Q.Power Function.

	1) input x = 2 , n = 10
	   output = 1024.0000
*/
import java.util.Scanner;
class PowerFunction{

	static double myPow(double x, int n){
		if(n == 0)
			return 1;

		if(n == Integer.MIN_VALUE){
			x = 1/x;
			return x * myPow(x,Integer.MAX_VALUE);
		}

		//Handle Negative No.
		if(n < 0){
			x = 1/x;
			n = -n;
		}

		double half = myPow(x,n/2);

		if(n % 2 == 0){
			return half*half;
		}else{
			return half*half*x;
		}
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter X : ");
		double x = sc.nextInt();
		System.out.print("Enter Number : ");
		int n = sc.nextInt();

		double powNo = myPow(x,n);

		System.out.println("x^n : " + powNo);
	}
}
