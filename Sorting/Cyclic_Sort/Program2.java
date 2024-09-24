/*
	Q.Sort Colors 
	Given an array nums with n objects colored red, white, or blue, sort them in-place so that 	  objects of the same color are adjacent, with the colors in the order red, white, and blue.
	We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
	You must solve this problem without using the library's sort function.

	Example 1:
	Input: nums = [2,0,2,1,1,0]
	Output: [0,0,1,1,2,2]

	Example 2:
	Input: nums = [2,0,1]
	Output: [0,1,2]
*/
//Way 2 : Using Count Sort
import java.util.Scanner;
class SortColors{

	static void sortColors(int[] arr){
		int[] count = new int[3];

		for(int i=0; i<arr.length; i++){
			count[arr[i]]++;
		}

		int index = 0;
		for(int i=0; i<count[0]; i++){
			arr[index++] = 0;
		}
		for(int i=0; i<count[1]; i++){
			arr[index++] = 1;
		}
		for(int i=0; i<count[2]; i++){
			arr[index++] = 2;
		}
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.print("Enter the Array Elements : ");
		for(int i=0; i<size; i++){

			arr[i] = sc.nextInt();
		}

		sortColors(arr);

		System.out.print("Sorted Colors : ");
		for(int i=0; i<arr.length; i++){

			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
