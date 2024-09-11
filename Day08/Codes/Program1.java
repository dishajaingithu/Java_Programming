/*
	1) Print the Number of elemnets in Array using Recursion.
*/

class PrintElements{

	static void printEle(int[] arr, int s1){

		if(s1 >= arr.length)
			return;

		System.out.print(arr[s1] + " ");

		printEle(arr,s1+1);
	}

	public static void main(String[] args){

		int[] arr = {1,2,3,4};

		printEle(arr,0);

		System.out.println();
	}
}
/* Output :

1 2 3 4
*/
