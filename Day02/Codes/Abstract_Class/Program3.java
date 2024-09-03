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

	void Property(){
		System.out.println("Property");
	}
	public static void main(String[] args){
		AaiBaba obj = new AaiBaba();
		obj.marry();
	}
}
/* Error :
	
error: AaiBaba is abstract; cannot be instantiated
                AaiBaba obj = new AaiBaba();
                              ^
*/
