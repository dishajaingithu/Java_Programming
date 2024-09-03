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

	Varibale In Interface :
		interface A{				interface A{

			int x = 10;	-Internally-		public static final int x;
		}					}
		
*/
class Demo{
	final static int x = 10;
}
interface A{

	final static int x = 20;	
}

class B extends Demo implements A{	//Achieve Multiple Inheritance.

	void method1(){
		System.out.println("X : " + Demo.x);
		System.out.println("X : " + A.x);
	}

	public static void main(String[] args){

		B obj = new B();
		obj.method1();
	}
}
/* Output :

X : 10
X : 20
*/
