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
	void method1(Parent p){
		System.out.println("In Method1 Parent");
	}
	void method1(Child c){
		System.out.println("In Method1 Child");
	}
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.method1(new Parent());
		obj.method1(new Child());
		obj.method1(null);	//Give the reference to the "Child Object"
	}
}
/* Output :

In Method1 Parent
In Method1 Child
In Method1 Child
*/
