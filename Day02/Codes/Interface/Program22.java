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
			II)Cloneble Interface :
				* Interface belong in the 'java.lang' package.
				* If generates the replica(copy) of an object with different name.
				* If indicates clone() method of Object class.
				* If we do not implement the the cloneble interface in class and invoke the
				  clone() method,it throws the 'ClassNotSupportedException'



*/

import java.util.Scanner;
class Product implements Cloneable{

	int pId;
	String pName;
	double pCost;

	Product(int pId,String pName, double pCost){

		this.pId = pId;
		this.pName = pName;
		this.pCost = pCost;
	}

	void showDetail(){

		System.out.println("Product ID : " + pId);
		System.out.println("Product Name : " + pName);
		System.out.println("Product Cost : " + pCost);
	}

	public static void main(String[] args)throws CloneNotSupportedException{

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Product Id : ");
		int pId = sc.nextInt();

		System.out.print("Enter Product Name : ");
		String pName = sc.next();

		System.out.print("Enter Product Cost : ");
		double pCost = sc.nextDouble();

		System.out.println("-------Product Details-------");

		Product p1 = new Product(pId,pName,pCost);
		Product p2 = (Product)p1.clone();

		p2.showDetail();
	}
}
/* Output :

Enter Product Id : 139872
Enter Product Name : Printer
Enter Product Cost : 3459.67
-------Product Details-------
Product ID : 139872
Product Name : Printer
Product Cost : 3459.67
*/
