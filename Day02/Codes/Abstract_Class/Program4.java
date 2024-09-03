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

	public static void main(String[] args){

		Parent p = new Parent();

	}
}
/* Error :

 error: Parent is not abstract and does not override abstract method property() in GrandFather
class Parent extends GrandFather{
^
*/
