/*
	Q.Climbing Stairs.

	1) input n = 2
	   output : 2
	   explanation : There are 2 ways to climb to the top
	   1. 1 step + 1step
	   2. 2 step

	2) input n = 3
	   output : 3
	   explanation : There are 3 ways to climb to the top
	   1. 1 step + 1 step + 1 step
	   2. 1 step + 2 step
	   3. 2 step + 1 step 
*/
import java.util.Scanner;
class ClimbingStairs{

	static int climbStairs(int n){
		if(n == 0 || n == 1)
			return 1;

		return climbStairs(n-1) + climbStairs(n-2);
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();

		int steps = climbStairs(n);

		System.out.println("Climbing Stairs: " + steps);
	}
}
