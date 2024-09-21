/*
	Q.Check the Given array elements have the Palindrome or Not.
*/

import java.util.Scanner;
class PalindromArray{
	static boolean isPalindrome(int[] arr, int s1,int e1){
		
		if(s1 >= e1){
			return true;
		}

		return arr[s1] == arr[e1] && isPalindrome(arr,s1+1,e1-1);

	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.print("Enter Array Elements : ");
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}

		if(isPalindrome(arr,0,size-1)){
			System.out.println("Palindrome Array");
		}else{
			System.out.println("Not Palindrome Array");
		}
	}
}
