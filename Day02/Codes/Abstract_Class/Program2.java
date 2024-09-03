/*
	============= Java Language =============

	Abstract Class :

	SYNTAX :
	abstract class XYZ{

		abstract void abc();
	}
*/
abstract class AaiBaba{

	abstract void marry();
}
class Child extends AaiBaba{

	void marry(){
		System.out.println("XYZ");
	}
	public static void main(String[] args){
		AaiBaba obj = new Child();
		obj.marry();
	}
}
/* Output :
	
XYZ
*/
