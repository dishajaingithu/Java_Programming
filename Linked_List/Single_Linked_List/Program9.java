/*
	Middle of the Linked List
*/
class ListNode{
	private int value;
	private ListNode next;
	ListNode(int value){
		this.value = value;
	}
	public int getData(){
		return value;
	}
	public void setData(int value){
		this.value = value;
	}	
	public ListNode getNext(){
		return next;
	}
	public void setNext(ListNode next){
		this.next = next;
	}
}
class MiddleOfSLL{
    	static ListNode middleOfSLL(ListNode head){
		
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.getNext()!=null){
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return slow;
	}
	static void iterateList(ListNode head){

		ListNode temp = head;
		while(temp != null){
			System.out.print(temp.getData() + " -> ");
			temp = temp.getNext();
		}
		System.out.println();
	}
	public static void main(String[] args){
		ListNode head = new ListNode(3);
		ListNode node1 = new ListNode(5);
		ListNode node2 = new ListNode(6);
		ListNode node3 = new ListNode(7);
		ListNode node4 = new ListNode(8);
		ListNode node5 = new ListNode(9);

		head.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);

		iterateList(head); // Call the Function and print the Linked List

		System.out.println("Middle Of SLL : " + middleOfSLL(head).getData());
	}
}
