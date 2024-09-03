/*
	============= Java Language =============

	Polymorphism :

	  1)Compile Time Binding (Method Overloading).
	  	* The Methods with the same name can have different numbers of parameters,different
		  types of Parameters or different orders of Parameters in Method.
*/

class Demo{

	void method1(int x,char y){
		System.out.println("In Method1 int-char");
	}
	void method1(char x,int y){
		System.out.println("In Method1 char-int");
	}
}
class Main{
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.method1('S','D');
	}
}
/* Error :

 error: reference to method1 is ambiguous
                obj.method1('S','D');
                   ^
 both method method1(int,char) in Demo and method method1(char,int) in Demo match
*/
