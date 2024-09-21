/*
	Linear Search :

	* Time Complexity : O(n)
*/

import java.util.Scanner;
class LinearSearch{

	static int linearSearch1(int[] arr, int ele){

		for(int i=0; i<arr.length; i++){

			if(arr[i] == ele){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.print("Enter Array Elements : ");
		for(int i=0; i<size; i++){

			arr[i] = sc.nextInt();
		}

		System.out.print("Enter element to search : ");
		int eleSearch = sc.nextInt();

		int index = linearSearch1(arr,eleSearch);

		if(index != -1){
			System.out.println(eleSearch + " Found at Index : " + index);
		}else{
			System.out.println(eleSearch + " is Not Found");
		}
	}
}
