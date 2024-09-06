class StringMethods{

	public static void main(String[] args){

		String name = "Disha Bardiya";

		System.out.println(name.length());		//13

		System.out.println(name.substring(1));		//isha Bardiya
		System.out.println(name.substring(3));		//ha Bardiya
		System.out.println(name.substring(1,4));	//ish
		//System.out.println(name.substring(-1));
		System.out.println(name.charAt(2));		//s

		System.out.println(name.indexOf("Bardiya"));	//6
		System.out.println(name.indexOf("isha",3));	//-1
	
		char[] nameArray = name.toCharArray();
		System.out.println(nameArray[0]);		//D
		System.out.println(nameArray[3]);		//h

		String nameFromArray = new String(nameArray);
		System.out.println(nameFromArray);		//Disha Bardiya
	}
}
/* Output :

13
isha Bardiya
ha Bardiya
ish
s
6
-1
D
h
Disha Bardiya
*/
