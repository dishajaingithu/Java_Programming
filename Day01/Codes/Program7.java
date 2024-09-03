/* ============= Conditionals =============*/

class LearnNestedConditionals{

	public static void main(String[] args){

		boolean isAgreed = true;
		if(isAgreed){
			boolean readyForDinner = true;
			if(readyForDinner){
				System.out.println("Going for Dinner");
			}else{
				System.out.println("Going for Coffee");
			}
		}else{
			boolean areFriendsOnly = true;
			if(areFriendsOnly){
				System.out.println("Party With Friends");
			}else{
				System.out.println("Will Sleep Tonight");
			}
		}
	}
}
/* Output :

Going for Dinner
*/
