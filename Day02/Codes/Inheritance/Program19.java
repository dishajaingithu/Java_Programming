/*
	============= Java Language =============

	Inheritance ->
*/

//1)
private class Parent1{

}
class Child1 extends Parent1{

}
//error: modifier private not allowed here


//2)
final class Parent2{

}
class Child2 extends Parent2{

}
//error: cannot inherit from final Parent


//3)
static class Parent3{

}
class Child3 extends Parent3{

}
//error: modifier static not allowed here


//4)
class Parent4{

	static class Mama{

	}
}
class Child4 extends Parent4{

}
//No Error.
