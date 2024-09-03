/*
	============= Java Language =============

	Polymorphism :

	  1)Compile Time Binding (Method Overloading).
	  	* The Methods with the same name can have different numbers of parameters,different
		  types of Parameters or different orders of Parameters in Method.
*/

class Demo{

	void method1(){
		System.out.println("In Method1");
	}

	void method1(){
		System.out.println("In Method1");
	}

	public static void main(String[] args){

		Demo obj = new Demo();
		obj.method1();
	}
}
/* Error :
 error: method method1() is already defined in class Demo

Explanation :

* Internally in Method table their method signature is method1(),so its a ambigous(confuse) to calling
  the method.
*/
