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

	int method1(){

		return 10;
	}
}
class Child extends Parent{

	char method1(){

		return 'S';
	}
}
class Demo{

	public static void main(String[] args){

	}
}
/* Error :

error: method1() in Child cannot override method1() in Parent
        char method1(){
             ^
  return type char is not compatible with int
*/
