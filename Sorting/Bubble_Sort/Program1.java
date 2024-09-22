/*
	Bubble Sort :
	
	* Maximum Elements goes to the last Index of Array
	* Worst Case Time Complexity is
	* O(n^2).
	
	arr[] = {1,7,10,6,14,9}

	Step 1 : |1|7|6|10|14|9|
		 |1|6|7|10|14|9|
		 |1|6|7|10|14|9|
		 |1|6|7|10|9|14|
	
	Step 2 : |1|6|7|9|10|14|

*/
import java.util.Scanner;
	
class BubbleSort{
	//Way 1 : Time Complexity is O(n^2)
	static void bubbleSort1(int[] arr, int size){
		for(int i=0; i<size-1; i++){
			for(int j=0; j<size-i-1; j++){

				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	//Way 2 : Time Complexity : if is Already Sorted O(n)
	static void bubbleSort2(int[] arr, int size){
		for(int i=1; i<size; i++){
			boolean swap = false;
			for(int j=0; j<size-i; j++){

				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}

			if(swap == false)
				break;
		}
	}

	//Way 3 : Time Complexity : O(n)
	static void bubbleSort3(int[] arr, int size){
		int flag = 0;
		if(size == 1){
			return;
		}

		for(int i=0; i<size-1; i++){

			if(arr[i] > arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;

				flag = 1;
			}
		}
		if(flag == 0){
			return;
		}

		bubbleSort3(arr,size-1);
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


		System.out.print("Array Before Sort : ");
		for(int i=0; i<size; i++){

			System.out.print(arr[i] + " ");
		}

		System.out.println();

		//bubbleSort1(arr,size);
		//bubbleSort2(arr,size);
		bubbleSort3(arr,size);

		System.out.print("Array After Bubble Sort : ");
		for(int i=0; i<size; i++){

			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}
