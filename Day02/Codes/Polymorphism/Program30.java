/*
	============= Java Language =============

	Polymorphism :

	  2)Run Time Binding(Method Overriding).
	  	* It is a type of runtime polymorphism where the method in the subclass overrides
		  the method in the superclass,which has the same "name,parameters and Return Type"
		* Here the method to be called is based on the instance of the subclass,which is assign
		  to a reference variable of the superclass.
		Note : Compulsory Required the Parent-Child Relation.
*/

class Parent{

	static void method1(){

		System.out.println("In Method1-Parent");
	}
}
class Child extends Parent{

	static void method1(){

		System.out.println("In Method1-Child");
	}

	public static void main(String[] args){

		Parent p = new Child();	//Parent reference and Child Object
		p.method1();
	}
}
/* Output :

In Method1-Parent

Note : When both the Method is static in Overriding then their is a 'Method Hiding Concept'.
*/
