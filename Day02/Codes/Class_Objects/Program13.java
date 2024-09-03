/*
	============= Java Language =============

	Hidden this Reference ->
*/

class HiddenthisReference{
	
	int x = 10;

	HiddenthisReference(){

		System.out.println("In No-argumnet Constructor");
	}

	HiddenthisReference(int x){

		//x = x;	//Tempoary store the x = 20.
		this.x = x;	//For hr2 Object,x is equal to 20.
		System.out.println("In Parameterized Constructor");
		System.out.println("X : " + x);
	}

	void method1(){

		System.out.println("In Method 1");
		System.out.println("X : " + x);
	}
	public static void main(String[] args){

		HiddenthisReference hr1 = new HiddenthisReference();
		HiddenthisReference hr2 = new HiddenthisReference(20);
	
		hr1.method1();
		
		System.out.println("HR1 Object X : " + hr1.x);		
		System.out.println("HR2 Object X : " + hr2.x);		

		System.out.println("Object HR1 : " + hr1);
		System.out.println("Object HR2 : " + hr2);
	}
}

/* Output ->

   	In No-argumnet Constructor
	In Parameterized Constructor
	X : 20
	In Method 1
	X : 10
	HR1 Object X : 10
	HR2 Object X : 20
	Object HR1 : HiddenthisReference@8efb846
	Object HR2 : HiddenthisReference@2a84aee7
*/
