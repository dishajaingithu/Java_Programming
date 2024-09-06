class StringLearning{

	public static void main(String[] args){

		String s1 = "Disha";
		String s2 = new String("Disha");
		String s3 = "Disha";

		System.out.println(s1 == s2);	//false
		System.out.println(s1 == s3);	//true

		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s3)); //true
	}
}

/* Output :

false
true
true
true

* == 		-> Check the addresses of String
* .equals() 	-> Check the Actual Value of String
*/
