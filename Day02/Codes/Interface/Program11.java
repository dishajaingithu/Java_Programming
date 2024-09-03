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
		System.out.println("X : " + x);
	}

	public static void main(String[] args){

		B obj = new B();
		obj.method1();
	}
}
/* Error :

error: reference to x is ambiguous
                System.out.println("X : " + x);
                                            ^
both variable x in Demo and variable x in A match
*/
