/*
	============= Java Language =============

	Private Varibale ->
		* Private variable access in the same class or parent-child relation.
*/

class PrivateVariable{

	private int x = 10;

	
	PrivateVariable(){

		System.out.println("In Constructor");
	}
	public static void main(String[] args){

		PrivateVariable obj = new PrivateVariable();
		System.out.println("X : " + obj.x);	
	}
}

/* Output ->

  	In Constructor
	X : 10
*/
