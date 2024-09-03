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

interface Populations{

	void educationPercentage();	//Internally : public abstract void educationPercentage();
	void unicornCompanies();	//Internally : public abstract void unicornCompanies();
	default void totalPopulations(){

		System.out.println("There are 7 crore people in India");
	}
}
class India implements Populations{

	public void educationPercentage(){

		System.out.println("There are 74.04% Education Rate in INDIA");
	}

	public void unicornCompanies(){
		System.out.println("There are 88 Unicorn Companies in INDIA");
	}
}

class USA implements Populations{

	public void educationPercentage(){

		System.out.println("There are 89.90% Education Rate in USA");
	}

	public void unicornCompanies(){
		System.out.println("There are 489 Unicorn Companies in USA");
	}

	public void totalPopulations(){
		System.out.println("There are 10 Crore People in USA");
	}
	
}
class EducationRate{

	public static void main(String[] args){

		India in = new India();
		in.educationPercentage();
		in.unicornCompanies();
		in.totalPopulations();

		System.out.println();

		USA un = new USA();
		un.educationPercentage();
		un.unicornCompanies();
		un.totalPopulations();
	}
}
/* Output :

There are 74.04% Education Rate in INDIA
There are 88 Unicorn Companies in INDIA
There are 7 crore people in India

There are 89.90% Education Rate in USA
There are 489 Unicorn Companies in USA
There are 10 Crore People in USA

Note : * when we implement the interface method in class then mandatory gives the "public" access specifier
         to avoid the weaker access previlige.
       * We can give the body to the method in Inteface using default keyword as a access specifier to 
         the method.

*/
