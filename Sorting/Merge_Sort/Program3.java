/*
	Merge Sort :

	Merge the Given two array and sort them in a single array with using extra space
	Time Complexity : O(n)

	i/p : arr = {3,5,7}
	      arr = {2,4}

	o/p : arr = {2,3,4,5,7}
*/
import java.util.Scanner;
class MergeTwoArray{
	static int[] mergeTwoArray(int[] arr1, int[] arr2){
		int n1 = arr1.length;
		int n2 = arr2.length;
		int[] mergedArray = new int[n1+n2];
		int i=0, j=0, k=0;
		//Traverse both arrays and merge them into one
		while(i<n1 && j<n2){
			if(arr1[i] < arr2[j]){
				mergedArray[k++] = arr1[i++];
			}else{
				mergedArray[k++] = arr2[j++];
			}
		}
		while(i<n1){
			mergedArray[k++] = arr1[i++];
		}
		while(j<n2){
			mergedArray[k++] = arr2[j++];
		}
		return mergedArray;
	}
	public static void main(String[] args){

		int[] arr1 = {3,5,7};
		int[] arr2 = {2,4};

		int[] mergedArray = mergeTwoArray(arr1,arr2);

                System.out.print("Array After merge and Sort : ");
                for(int i=0; i<mergedArray.length; i++){

			System.out.print(mergedArray[i] + " ");
		}
		System.out.println();
	}
}
