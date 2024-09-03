/*
	============= Java Language =============

	Recursive Constructor Concept in the Code ->
*/

class Demo{

	Demo(){
		this();	
		System.out.println("In No-argumnet Constructor");	
	}
	public static void main(String[] args){

		Demo d1 = new Demo();
	}
}

/* Error ->

	 error: recursive constructor invocation
        	Demo(){
        	    ^
*/
