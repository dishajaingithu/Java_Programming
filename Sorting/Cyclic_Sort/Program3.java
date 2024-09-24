/*
	Cyclic Sort :

	* Condition :
		1) Size of Array is 'n'.
		2) All the elements in array in between (1-n).
		3) Elements in the array will be unique not repeated.
		ex : n = 5
		arr[] = {2,3,4,5,1} => Allowed

		arr[] = {2,3,4,1,6} => Not Allowed because size of array is 5 we can't take 
		                       '6' as a Element in Array.
*/
import java.util.Scanner;
class CyclicSort{

	static void cyclicSort(int[] arr){
		int i=0; 
		while(i < arr.length){
			int correctIndex = arr[i] - 1;

			if(arr[i] != arr[correctIndex]){
				int temp = arr[i];
				arr[i] = arr[correctIndex];
				arr[correctIndex] = temp;
			}else{
				i++;
			}
		}
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Size of Array : ");
                int size = sc.nextInt();

                int[] arr = new int[size];
                System.out.print("Enter the Array Elements : ");
                for(int i=0; i<size; i++){

                        arr[i] = sc.nextInt();
                }

		System.out.print("Array Before Cyclic Sort : ");
		for(int i=0; i<size; i++){

			System.out.print(arr[i] + " ");
		}

		System.out.println();

                cyclicSort(arr);

                System.out.print("Array After Cyclic Sort : ");
                for(int i=0; i<arr.length; i++){

                        System.out.print(arr[i] + " ");
                }
                System.out.println();
	}
}
