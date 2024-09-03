/*
	============= Java Language =============

	Polymorphism :

	  1)Compile Time Binding (Method Overloading).
	  	* The Methods with the same name can have different numbers of parameters,different
		  types of Parameters or different orders of Parameters in Method.
*/

class Demo{

	void method1(float x){
		System.out.println("In Method1 float");
	}
	void method1(double x){
		System.out.println("In Method1 double");
	}
	void method1(long x){
		System.out.println("In Method1 long");
	}
}
class Main{
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.method1('S');
	}
}
/* Output :

In Method1 long

Explanation :

Upcasting is Possible i.e.,
double
  |
float
  |
long	    ^
  |	    |
 int  	upcasting	
  |
char  
*/
