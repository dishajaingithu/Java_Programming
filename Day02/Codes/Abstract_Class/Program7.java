/*
	============= Java Language =============

	Abstract Class :

	SYNTAX :
	abstract class XYZ{

		abstract void abc();
	}

	Real Time Example :-
*/
abstract class HindustanPencils{
	int x = 10;
	abstract void price();
}
class Natraj extends HindustanPencils{
	int x = 20;
	void price(){
		System.out.println("Low Cost");
		System.out.println("X : " + x);
	}
}
class Apsara extends HindustanPencils{
	int x = 40;
	void price(){
		System.out.println("High Cost");
		System.out.println("X : " + x);
	}
}
class Pencils{

	public static void main(String[] args){

		HindustanPencils hp1 = new Natraj();
		hp1.price();

		HindustanPencils hp2 = new Apsara();
		hp2.price();
	}
}
/* Output :

Low Cost
X : 20
High Cost
X : 40

Note : We can't create the object of abstract class but we create reference of abstract class.
*/
