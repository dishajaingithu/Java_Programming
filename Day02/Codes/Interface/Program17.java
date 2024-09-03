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

	class B{

		void method1(){
			System.out.println("In Interface-Class Method 1");
		}
	}
}
class Demo implements A{

	public static void main(String[] args){

		Demo obj1 = new Demo();
		//obj1.method1(); 	//error: cannot find symbol
		A.B obj2 = new B();	//No Error
		obj2.method1();
	}
}
/* Output :

In Interface-Class Method 1
*/
