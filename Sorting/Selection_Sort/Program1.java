/*
	Selection Sort :

	* Smallest Element place on Proper Place.
	* Time Complexity : O(n^2).
	* Use Case -> When array size is Small.
	* arr[] = |64|25|12|22|11|
	
	Step 1 - i=0 -> |11|25|12|22|64|

	Step 2 - i=1 -> |11|12|25|22|64|

	Step 3 - i=2 -> |11|12|22|25|64|

	Step 4 - i=3 -> |11|12|22|25|64|

	Total No of Rounds/Steps = (n-1) 
*/
import java.util.Scanner;
class SelectionSort{
	static int i=0;

	//Way 1 : Without Using Recursion 
	static void selectionSort1(int[] arr, int size){
		for(int i=0; i<size-1; i++){

			int minIndex = i;
			for(int j=i+1; j<size; j++){

				if(arr[minIndex] > arr[j])
					minIndex = j;
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	
	//Way 2 : Using Recursion
	static void selectionSort2(int[] arr, int size){
		int flag = 0;
		if(i == size)
			return;

		for(int j=i+1; j<size; j++){

			if(arr[i] > arr[j]){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				flag = 1;
			}
		}
		i++;
		if(flag == 0)
			return;
		selectionSort2(arr,size);
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

		System.out.print("Array Before Selection Sort : ");
		for(int i=0; i<size; i++){

			System.out.print(arr[i] + " ");
		}

		System.out.println();

		//selectionSort1(arr,size);
		selectionSort2(arr,size);

		System.out.print("Array After Selection Sort : ");
		for(int i=0; i<size; i++){

			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}
