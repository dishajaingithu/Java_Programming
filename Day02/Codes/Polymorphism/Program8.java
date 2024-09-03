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
	void method1(float x){
		System.out.println("In Method1 Float");
	}
}
class Main{
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.method1('S');
	}
}
/* Output :

In Method1 int

Explanation :

Upcasting is Possible i.e.,
double
  |
float	  ^
  |	  |
 int  upcasting	
  |
char  
*/
