/*
	============= Java Language =============

	Instance ->

		1) Instance Block ->
			* Instance Block is Nothing But Constructor.
			* When we create the object then first calls go the Instance Block and then Contructor
			* Instance Block Combine with the Constructor.
			* Why we use the Instance Block ?
			-> If We Want to Write the logic that we want to execute on the creation of all
			   kinds of Objects.
			* super() is not allowed in a Instance Block.
		2) Instance Variable
		3) Instance Method
*/

class InstanceBlock{

	int x = 10;
	
	{							//Instance Block 1
		System.out.println("In Instance Block 1");

	}

	InstanceBlock(int x){					//Parameterized Constructor.

		super();					//Calls to the Parent Class i.e.,Object Class.
		System.out.println("In Constructor");
	}
	public static void main(String[] args){

		InstanceBlock obj = new InstanceBlock(10);
		System.out.println("In Main-Block");
		System.out.println("X : " + obj.x);		//Change the Value of x=10 to x=20.
	}

	{							//Instance Block 2.
								
		//super();					//error: call to super must be first statement in constructor
		x = 20;
		System.out.println("In Instance Block - 2");
	}
}

/* Output ->
 
   	In Instance Block 1
	In Instance Block - 2
	In Constructor
	In Main-Block
	X : 20
*/
