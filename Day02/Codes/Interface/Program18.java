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
	default void method1(){
		System.out.println("In Method 1 - A Interface");
	}
}
interface B extends A{
	default void method1(){
		System.out.println("In Method 1 - B Interface");
	}
}
class Demo implements A,B{
	public static void main(String[] args){

		Demo obj1 = new Demo();
		obj1.method1();
	}
}
/* Output :

In Method 1 - B Interface
*/
