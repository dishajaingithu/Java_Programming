/*
	============= Java Language =============

	Polymorphism :

	  1)Compile Time Binding (Method Overloading).
	  	* The Methods with the same name can have different numbers of parameters,different
		  types of Parameters or different orders of Parameters in Method.
*/

class Demo{

	void method1(int x,int y){
		System.out.println("In Method1 int-int");
	}
	void method1(float x,float y){
		System.out.println("In Method1 float-float");
	}
}
class Main{
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.method1(10,20);
		obj.method1(10.3f,20.3f);
	}
}
/* Output :

In Method1 int-int
In Method1 float-float

*/
