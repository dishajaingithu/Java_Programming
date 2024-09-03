/*
	============= Java Language =============

	Upcasting-Downcasting ->
		
		double ->
			float ->
				int -> 
					char ->
*/

class UpcastDowncast{

	UpcastDowncast(){

		System.out.println("In No-argumnet Constructor");
	}

	UpcastDowncast(int x){

		System.out.println("In Parameterized Constructor");
	}
	public static void main(String[] args){

		UpcastDowncast ud1 = new UpcastDowncast();
		UpcastDowncast ud2 = new UpcastDowncast(10);
		UpcastDowncast ud3 = new UpcastDowncast('D');
		//UpcastDowncast ud4 = new UpcastDowncast(10.5f);//error:incompatible types:possible lossy conversion from float to int
	}
}

/* Output ->

   	In No-argumnet Constructor
	In Parameterized Constructor
	In Parameterized Constructor
*/
