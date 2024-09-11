/*
	3) Print the Factorial of Number using Recursion.
*/

import java.util.Scanner;
class PrintFactorial{

	static int printFactorial(int num){

		if(num == 0 || num == 1){
			return 1;
		}

		return num * printFactorial(num-1);
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();

		int factNum = printFactorial(num);

		System.out.println("Factorial of " + num + " is : " + factNum);
	}
}
/* Output 

Enter the Number : 5
Factorial of 5 is : 120
*/
