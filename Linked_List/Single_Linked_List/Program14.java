/*
	Reverse the Linked List in a Pair

	i/p : 3 -> 1 -> 5 -> 9 -> 4 -> null
	o/p : 1 -> 3 -> 9 -> 5 -> 4 -> null
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
class ReverseSLLInPair{
	static ListNode reverseSLL(ListNode head){
                if(head ==  null || head.getNext() == null){
                        return head;
                }

                ListNode temp = null;
                ListNode next = null;
                ListNode curr = head;
                while(curr != null){
                        next = curr.getNext();
                        curr.setNext(temp);
                        temp = curr;
                        curr = next;
                }
                return temp;
        }
    	static ListNode reverseInPair(ListNode head){
		if(head ==  null || head.getNext() == null){
			return head;
		}
		
		ListNode newHead = head.getNext();
		ListNode next = head.getNext().getNext();

		newHead.setNext(head);
		head.setNext(reverseSLL(next));
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

		ListNode node = reverseInPair(head);

		iterateList(node);	//Reverse SLL
	}
}
