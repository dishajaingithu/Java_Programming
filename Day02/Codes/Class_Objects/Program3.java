/*
	============= Java Language =============

	Static Keyword ->

		1) Static Block ->
			* Static Block is Always Come first and then Main Block Code Executes.
			* For the Network OR JDBC Connection Static Block is Used.
			* In Static Block,static Varibale is Initialize.
			* In Static Block,return statemnet is present at the end of the block.
		2) Static Variable
		3) Static Method
*/

class StaticDemo{
	
	static int y = 20;
	static{

		int x = 10;
		System.out.println(x);
		System.out.println(y);
		System.out.println("In Static Block - 1");
	}

	public static void main(String[] args){

		System.out.println("In Main-Block");
	}

	static{
		System.out.println("In Static Block - 2");
	}
}

/* Output ->
 	
	10
	20
	In Static Block - 1
	In Static Block - 2
	In Main-Block
*/
