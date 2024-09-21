/*
	Q.Find the nth Fibonnaci Number
	
	0 1 1 2 3 5 8 13...

	1) input n = 2
	   output = 1
	   explanation = f(2) = f(1) + f(0) = 1

        2) input n = 3
           output = 2
           explanation = f(3) = f(2) + f(1) = 2

	3) input n = 4
           output = 3
           explanation = f(4) = f(3) + f(2) = 3    	   
*/
import java.util.Scanner;
class FibonnaciNum{

	static int fib(int n){
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;

		return fib(n-1) + fib(n-2);
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();

		int fibNo = fib(n);

		System.out.println("The Fibobbani number of " + n + " is : " + fibNo);
	}
}
