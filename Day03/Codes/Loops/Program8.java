/*
	Q3.Reverse the digits of Number.
	input - No:12345
	output - 54321
*/

import java.util.Scanner;
class ReverseDigit{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int original_no = num;
		int rev = 0;

		while(num != 0){
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("Reverse of Digit of " + original_no + " is : " + rev);
	}
}
/* Output ->
	
   	Enter the Number : 12345
	Reverse of Digit of 12345 is : 54321
*/
