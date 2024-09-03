/*
	============= Java Language =============

	Instance ->

		1) Instance Block 
		2) Instance Variable 
		3) Instance Method ->
			* In Instance Method,we can use the static and instance variable.
			* To call the instance Method,we have to compulsory make the Object.
*/

class InstanceMethod{

	int x = 10;
	{
		int y = 20;
	}

	void method1(){

		int z = 30;
		System.out.println("In Method 1");
		System.out.println("Z : " + z);
	}

	public static void main(String[] args){

		InstanceMethod im = new InstanceMethod();
		im.method1();
	}
}

/* Output ->
 
  	In Method 1
	Z : 30
*/
