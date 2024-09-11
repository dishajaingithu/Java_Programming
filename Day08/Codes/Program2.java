/*
	2) Print the Number of elemnets in Reverse in Array using Recursion.
*/

class PrintElements{

	static void printEle(int[] arr, int s1){

		if(s1 >= arr.length)
			return;

		printEle(arr,s1+1);
		System.out.print(arr[s1] + " ");
	}

	public static void main(String[] args){

		int[] arr = {1,2,3,4};

		printEle(arr,0);

		System.out.println();
	}
}
/* Output 

4 3 2 1
*/
