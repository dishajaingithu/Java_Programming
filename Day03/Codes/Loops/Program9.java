/*
	Q4.Find the Sum of the following Series.
	s = 1-2+3-4...n
	output - 54321
*/

import java.util.Scanner;
class SeriesSum{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int i = 1;
		int ans = 0;

		while(i<= num){
			if(i%2==0){
				ans = ans - i;
			}else{
				ans = ans + i;
			}
			i++;
		}
		System.out.println(ans);
	}
}
/* Output ->
	
   	Enter the Number : 5
	3
*/
