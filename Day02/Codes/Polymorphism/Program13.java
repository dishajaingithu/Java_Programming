/*
	============= Java Language =============

	Polymorphism :

	  1)Compile Time Binding (Method Overloading).
	  	* The Methods with the same name can have different numbers of parameters,different
		  types of Parameters or different orders of Parameters in Method.
*/

class Demo{

	void method1(int x,float y){
		System.out.println("In Method1 int-float");
	}
	void method1(float x,int y){
		System.out.println("In Method1 float-int");
	}
}
class Main{
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.method1(10,20.3f);
	}
}
/* Output :

In Method1 int-float
*/
