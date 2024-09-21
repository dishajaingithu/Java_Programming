/*
	Q.Generate all binary strings of length n without consecutive 1's
	
	Recursive Idea:
	1) If the last character of the binary string is 0,the next character can either be '0' or '1'
	2) If the last character of the binary string is 1,the next character can must be '1'(to avoid 
	   consecutive 1's).

	i/p : n = 3
	o/p : 000
	      001
              010
              100
              101	      
*/
import java.util.Scanner;
class GenerateBinary{

	static void generateBinary(int n, String str){

		if(str.length() == n){
			System.out.println(str);
			return;
		}

		generateBinary(n,str+"0");

		if(str.length()==0 || str.charAt(str.length()-1) !='1'){
			generateBinary(n,str+"1");
		}
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();

		generateBinary(n,"");
	}
}
