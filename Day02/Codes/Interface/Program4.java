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

interface IndianCulture{

	void festival();
}
class UP implements IndianCulture{

	public void festival(){

	}
	public static void main(){

		IndianCulture ic = new IndianCulture();
	}
}
/* Error :
error: IndianCulture is abstract; cannot be instantiated
                IndianCulture ic = new IndianCulture();
                                   ^
*/
