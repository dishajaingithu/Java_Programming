/*
	============= Java Language =============

	Practice Code ->
*/

class Demo{

	int x = 10;

	Demo(){
		this(x);				// Error Here.
		int x = 10;
		System.out.println("This.X : " + this.x);	
	}

	Demo(int y){

		System.out.println("In Parameterized Constructor");
	}
	public static void main(String[] args){

		Demo d1 = new Demo(20);
	}
}

/* Error ->
 	
   	 error: cannot reference x before supertype constructor has been called
                this(x);
                     ^
*/
