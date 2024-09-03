/*
	============= Java Language =============

	Interface :
	Syntax:
		interface IndianCulture{

			void festival();
		}
		class UP implements IndianCulture{

			public void festival(){

			}
		}

*/

interface A{
	void method1();
}
interface B extends A{
	void method2();
}

class Demo implements B{

	public void method1(){
		System.out.println("In Method 1");
	}
	public void method2(){
		System.out.println("In Method 2");
	}

	public static void main(String[] args){

		A obj1 = new Demo();
		obj1.method1();
		//obj1.method2();	//error: cannot find symbol

		B obj2 = new Demo();
		obj2.method1();
		obj2.method2();
	}
}
/* Output :

In Method 1
In Method 1
In Method 2
*/
