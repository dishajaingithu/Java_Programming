/*
	============= Java Language =============

	Composition ->

	* If an Object contains the other object and the contained object cannot exist without the 
	  existence of that object.
*/	
class Parent{
	int x = 10;
	static int y = 20;

	void method1(){
		System.out.println("In Method 1");
	}

	static void method2(){
		System.out.println("In Method 2");
	}
}
class Child{

	Parent p = new Parent();
}
class Demo{
	public static void main(String[] args){

		Child c = new Child();
		c.p.method1();
		Parent.method2();
		c.p.method2();
	}
}
/* Output :-
   	In Method 1
	In Method 2
	In Method 2
*/
   	
