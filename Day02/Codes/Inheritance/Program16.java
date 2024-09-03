/*
	============= Java Language =============

	Inheritance ->

	Real Time Example:
*/	
class Ambani{
	int employee = 1000;
	static int mainHead = 3;

	static{
		System.out.println("=== WELCOME TO AMBANI's COMPANY");
	}
	Ambani(){
		System.out.println("In Ambani's Company");
	}

	void jio(){
		System.out.println("In Jio House");
		System.out.println("Employee : " + employee);
		System.out.println("Main Head : " + mainHead);
	}

	static void reliance(){
		System.out.println("In Reliance House");
	}
}
class Anant extends Ambani{

	int employee = 1500;
	static int mainHead = 1;

	Anant(){
		System.out.println("In Anant Ambani Company");
	}

	void jioMart(){
		System.out.println("In JIOMart Company");
		System.out.println("Employee : " + employee);
		System.out.println("Main Head : "+ mainHead);
	}
}
class AmbaniEmpire{

	public static void main(String[] args){

		Anant obj = new Anant();
		obj.jio();
		Ambani.reliance();
		obj.jioMart();
	}
}
/* Output :-
	=== WELCOME TO AMBANI's COMPANY
	In Ambani's Company
	In Anant Ambani Company
	In Jio House
	Employee : 1000
	Main Head : 3
	In Reliance House
	In JIOMart Company
	Employee : 1500
	Main Head : 1
*/
   	
