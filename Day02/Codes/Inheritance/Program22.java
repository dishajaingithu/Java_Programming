/*
	============= Java Language =============

	Code Practice 1  ->
*/
class Demo{

	Demo(String s){
		System.out.println("String");
	}

	Demo(StringBuffer sb){
		System.out.println("String Buffer");
	}
	public static void main(String[] args){

		Demo d = new Demo(null);
	}
}
/* Output :
	
 error: reference to Demo is ambiguous
                Demo d = new Demo(null);
                         ^
  both constructor Demo(String) in Demo and constructor Demo(StringBuffer) in Demo match
*/
