/*
	============= Java Language =============

	Inheritance ->

	Practice Code 4:
*/	
class Parent{

	static{
		System.out.println("In Parent Static Block");
	}
}
class Child extends Parent{
	
	static{
		System.out.println("In Child Static Block");
	}

	public static void main(String[] args){

		Parent p = new Parent();
	}
}
/* Output :-
   
   	In Parent Static Block
	In Child Static Block
*/
   	
