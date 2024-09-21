/*
	Q.Check the Given String is Palindrome or Not.

	Condition :
	
	1) Only Smaller Coins Put Over the Bigger One.
	2) At a time only one coin can be moved.
*/
import java.util.Scanner;
class TowerOfHanoi{

	static int towerOfHanoi(int n, char S, char D, char A){

		if(n == 0 || n == 1){
			return n;
		}

		return towerOfHanoi(n-1,'S','A','D') + 1 + towerOfHanoi(n-1,'A','D','S');
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the n : ");
		int n = sc.nextInt();

		int moves = towerOfHanoi(n,'S','D','A');

		System.out.println("Number of Moves for " + n + " is : " + moves);
	}
}
