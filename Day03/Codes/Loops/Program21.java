/*
	Q16.Print the following pattern
	
			1	
		1	2	1	
	1	2	3	2	1	
1	2	3	4	3	2	1

*/

import java.util.Scanner;
class NumPyramidPattern{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Row Value : ");
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){

			for(int j=1; j<=(row-i); j++){
				System.out.print(" \t");
			}
			for(int k=1; k<=i; k++){
				System.out.print(k+"\t");
			}
			for(int l=i-1; l>=1; l--){
				System.out.print(l+"\t");
			}
			System.out.println();
		}
	}
}
