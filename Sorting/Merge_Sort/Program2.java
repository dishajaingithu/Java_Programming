/*
	Merge Sort :

	Merge the Given two array and sort them in a single array without using extra space
	Time Complexity : O(n)

	i/p : arr = {3,5,7}
	      arr = {2,4}

	o/p : arr = {2,3,4,5,7}
*/
import java.util.Scanner;
class MergeSort{

	static void mergeTwoArray(long[] inArr1, long[] inArr2){
		int m = inArr1.length;
		int n = inArr2.length;
		int p = 0; int q = 0;
		int k = 0;
		long MAX = 1000000007;

		while(p < m && q < n && k < m + n){
			long orgNum1 = inArr1[p] % MAX;
    			long orgNum2 = inArr2[q] % MAX;

    			if(orgNum1 <= orgNum2){
        			if(k < m)
            				inArr1[k] = inArr1[k] + (orgNum1 * MAX);
        
        			else
            				inArr2[k - m] = inArr2[k - m] + (orgNum1 * MAX);
        		p = p + 1;
        		k = k + 1;
    			}else{
        			if(k < m)
            				inArr1[k] = inArr1[k] + (orgNum2 * MAX);
        
        			else
            				inArr2[k - m] = inArr2[k - m] + (orgNum2 * MAX);
        		q = q + 1;
        		k = k + 1;
    			
			}
		}
		// Iterating over the remaining elements of 'B' (if any).
		while(q < n){
    			long orgNum2 = inArr2[q] % MAX;
 		   if(k < m)
        		inArr1[k] = inArr1[k] + (orgNum2 * MAX);
    		   else
        		inArr2[k - m] = inArr2[k - m] + (orgNum2 * MAX);
    		   q = q + 1;
    	           k = k + 1;
		}
		// Iterating over the rest of the elements of 'inArr1[]' (if any).
		while(p < m){
    			long orgNum1 = inArr1[p] % MAX;
    			if(k < m)
        			inArr1[k] = inArr1[k] + (orgNum1 * MAX);  
    			else
        			inArr2[k - m] = inArr2[k - m] + (orgNum1 * MAX);
    
    			p = p + 1;
    			k = k + 1;
		}

	// Changing the elements present in the array 'inArr1[]' to the new numbers.
		for(int l = 0; l < m; ++l)
    			inArr1[l] = inArr1[l] / MAX;


	// Changing the elements present in the array 'inArr2[]' to the new numbers.
		for(int l = 0; l < n; ++l)

    			inArr2[l] = inArr2[l] / MAX;
	}
	public static void main(String[] args){

		long[] arr1 = {3,5,7};
		long[] arr2 = {2,4};

		mergeTwoArray(arr1,arr2);

		int size = arr1.length + arr2.length;

                System.out.print("Array After merge and Sort : ");
                for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}

		for(int i=0; i<arr2.length; i++){
			System.out.print(arr2[i] + " ");
		}

		System.out.println();
	}
}
