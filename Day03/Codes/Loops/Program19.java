/*
	Q14.Print the following pattern
	
	1	2	1	2	1	2	
	2	1	2	1	2	1	
	1	2	1	2	1	2	
	2	1	2	1	2	1
*/

import java.util.Scanner;
class NumRectanglePattern{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Row Value : ");
		int row = sc.nextInt();

		System.out.print("Enter Column Value : ");
		int col = sc.nextInt();

		for(int i=1; i<=row; i++){

			for(int j=1; j<=col; j++){

				if((i+j)%2 == 0){
					System.out.print("1\t");
				}else{
					System.out.print("2\t");
				}
			}
			System.out.println();
		}
	}
}
