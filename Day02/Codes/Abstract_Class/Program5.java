/*
	============= Java Language =============

	Abstract Class :

	SYNTAX :
	abstract class XYZ{

		abstract void abc();
	}
*/
abstract class GrandFather{

	GrandFather(){
		System.out.println("In GrandFather Constructor");
	}

	abstract void property();
}
class Parent extends GrandFather{

	Parent(){
		System.out.println("In Parent Constructor");
	}

	void property(){

		System.out.println("In Property");
	}
	public static void main(String[] args){

		Parent p = new Parent();
		p.property();

	}
}
/* Output :

In GrandFather Constructor
In Parent Constructor
In Property
*/
