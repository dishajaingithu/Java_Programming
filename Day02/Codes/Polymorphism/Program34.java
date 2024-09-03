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

	double method1(){

		return 10.5;
	}
}
class Child extends Parent{

	float method1(){

		return 10.3f;
	}
}
class Demo{

	public static void main(String[] args){

	}
}
/*

error: method1() in Child cannot override method1() in Parent
        float method1(){
              ^
  return type float is not compatible with double
*/
