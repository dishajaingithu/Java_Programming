/*
	============= Java Language =============

	Constructor ->

	* Name of the Class and Constructor is Same.
	* When we create the Object,Implicitly calls go to the Contructor.
	* In Java,Default Constructor is always present.
	* Constructor is Used to initialize the Instance/Object Variable.
	* Constructor is a Special type of Method having no return Type.
	* Their are three types of Constructor ->
		1) Default Constructor.
		2) No-argument Constructor.
		3) Parameterized Constructor.
		4) Copy Constructor.
*/

class Human{

	int age;	//Instance Variable
	
	//No-argument Constructor
	Human(){
		this(5);
		System.out.println("In No-Argument Constructor");
		// this(5);  error: call to this must be first statement in constructor
	}
	
	//Parameterized Constructor
	Human(int x){

		System.out.println("In Parameterized Constructor");
		System.out.println("X : " + x);
	}
	
	//Copy Constructor
	Human(Human obj){

		this.age = obj.age;
		System.out.println("In Copy Constructor");
		System.out.println("Age : " + obj.age);
	}

	public static void main(String[] args){

		Human h1 = new Human();
		h1.age = 23;

		Human h2 = new Human(20);

		Human h3 = new Human(h1);
	}
}

/* Output ->
	
   	In Parameterized Constructor
	X : 5
	In No-Argument Constructor
	In Parameterized Constructor
	X : 20
	In Copy Constructor
	Age : 23
*/
