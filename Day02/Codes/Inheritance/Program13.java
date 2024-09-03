/*
	============= Java Language =============

	Inheritance ->

	Practice Code 5:
*/	
class Parent{

	static{
		System.out.println("In Parent Static Block");
	}
	Parent(){
		System.out.println("In Parent Constructor");
	}
}
class Child extends Parent{
	
	static{
		System.out.println("In Child Static Block");
	}
	Child(){
		System.out.println("In Child Constructor");
	}
}
class Demo{

	public static void main(String[] args){

	}
}
/* Explanation :-
   
   	Compile Easily but No Output
*/
   	
