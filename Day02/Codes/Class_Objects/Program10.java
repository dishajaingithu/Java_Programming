/*
	============= Java Language =============

	Singleton Design Pattern ->
		* Singleton pattern restricts the instantiation of a class and ensures that only one instance
		  of the class exists in the Java Virtual Machine.
		* Required ->
			1) Private Constructor.
			2) Static Object.
*/

class SingletonDesign{

	static SingletonDesign obj = new SingletonDesign();	//Create the Static Object.

	private SingletonDesign(){				//Private Constructor.

		System.out.println("In Constructor");
	}

	static SingletonDesign methodCreate(){			
		System.out.println("In Method");
		return obj;
	}
	public static void main(String[] args){

		SingletonDesign sd1 = new SingletonDesign();
		System.out.println(System.identityHashCode(sd1));

		SingletonDesign sd2 = new SingletonDesign();
		System.out.println(System.identityHashCode(sd2));

		SingletonDesign sd3 = new SingletonDesign();
		System.out.println(System.identityHashCode(sd3));
	}
}

/* Output ->

  	In Constructor
	In Constructor
	225534817
	In Constructor
	1878246837
	In Constructor
	929338653
  	
*/
