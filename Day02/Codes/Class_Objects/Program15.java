/*
	============= Java Language =============

	Hidden this Reference ->
*/

class HiddenthisReference{
	
	int x = 30;

	HiddenthisReference(){	//Internally -> HiddenthisReference(HiddenthisReference this)

		int x = 20;
		System.out.println("In No-argumnet Constructor");
		System.out.println("X : "+ x);
		System.out.println("This.X : " + this.x);
	}

	HiddenthisReference(int x){	//Internally -> HiddenthisReference(HiddenthisReference this,int x)

		System.out.println("In Parameterized Constructor");
		System.out.println("X : " + x);
		System.out.println("This.X : " + this.x);
	}
	public static void main(String[] args){

		HiddenthisReference hr1 = new HiddenthisReference();
		HiddenthisReference hr2 = new HiddenthisReference(10);
	}
}

/* Output ->

   	In No-argumnet Constructor
	X : 20
	This.X : 30
	In Parameterized Constructor
	X : 10
	This.X : 30
*/
