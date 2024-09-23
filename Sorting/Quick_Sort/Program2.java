/*
	Quick Sort :

	WAP to find the kth Largest Element in Array.
*/
import java.util.Scanner;
class QuickSort{

	static void quickSort(int[] arr, int sI, int eI){
		if(sI < eI){
			int pivot = partition(arr,sI,eI);
			quickSort(arr,sI,pivot-1);
			quickSort(arr,pivot+1,eI);
		}
	}

	static int partition(int[] arr, int sI, int eI){

		int pivotEle = arr[eI];
		int index = (sI - 1);
		for(int i=sI; i<eI; i++){

			if(arr[i] <= pivotEle){
				index++;
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			
			}
		}

		int temp = arr[index+1];
		arr[index+1] = arr[eI];
		arr[eI] = temp;
		return index+1;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.print("Enter array Elements : ");
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();

		}
		System.out.print("Array Before Sort : ");
		for(int i=0; i<size; i++){
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		System.out.print("Enter kth Largest Element : ");
		int k = sc.nextInt();

		quickSort(arr,0,size-1);

		System.out.print("Array After Sort : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println(k + "th Largest ELement is array is : " + arr[arr.length-k]);
	}
}
