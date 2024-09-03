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

interface A{
	int x = 10;	//public static final int x;
	void method1();	//public abstract void method1();

}
class B implements A{

	public void method1(){
		System.out.println("In Method 1");
	}
}
class Demo{
	public static void main(String[] args){
		A obj = new B();
		obj.method1();
		System.out.println("X : " + obj.x);
	}
}
/* Output :

In Method 1
X : 10
*/
