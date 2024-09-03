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

	void lifeStyle();	//Internally : public abstract void lifeStyle();
	void festival();	//Internally : public abstract void festival();
}
class Maharashtra implements IndianCulture{

	public void lifeStyle(){

		System.out.println("Saree and Dhotar");
	}

	public void festival(){
		System.out.println("Ganesh Utsav");
	}
}

class Gujrat implements IndianCulture{

	public void lifeStyle(){
		System.out.println("Gujrati Saree");
	}

	public void festival(){
		System.out.println("Navratri");
	}
}
class Culture{

	public static void main(String[] args){

		Maharashtra mh = new Maharashtra();
		mh.lifeStyle();
		mh.festival();

		System.out.println();

		Gujrat gj = new Gujrat();
		gj.lifeStyle();
		gj.festival();
	}
}
/* Output :

Saree and Dhotar
Ganesh Utsav

Gujrati Saree
Navratri

Note : when we implement the interface method in class then mandatory gives the "public" access specifier
       to avoid the weaker access previlige.
*/
