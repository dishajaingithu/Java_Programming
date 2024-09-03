/*
	============= Java Language =============

	Composition ->

	* If an Object contains the other object and the contained object cannot exist without the 
	  existence of that object.
*/	
class Parent{
	int x = 10;
	static int y = 20;

	static{
		System.out.println("In Static - Parent");
	}
	Parent(){
		System.out.println("In Parent Constructor");
	}
}
class Child{

	Parent p = new Parent();

	static{
		System.out.println("In Static - Child");
	}
	Child(){
		System.out.println("In Child Constructor");
	}
}
class Demo{
	public static void main(String[] args){

		Child c = new Child();
	}
}
/* Output :-
   	In Static - Child
	In Static - Parent
	In Parent Constructor
	In Child Constructor
*/
   	
