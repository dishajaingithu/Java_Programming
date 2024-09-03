/*
	============= Java Language =============

	Inheritance ->

	2) Multilevel Inheritance
		* In Multilevel inheritance,a derived will be inheriting a base class and as well
		  as the derived class also acts as the base class for the other classes
		ex : A -> Base Class
		     |
		     B -> Intermediatory Class
		     |
		     C -> Derived Class
*/

class DhiruBhaiAmbani{

	DhiruBhaiAmbani(){

		System.out.println("In DhiruBhaiAmbani Constructor");
	}

	static{
		System.out.println("In Static Block : DhirubhaiAmbani");
	}
}
class MukeshAmbani extends DhiruBhaiAmbani{

	MukeshAmbani(){

		System.out.println("In MukeshAmbani Constructor");
	}
	static{
		System.out.println("In Static Block : MukeshAmbani");
	}
}

class AnantAmbani extends MukeshAmbani{

	AnantAmbani(){

		System.out.println("In AnantAmbani Constructor");
	}
	static{
		System.out.println("In Static Block : AnantAmbani");
	}
}

class Main{

	public static void main(String[] args){

		AnantAmbani aab = new AnantAmbani();
	}
}
/* Output :
	In Static Block : DhirubhaiAmbani
	In Static Block : MukeshAmbani
	In Static Block : AnantAmbani
 	In DhiruBhaiAmbani Constructor
	In MukeshAmbani Constructor
	In AnantAmbani Constructor
*/
