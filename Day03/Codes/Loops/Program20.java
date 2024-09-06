/*
	Q15.Print the following pattern
	
	1	
	1	2		
	1	2	3		
	1	2	3	4	
*/

import java.util.Scanner;
class NumTrianglePattern{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Row Value : ");
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){

			for(int j=1; j<=i; j++){

				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
