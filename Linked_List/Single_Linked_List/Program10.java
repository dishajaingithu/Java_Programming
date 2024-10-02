/*
	Is Singly Linked List is having the Loop or Not.

	Note : No Dublicates Nodes.

	ex : 3 -> 4 -> 1 -> 5  -> 9	
				  |
		       | <- 8 <- 6
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
class LoopInSLL{
    	static boolean hasLoop(ListNode head){

		if(head == null || head.getNext() == null){
			return false;
		}

		ListNode slow = head;
		ListNode fast = head;
		while(fast == null || fast.getNext() == null){
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			
			if(slow == fast){
				return true;
			}
		}
		return false;
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

		iterateList(head); 

		System.out.println(hasLoop(head));
	}
}
