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

class Momos{

}
class Momospanda extends Momos{

}

class Parent{

	Momos method1(){

		return new Momos();
	}
}
class Child extends Parent{

	Momospanda method1(){

		return new Momospanda();
	}

	public static void main(String[] args){

	}
}

/*
	Note : No Error.
	Co-varient retunr Type
*/
