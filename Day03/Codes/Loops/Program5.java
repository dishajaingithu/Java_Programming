/*
 	============= Java Language ==============

	1) Break keyWord -> Used Only in Loops or Switch Statement.
		
		break;
	
	2) Continue KeyWord -> Used Only in Loops. 

	3) Lables
	
*/


// 1) Break Keyword. 
// Q1.Print the first multiple of 5 which is also multiple of 7 using for Loop.
import java.util.Scanner;
class BreakForLoop{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No : ");
		int no = sc.nextInt();

		for(int i=1; i<=no; i++){

			if(i % 5 == 0 && i % 7 == 0){

				System.out.println("Found Ans : " + i);
				break;
			}
		}
	}
}
/* Output ->
	
   	Enter No : 100
	Found Ans : 35
*/


// Q1.Print the first multiple of 5 which is also multiple of 7 using while Loop.
class BreakWhileLoop{

	public static void main(String[] args){
		int i = 1;
		while(true){

			if(i % 5 == 0 && i % 7 == 0){

				System.out.println("Found Ans : " + i);
				break;
			}
			i++;
		}
	}
}
/* Output ->
 	
   	Found Ans : 35
*/


// 2) Continue Keyword. 
// Q1.Print all the values between 1 and 50 except for the multiple of 3.
class Continue{

	public static void main(String[] args){

		for(int i=1; i<=10; i++){

			if(i % 3 == 0){

				continue;
			}

			System.out.println("Found Ans : " + i);
		}
	}
}
/* Output ->
 
   	Found Ans : 1
	Found Ans : 2
	Found Ans : 4
	Found Ans : 5
	Found Ans : 7
	Found Ans : 8
	Found Ans : 10
*/



// 3) Lables. 
class Lable{

	public static void main(String[] args){

		myloop:for(int i=1; i<=10; i++){

			if(i % 3 == 0){

				continue myloop;
			}

			System.out.println("Found Ans : " + i);
		}
	}
}
/* Output ->
 	
   	Found Ans : 1
	Found Ans : 2
	Found Ans : 4
	Found Ans : 5
	Found Ans : 7
	Found Ans : 8
	Found Ans : 10
*/
