/*
	Binary Search :

	* Time Complexity : O(log n)
	* Must Condition before using binary search is "Array must be Sorted".
*/

import java.util.Scanner;
class BinarySearch{

	static int binarySearch(int[] arr, int ele){

		int start = 0;
		int end = arr.length - 1;

		while(start <= end){
			int mid = (start+end)/2;

			if(arr[mid] == ele){
				return mid;
			}

			if(arr[mid] < ele)
				start = mid + 1;
			else 
				end = mid - 1;
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

                int index = binarySearch(arr,eleSearch);

                if(index != -1){
                        System.out.println(eleSearch + " Found at Index : " + index);
                }else{
                        System.out.println(eleSearch + " is Not Found");
                }
        }
}
