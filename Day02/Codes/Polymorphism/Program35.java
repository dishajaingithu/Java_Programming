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

class X{

}
class Y extends X{

}

class Parent{

	X method1(){

		return new X();
	}
}
class Child extends Parent{

	X method1(){

		return new X();
	}

	public static void main(String[] args){

	}
}

/*
	Note : No Error.
	Co-varient retunr Type
*/
