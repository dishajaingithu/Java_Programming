/*
	Insertion Sort :

	* Consider 1st Element is Always Sorted. 
	* Time Complexity : O(n).
*/
import java.util.Scanner;
class InsertionSort{
	
	static void insertionSort1(int[] arr, int size){

		for(int i=1; i<size; i++){
			int temp = arr[i];
			int j;
			for(j = i-1; j>=0 && temp<arr[j]; j--){
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}	
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

		System.out.print("Array Before Insertion Sort : ");
		for(int i=0; i<size; i++){

			System.out.print(arr[i] + " ");
		}

		System.out.println();

		insertionSort1(arr,size);

		System.out.print("Array After Insertion Sort : ");
		for(int i=0; i<size; i++){

			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}
