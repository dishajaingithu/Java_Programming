/*
	Q7.Print the following pattern
	
		*	*	*	*	*	*
		*	*	*	*	*	*
		*	*	*	*	*	*
*/

import java.util.Scanner;
class RectancleStarPattern{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Row Value : ");
		int row = sc.nextInt();

		System.out.print("Enter Column Value : ");
		int col = sc.nextInt();

		for(int i=1; i<=row; i++){

			for(int j=1; j<=col; j++){

				System.out.print("*\t");
			}
			System.out.println();
		}
	}
}
