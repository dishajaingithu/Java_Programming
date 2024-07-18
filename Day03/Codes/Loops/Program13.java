/*
	Q8.Print the following pattern
	
		*	*	*	*	*	*
		*					*
		*					*
		*	*	*	*	*	*
*/

import java.util.Scanner;
class RectancleBlankPattern{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Row Value : ");
		int row = sc.nextInt();

		System.out.print("Enter Column Value : ");
		int col = sc.nextInt();

		for(int i=1; i<=row; i++){

			for(int j=1; j<=col; j++){

				if(i==1 || i == row || j==1 || j == col){
			
					System.out.print("*\t");
				}else{
					System.out.print(" \t");
				}
			}
			System.out.println();
		}
	}
}
