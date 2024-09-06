/*
	Q18.Print the following pattern

			*
			*
	*	*	*	*	*
			*
			*

*/

import java.util.Scanner;
class PlusPattern{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Row Value : ");
		int row = sc.nextInt();

		for(int i=0; i<row; i++){

			for(int j=0; j<row; j++){

				if(i==2 || j==2){
					System.out.print("*\t");
				}else{
					System.out.print(" \t");
				}
			}
			System.out.println();
		}
	}
}
