/*
	============= Java Language =============

	Practice Code ->
*/

class Demo{

	Demo(){
		int x = 10;
		System.out.println("This.X : " + this.x);	// error: cannot find symbol
	}
	public static void main(String[] args){

		Demo d1 = new Demo();
	}
}
