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

	abstract void price();
}
class Natraj extends HindustanPencils{

	void price(){
		System.out.println("Low Cost");
	}
}

class Apsara extends HindustanPencils{

	void price(){
		System.out.println("High Cost");
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
High Cost

Note : We can't create the object of abstract class but we create reference of abstract class.
*/
