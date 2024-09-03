/*
	============= Java Language =============

	Polymorphism :

	  1)Compile Time Binding (Method Overloading).
	  	* The Methods with the same name can have different numbers of parameters,different
		  types of Parameters or different orders of Parameters in Method.
*/

class Demo{

	void method1(int x){
		System.out.println("In Method1 int");
	}

	void method1(char x){
		System.out.println("In Method1 char");
	}
}
class Main{
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.method1();
	}
}
/* Error :

 error: no suitable method found for method1(no arguments)
                obj.method1();
                   ^
    method Demo.method1(int) is not applicable
      (actual and formal argument lists differ in length)
    method Demo.method1(char) is not applicable
      (actual and formal argument lists differ in length)
*/
