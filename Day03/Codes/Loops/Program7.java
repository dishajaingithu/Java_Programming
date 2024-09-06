/*
	Q2.Find the sum of digits in a given Number.
	input - No:12345
	output - 15
*/

import java.util.Scanner;
class SumDigit{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int original_no = num;
		int sum = 0;

		while(num != 0){
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("Sum of Digit of " + original_no + " is : " + sum);
	}
}
/* Output ->
	
   	Enter the Number : 12345
	Sum of Digit of 12345 is : 15
*/
