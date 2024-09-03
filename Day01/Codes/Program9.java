class ArithmeticOperator{

	public static void main(String[] args){

		int x = 20;
		int y = 10;

		System.out.println(x + y);	// 30
		System.out.println(x - y);	// 10
		System.out.println(x * y);	// 200
		System.out.println(x / y);	// 2
		System.out.println(x % y);	// 0

	}
}

   class RelationalOperator{

	public static void main(String[] args){

		int x = 20;
		int y = 10;

		System.out.println(x > y);	// true
		System.out.println(x < y);	// false
		System.out.println(x >= y);	// true
		System.out.println(x <= y);	// false
		System.out.println(x == y);	// false
		System.out.println(x != y);	// true
	}
}

class LogicalOperator{

	public static void main(String[] args){

		boolean x = true;		// In Logical Operator,boolean value is Required.
		boolean y = false;

		System.out.println(x && y);	// false
		System.out.println(x || y);	// true
	}
}


class BitwiseOperator{

	public static void main(String[] args){

		int x = 5;
		int y = 4;

		System.out.println(x & y);	// 4
		System.out.println(x | y);	// 5
		System.out.println(x << y);	// 80 -> x * y^2
		System.out.println(x >> y);	// 0  -> x/y^2
		System.out.println(x ^ y);	// 1
	}
}



class TernaryOperator{

	public static void main(String[] args){

		int x = 10;
		int y = 20;

		System.out.println((x > y) ? x : y);	// 20
	}
}
