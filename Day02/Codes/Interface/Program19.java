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

class A{

	interface B{

		default void method1(){
			System.out.println("In Class-Interface Method 1");
		}
	}
}
class Demo implements A.B{

	public static void main(String[] args){

		Demo obj1 = new Demo();
		obj1.method1();
	}
}
/* Output :

In Class-Interface Method 1
*/
