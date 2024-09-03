/* ============= Array =============*/

class LearnArray{

	public static void main(String[] args){

		int[] arr = new int[5];
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr.length);

		arr[0] = 2;
		arr[1] = 13;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 11;
		System.out.println(arr[1]);

		arr = new int[7];
		System.out.println(arr[1]);
	}
}
/* Output :

[I@d716361
0
5
13
0
*/
