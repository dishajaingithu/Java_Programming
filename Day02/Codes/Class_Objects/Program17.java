/*
	============= Java Language =============

	Hidden this Reference ->
		* Address of d1 and this is Same.
*/

class Demo{
	
	int x = 30;

	Demo(){	
		System.out.println("In No-argumnet Constructor");	
		System.out.println("X : " + x);	
		System.out.println("This.X : "+ this.x);	
		System.out.println("This : " + this);	
	}
	public static void main(String[] args){

		Demo d1 = new Demo();
		System.out.println("Object : " + d1);
	}
}

/* Output ->

	In No-argumnet Constructor
	X : 30
	This.X : 30
	This : Demo@8efb846
	Object : Demo@8efb846
*/
