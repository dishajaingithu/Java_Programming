/*
	============= Java Language =============

	Class & Object ->

	* Class is a Blurprint or Prototype from which object is created.
	* Object is a Instance of Class.
	* Characteristics of object 
	 	1) State -> Represents the data of an object.
	 	2) Behaviour -> Represents the behaviour object such as deposit,withdraw etc.
	 	3) Identity -> It is used by the JVM tp identity each object uniquely.
*/

class Cricketer{		// Name of class is Cricketer

	int jersey_No;		// instance variable

	public static void main(String[] args){

		Cricketer rohit = new Cricketer();	// Create the Instance of class Cricketer
		rohit.jersey_No = 45;			// Gives the value to the instance variable.

		System.out.println("Jersey No : " + rohit.jersey_No);
	}
}
/* Output ->

   	Jersey No : 45
*/

