/*
	============= Java Language =============

	Static Keyword ->

		1) Static Block
		2) Static Variable ->
			* In Static Block,static Variable is Initialize.
			* We can't Initialize the Static variable in Non-static Method but we can use their
		3) Static Method
*/

class StaticVariable{
	
	static int y;

	static{

		System.out.println("In Static Block");

	}

	StaticVariable(){

		y = 10;

		System.out.println("In Constructor : " + y);
	}

	public static void main(String[] args){

		StaticVariable st = new StaticVariable();
		
		System.out.println("In Main Y : " + y);
		
	}
}

/* Output ->
	
   	In Static Block
	In Constructor : 10
	In Main Y : 10
*/

