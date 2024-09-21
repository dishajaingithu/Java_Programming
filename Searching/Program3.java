/*
	Binary Search : Using Recursion

	* Time Complexity : O(log n)
	* Must Condition before using binary search is "Array must be Sorted".
*/

import java.util.Scanner;
class BinarySearch{

	static int binarySearch(int[] arr, int ele, int start, int end){

		if(start <= end && start<=arr.length-1){
			int mid = start + (end - start)/2;
		
		if(arr[mid] == ele)
			return mid;

		if(arr[mid] > ele)
			return binarySearch(arr,ele,start,mid - 1);

		return binarySearch(arr,ele,mid+1,end);
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

                int index = binarySearch(arr,eleSearch,0,arr.length-1);

                if(index != -1){
                        System.out.println(eleSearch + " Found at Index : " + index);
                }else{
                        System.out.println(eleSearch + " is Not Found");
                }
        }
}
