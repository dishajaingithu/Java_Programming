/*
	Reverse the Linked List in size of k.

	i/p : 3 -> 1 -> 5 -> 9 -> 4 -> null , int k = 3
	o/p : 5 -> 1 -> 3 -> 9 -> 4 -> null
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
class ReverseSLLInKth{
    	static ListNode reverseInK(ListNode head, int k){
		if(head ==  null || head.getNext() == null){
			return head;
		}
		
		ListNode current = head;
		int count = 0;
		while(current!= null && count < k){
			current = current.getNext();
			count++;
		}

		if(count == k){
			current = reverseInK(current,k);
			while(count > 0){
				ListNode temp = head.getNext();
				head.setNext(current);
				current = head;
				head = temp;
				count--;
			}
			head = current;
		}
		return head;
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
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(4);
		ListNode node4 = new ListNode(5);
		ListNode node5 = new ListNode(6);
		ListNode node6 = new ListNode(7);

		head.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);

		iterateList(head); // Call the Function and print the Linked List
		int k = 3;
		ListNode node = reverseInK(head,k);

		iterateList(node);
	}
}
