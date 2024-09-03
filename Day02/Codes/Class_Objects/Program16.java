/*
	============= Java Language =============

	Creating only one object and call different Constructor ->
*/

class Demo{
	
	int x = 30;

	Demo(){	
		this(10);
		System.out.println("In No-argumnet Constructor");	
	}
	Demo(int x){	

		System.out.println("In Parameterized Constructor");
		System.out.println("This.X : " + this.x);
	}
	public static void main(String[] args){

		Demo d1 = new Demo();
	}
}

/* Output ->

	In Parameterized Constructor
	This.X : 30
	In No-argumnet Constructor   	
*/
