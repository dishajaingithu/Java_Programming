/*
 	============= Java Language ==============

	Iterative Statements / Loops ->
		1) for Loop
			syntax ->       1               2		     4
				for(initialization; condition; increment/decrement/expression){
					      3
					//code or body 
				}

		2) while loop
			
			syntax ->
				initialization
				while(condition){
					//code or body

					increment/decrement/expression
				}

		3) do-while loop -> It Execute at least Once.
			
			syntax ->
				do{
					//code or body
				}while(condition);

*/


// 1) For-Loop ->
// Q1. Print the Sum of 'N' Natural Number
import java.util.Scanner;
class SumOfNaturalNo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the No : ");
		int n = sc.nextInt();

		int sum = 0;

		for(int i=1; i<=n; i++){

			sum += i;
		}

		System.out.println("Sum of Natural No = " + sum);
	}
}
/* Output ->
 	
   	Enter the No : 10
	Sum of Natural No = 55
*/


//Q2. Print the Natural Number in Reverse Order.
class ReverseOrder{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the No : ");
		int n = sc.nextInt();

		for(int i=n; i>=1; i--){

			System.out.print(i + " ");
		}
		System.out.println();
	}
}
/* Output ->

   	Enter the No : 5
	5 4 3 2 1
*/


//Q3. Print the Even Natural Number in given 'N' Natural Number.
class EvenNaturalNo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the No : ");
		int n = sc.nextInt();

		for(int i=n; i>=1; i-=2){

			System.out.print(i + " ");
		}
		System.out.println();
	}
}
/* Output ->

   	Enter the No : 10
	10 8 6 4 2
*/



// 2) While-Loop ->
// Q1. Print the Sum of 'N' Natural Number,where 'n' is the input

class WhileLoopSumOfNaturalNo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the No : ");
		int n = sc.nextInt();

		int i = 1;
		int sum = 0;
		while(i<=n){

			sum += i;
			i++;
		}

		System.out.println("Sum of Natural No = " + sum);
	}
}
/* Output ->
	
   	Enter the No : 10
	Sum of Natural No = 55
*/


// 2) do-while Loop ->
// Q1. Print the Sum of 'N' Natural No.

class DoWhileLoopSum{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the No : ");
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;

		do{
			sum += i;
			i++;
		}while(i<=n);

		System.out.println("Sum of Natural No = " + sum);
	}
}
/* Output ->
	
   	Enter the No : 15
	Sum of Natural No = 120
*/
