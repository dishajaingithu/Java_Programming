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

	int x = 10;
}
interface B{
	int x = 20;
}
class Demo implements A,B{

	void method1(){
		System.out.println("X : " + A.x);
		System.out.println("X : " + B.x);
	}

	public static void main(String[] args){

		Demo obj = new Demo();
		obj.method1();
	}
}
/* Output :

X : 10
X : 20
*/
