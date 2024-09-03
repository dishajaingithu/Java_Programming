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
	
	static int y = 20;

	void m1(){

		//static int x = 10;	//error: illegal start of expression

		System.out.println("Y : " + y);	// 20
	}

	public static void main(String[] args){

		//static int z = 30;	//error: illegal start of expression

		StaticVariable st = new StaticVariable();
		st.m1();

		System.out.println("In Main Y : " + y);
	}
}

/* Output ->
	
   	Y : 20
	In Main Y : 20
*/

