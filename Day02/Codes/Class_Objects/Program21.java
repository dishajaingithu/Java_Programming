/*
	============= Java Language =============

	Static & Instance Concept ->
		* Instance Variable is Object Specific.
		* Static Variable is Common for All Objects ex.Apartment's Swimming Pool.km
*/

class Demo{

	int x = 10;
	static int y = 20;

	Demo(){
		System.out.println("In No-Argument Conatructor");
		System.out.println("X : " + x);
	}
}

class DemoMain{

	public static void main(String[] args){

		Demo obj1 = new Demo();
		Demo obj2 = new Demo();

		obj1.x = 30;

		System.out.println("X : " + obj1.x);
		System.out.println("X : " + obj2.x);

		obj1.y = 40;
		System.out.println();

		System.out.println("Y : " + obj1.y);
		System.out.println("Y : " + obj2.y);
	}
}

/*Output ->

  	In No-Argument Conatructor
	X : 10
	In No-Argument Conatructor
	X : 10
	X : 30
	X : 10

	Y : 40
	Y : 40
*/
