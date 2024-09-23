/*
	Count Sort :
	
	* Sort only for Integers.
	* Counting Sort doesn't work on decimal Values.
	* Mostly use for Positive Integers only.
	* Algorithm mostly use for small large value in Array.
*/
import java.util.Scanner;
class CountSort{
	static void countSort(int[] arr){
		int lEle = findLargest(arr);
		int[] count = new int[lEle+1];

		for(int i=0; i<arr.length; i++){
			count[arr[i]] = count[arr[i]] + 1;
		}
		for(int i=1; i<count.length; i++){
			count[i] = count[i] + count[i-1];
		}
		int[] output = new int[arr.length];
		for(int i=arr.length-1; i>=0; i--){

			output[count[arr[i]]-1] = arr[i];
		 	count[arr[i]]--;     	
		}
		//Output array will have the sorted Elements
		for(int i=0; i<output.length; i++){
			arr[i] = output[i];
		}

	}

	static int findLargest(int[] arr){

		int num = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++){

			if(arr[i] > num){
				num = arr[i];
			}
		}
		return num;
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
                
		countSort(arr);

                System.out.print("Array After Bubble Sort : ");
                for(int i=0; i<size; i++){

                        System.out.print(arr[i] + " ");
                }
		System.out.println();
	}
}
