/*
 	Q5.Print the first 'N' Factorial Numbers
*/

import java.util.Scanner;
class FactorialNo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No : ");
		int no = sc.nextInt();

		int fact = 1;
		for(int i=1; i<=no; i++){

			fact = fact * i;
			System.out.println(i + " : "+ fact);
		}
	}
}

/* Output -> 
	
   	Enter No : 5
	1 : 1
	2 : 2
	3 : 6
	4 : 24
	5 : 120
*/
