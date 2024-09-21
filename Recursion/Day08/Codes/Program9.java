/*
	Q.Check the Given String is Palindrome or Not.
*/
import java.util.Scanner;
class PalindromString{
	static boolean isPalindromeHelper(String str,int s1, int e1){
		if(s1>=e1)
			return true;

		if(!Character.isLetterOrDigit(str.charAt(s1))){
			return isPalindromeHelper(str,s1+1,e1);
		}

		if(!Character.isLetterOrDigit(str.charAt(e1))){
			return isPalindromeHelper(str,s1,e1-1);
		}

		if(Character.toLowerCase(str.charAt(s1)) != Character.toLowerCase(str.charAt(e1))){
			return false;
		}

		return isPalindromeHelper(str,s1+1,e1-1);
	}
	static boolean isPalindrome(String str){
		
		return isPalindromeHelper(str,0,str.length()-1);

	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();

		if(isPalindrome(str)){
			System.out.println("Palindrome String");
		}else{
			System.out.println("Not Palindrome String");
		}
	}
}
