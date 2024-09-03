/* ============= Switch Statement =============*/

class LearnSwitch{

	public static void main(String[] args){

		int month = 2;
		String month_str = " ";

		switch(month){
			case 1: month_str = "January";
			break;

			case 2: month_str = "Febuary";
			break;

			case 3: month_str = "March";
			break;

			default :
				System.out.println("This is not valid month");
				break;
		}

		System.out.println(month_str);
	}
}
/* Output :

Febuary
*/
