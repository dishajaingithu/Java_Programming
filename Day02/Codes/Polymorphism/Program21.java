/*
	============= Java Language =============

	Polymorphism :

	  1)Compile Time Binding (Method Overloading).
	  	* The Methods with the same name can have different numbers of parameters,different
		  types of Parameters or different orders of Parameters in Method.
*/

class Parent{

}
class Child extends Parent{

}
class Demo{
	void method1(String st){
		System.out.println("In Method1 String");
	}
	void method1(StringBuffer sb){
		System.out.println("In Method1 StringBuffer");
	}
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.method1(null);	
	}
}
/* Error :

error: reference to method1 is ambiguous
                obj.method1(null);
                   ^
  both method method1(String) in Demo and method method1(StringBuffer) in Demo match
*/
