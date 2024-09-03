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

	default void method1(){
		System.out.println("In Method 1");
	}

	static void method2(){
		System.out.println("In Method 2");
	}
}
/* 
	Note : * No Erorr.
	       * We Can also give the body to method in interface byusing the 'static' keyword before the 
		 method return type as i can use in the above example.
*/
