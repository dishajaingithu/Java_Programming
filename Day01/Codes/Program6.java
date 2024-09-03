/* ============= Conditionals =============*/

class LearnConditionals{

	public static void main(String[] args){

		int favTemp = 25;
		int currTemp = 47;
		String opinion;

		if(currTemp < favTemp - 5){
			opinion = "It's little Cold";
		}else if(currTemp < favTemp - 10){
			opinion = "It's very Cold";
		}else if(currTemp < favTemp - 20){
			opinion = "It's Freezing";
		}else if(currTemp <= favTemp){
			opinion = "It's a best Climate";
		}else{
			opinion = "It's Hot";
		}
		System.out.println(opinion);
	}
}
/* Output :

It's Hot
*/
