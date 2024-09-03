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
/* Internally :

class Demo {
  static final int x;

  Demo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return
}

Note : No Static Block.
*/
