/*
	============= Java Language =============

	Instance ->

		1) Instance Block 
		2) Instance Variable ->
			* Non-Static Global Variable called the Inatance Variable.
			* Memory for Instance Variable assign only after the Object Creation.
		3) Instance Method
*/

class InstanceVariable{

	int x = 10;
	{
		int y = 20;
	}

	void method1(){

		int z = 30;
		System.out.println("Z : " + z);
	}

	public static void main(String[] args){

		InstanceVariable iv = new InstanceVariable();
		System.out.println("X : " + iv.x);
		//System.out.println("Y : " + iv.y);	          error: cannot find symbol
                						//System.out.println("Y : " + iv.y);
                                              						   //   ^
  								//symbol:   variable y
  								//location: variable iv of type InstanceVariable
		iv.method1();
	}
}

/* Output ->
 
  	X : 10
	Z : 30
*/
