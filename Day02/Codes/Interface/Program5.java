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

class Demo{

}
class XYZ{

}
class PQR extends Demo,XYZ{

}
/* Error :
error: '{' expected
class PQR extends Demo,XYZ{
                      ^
Note : Multiple Inheritace not Possible that's why Inteface is Used.
*/
