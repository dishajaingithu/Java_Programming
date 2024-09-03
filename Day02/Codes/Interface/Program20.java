/*
	============= Java Language =============

	Interface :

	1) Marker Interface.
		* A Marker Interface is an interface that doesn't have any method or constants
		  inside it.
		* It Provides Runtime type information about the Objects.
		SYNTAX :
			interface A {
				
			}

		* Marker Interface are :
			I)Serializable Interface.
				* It is a Marker Interface in java that is defined in the 'java.io' package.
				* If a class implement the Serializable interface,we can serialize or
				  deserialize the state of an object of that class.
				* Serialization - Converting an Object into byte stream.(Object state is read
				                  from the memory and written into a file or database.
				* Deserialization - Converting byte strem into an Object(Object state reading
				                    from a file or database and written back into memory).
							
						    	   Serializaton
								->
						    Oject		Stream
						    		<-
							   Deserialization
				* Serialization(Writing) can be achieved with the 'ObjectOutputStream' class
				* Deserialization(reading) can be achieved with the 'ObjectInputStream' class

*/

import java.io.*;
class Employee implements Serializable{

	int empId;
	String empName;

	Employee(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
}
class SerializationExample{

	public static void main(String[] args){

		try{
			Employee emp1 = new Employee(1233,"Andrew");

			//Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("employee data.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(emp1);
			out.flush();

			//closing stream
			out.close();

			System.out.println("Data has been read from the file");
		}catch(Exception e){

			e.printStackTrace();
		}
	}
}
/* Output :
	Data has been read from the file
*/
