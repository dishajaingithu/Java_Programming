/*
	============= Java Language =============

	X Repeated ->
*/

class XRepeated{
	
	int x = 10;

	XRepeated(){
		int x = 20;
		System.out.println("In No-argumnet Constructor");
	}

	XRepeated(int x){

		//int x = 30;	// error: variable x is already defined in constructor XRepeated(int)
		System.out.println("In Parameterized Constructor");
		System.out.println("X : " + x);
	}

	public static void main(String[] args){

		XRepeated xr1 = new XRepeated();
		XRepeated xr2 = new XRepeated(40);
	}
}

/* Output ->

   	In No-argumnet Constructor
	In Parameterized Constructor
	X : 40
*/
