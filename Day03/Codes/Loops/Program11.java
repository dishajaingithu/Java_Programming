/*
	Q6.Given 2 numbers a and b.find 'a' raise to the power 'b'.
*/

import java.util.Scanner;
class RaisePower{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Value of a : ");
		int a = sc.nextInt();

		System.out.print("Enter the Value of b : ");
		int b = sc.nextInt();

		int ans = 1;

		for(int i=1; i<=b; i++){

			ans = ans * a;
		}

		System.out.println("Ans : " + ans);
	}
}

/* Output ->
	
   	Enter the Value of a : 3
	Enter the Value of b : 2
	Ans : 9
*/
