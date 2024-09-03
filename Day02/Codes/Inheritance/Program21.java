/*
	============= Java Language =============

	Code Practice 1  ->
*/
class Demo{

	Demo(String s){
		System.out.println("String");
	}

	Demo(Object obj){
		System.out.println("Object");
	}
	public static void main(String[] args){

		Demo d = new Demo(new String("Disha"));
	}
}
/* Output :
	
   	String
*/
