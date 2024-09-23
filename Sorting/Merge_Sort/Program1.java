/*
	Merge Sort :

	* Algorithm based on "Divide and Conqure".
	* Time Complexity : O(nlogn).
*/
import java.util.Scanner;
class MergeSort{

	static void mergeSort(int[] arr, int startIndex, int endIndex){
		
		if(startIndex < endIndex){

			int mid = startIndex + (endIndex-startIndex)/2;
			mergeSort(arr,startIndex,mid);
			mergeSort(arr,mid+1,endIndex);
			merge(arr,startIndex,mid,endIndex);
		}
	}

	static void merge(int[] arr, int s1, int mid, int e1){
		
		//Size of Left part of Array
		int n1 = mid - s1 + 1;

		//Size of right part of Array
		int n2 = e1-mid;

		int[] lArr = new int[n1];
		int[] rArr = new int[n2];

		//Add the Data in Left Array
		for(int i=0; i<n1; i++){
			lArr[i] = arr[s1+i];
		}

		//Add the Data on right Array
		for(int i=0; i<n2; i++){
			rArr[i] = arr[mid+1+i];
		}

		int lAI = 0;	//Index of the Left Array.
		int rAI = 0;	//Index of the right Array.
		int mAI = s1; 	//Index for the input array.

		while(lAI < n1 && rAI < n2){

			if(lArr[lAI] < rArr[rAI]){
				arr[mAI] = lArr[lAI++];
			}else{
				arr[mAI] = rArr[rAI++];
			}
			mAI++;
		}

		while(lAI < n1){
			arr[mAI] = lArr[lAI];
			mAI++;
			lAI++;
		}

		while(rAI < n2){
			arr[mAI] = rArr[rAI];
			mAI++;
			rAI++;
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

                System.out.print("Array Before Merge Sort : ");
                for(int i=0; i<size; i++){

                        System.out.print(arr[i] + " ");
                }

                System.out.println();

               	mergeSort(arr,0,size-1);

                System.out.print("Array After Merge Sort : ");
                for(int i=0; i<size; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
