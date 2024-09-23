/*
	Merge Sort :

	Write a function that calculates the inversion count of an array using Merge Sort.
	i/p : arr = {8,4,2,1}
	o/p : count = 6

	Explanation : if(i<j) and if(arr[i] > arr[j]) -> Inversion Condition.
*/
import java.util.Scanner;
class InversionCount{
	static int mergeSortAndCount(int[] arr, int left, int right){
		int count = 0;

		if(left < right){
			int mid = left + (right - left)/2;

			count += mergeSortAndCount(arr,left,mid);
			count += mergeSortAndCount(arr,mid+1,right);

			//count inversion while merging two halves
			count+= mergeAndCount(arr,left,mid,right);
		}
		return count;
	}
	static int mergeAndCount(int[] arr, int s1, int mid, int e1){
	
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

                int lAI = 0;    //Index of the Left Array.
                int rAI = 0;    //Index of the right Array.
                int mAI = s1;   //Index for the input array.
		int count = 0;

                while(lAI < n1 && rAI < n2){

                        if(lArr[lAI] <= rArr[rAI]){
                                arr[mAI] = lArr[lAI++];
                        }else{
                                arr[mAI] = rArr[rAI++];

				count+=(n1 - lAI);
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

		return count;
	}
	public static void main(String[] args){

		int[] arr = {8,4,2,1};

		int count = mergeSortAndCount(arr,0,arr.length-1);

		System.out.println("Count : " + count);
	}
}
