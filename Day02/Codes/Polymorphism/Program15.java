/*
	============= Java Language =============

	Polymorphism :

	  1)Compile Time Binding (Method Overloading).
	  	* The Methods with the same name can have different numbers of parameters,different
		  types of Parameters or different orders of Parameters in Method.
*/

class Demo{

	void method1(double x,float y){
		System.out.println("In Method1 double-float");
	}
	void method1(float x,double y){
		System.out.println("In Method1 float-double");
	}
}
class Main{
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.method1(10.3f,20.3f);
	}
}
/* Error :

error: reference to method1 is ambiguous
                obj.method1(10.3f,20.3f);
                   ^
  both method method1(double,float) in Demo and method method1(float,double) in Demo match
*/
