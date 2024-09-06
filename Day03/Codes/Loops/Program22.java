/*
	Q17.Print the following pattern

			*
		*	*
	*	*	*
*	*	*	*

*/

import java.util.Scanner;
class TrianglePattern{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Row Value : ");
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){

			for(int j=1; j<=(row-i); j++){
				System.out.print(" \t");
			}
			for(int k=1; k<=i; k++){
				System.out.print("*\t");
			}
			System.out.println();
		}
	}
}
