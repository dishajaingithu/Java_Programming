/*
	============= Java Language =============

	Static Keyword ->

		1) Static Block
		2) Static Variable 
		3) Static Method ->
			3 Ways to Call the Static Mathod ->
				* In Static Method, we can call them directly without creating Object.
			  	  ex.method1()
				* We Can call static Method using class Name.
			  	  ex.StaticMethod.method1()
				* We Can also call the static method for creating the Object.
			  	  ex.obj.method1() 
			* We Can't Initialize the static variable in static Method,but we can initialize the
			  Non-static Variable in Static Method.
			* We Can't Initialize the static Variable in Static Block.
			* Stack Frame doesn't give the space for static variable.
			* In Static and Non-static method,static variable is not Allowed.
*/

class StaticMethod{

	static{

		//static int z = 30;	//error: illegal start of expression

		int a = 40;	// 'a' is a Local for static Block.
		System.out.println("In Static Block A : " + a);

	}
	
	static void method1(){
		int x = 10;		//Independent to Object.
		//static int y = 20;	//error : illegal start of expression
		System.out.println("In Static Method M1");
	}

	public static void main(String[] args){
		method1();
		StaticMethod.method1();
		StaticMethod obj = new StaticMethod();
		obj.method1();
	}
}

/* Output ->
	
   	In Static Block A : 40
   	In Static Method M1
	In Static Method M1
	In Static Method M1
*/

