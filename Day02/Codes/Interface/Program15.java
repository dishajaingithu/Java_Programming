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

	//Note : When we want to override method in child.
	default void method1(){
		System.out.println("In Method 1");
	}

	//Note : When we don't want to override method in child.
	static void method2(){
		System.out.println("In Method 2");
	}
}
