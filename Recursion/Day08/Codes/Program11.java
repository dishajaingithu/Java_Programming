/*
	Q.Finding the GCD/HCF (Greates Common Divisor/Highest Common Factor).

	* Euclid's Algorithm
		
		- The Key idea of Euclid's Algorithm is based on the property
			* GCD(a,b) = GCD(b,a%b)
			* The base case is when b==0,then GCD(a,0) => a
	input : a = 36 , b = 60
	output : 12

	input : a = 5, b = 0
       	output : 5 	
*/
import java.util.Scanner;
class GCD{

	static int gcd(int a, int b){

		if(b == 0){
			return a;
		}

		return gcd(b,a%b);
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the a : ");
		int a = sc.nextInt();

		System.out.print("Enter the b : ");
		int b = sc.nextInt();

		int gcdNo = gcd(a,b);

		System.out.println("GCD of " + a + " and " + b + " is : " + gcdNo);
	}
}
