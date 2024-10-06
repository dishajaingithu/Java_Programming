/*
	Reverse the Linked List by 'K' times.
	i/p : 5 -> 1 -> 2 -> 9 -> 6 -> 8 -> null , k = 3
	o/p : 9 -> 6 -> 8 -> 5 -> 1 -> 2 -> null
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
class RotateKTimes{
	static int length(ListNode head) {
        	int len = 0;
        	while (head != null) {
            		len++;
           		head = head.getNext();
        	}
        	return len;
    	}	
    	static ListNode rotateKElements(ListNode head,int k){
		if(head ==  null || head.getNext() == null || k == 0){
			return head;
		}
		if(k == 0){
			return head;
		}
		int len = length(head);
		k = k % len;
		ListNode temp = head;
		int count = 1;
		while(count < len-k){
			temp = temp.getNext();
			count++;
		}
		ListNode newHead = temp.getNext();
		temp.setNext(null);
		//find the new tail node in the newHead
		ListNode tail = newHead;
		while(tail.getNext() != null){
			tail = tail.getNext();
		}
		tail.setNext(head);
		return newHead;
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

		head.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);

		iterateList(head); // Call the Function and print the Linked List

		ListNode node = rotateKElements(head,3);

		iterateList(node);	//Reverse SLL
	}
}
