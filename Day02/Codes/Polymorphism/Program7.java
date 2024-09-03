/*
	============= Java Language =============

	Polymorphism :

	  1)Compile Time Binding (Method Overloading).
	  	* The Methods with the same name can have different numbers of parameters,different
		  types of Parameters or different orders of Parameters in Method.
*/

class Demo{

	void method1(int x){
		System.out.println("In Method1 int");
	}

	void method1(char x){
		System.out.println("In Method1 char");
	}

	void method1(float x){
		System.out.println("In Method1 Float");
	}
}
class Main{
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.method1(10.3);
	}
}
/* Output :

error: no suitable method found for method1(double)
                obj.method1(10.3);
                   ^
    method Demo.method1(int) is not applicable
      (argument mismatch; possible lossy conversion from double to int)
    method Demo.method1(char) is not applicable
      (argument mismatch; possible lossy conversion from double to char)
    method Demo.method1(float) is not applicable
      (argument mismatch; possible lossy conversion from double to float)
*/
