/*
	Singly Linked List :

	* In Singly Linked List have the value and Address of next Data.
	* 'head' is Point out to the first list.
	* ex : head->|3|200|->|4|300|->|5|null|
	        100  100      200      300
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
class Test{
    	static ListNode deleteAtkth(ListNode head, int k) {        
        	if (head == null) {
         	   	return null;
        	}
        	if (k == 1) {
            		return head.getNext();
        	}
        	ListNode current = head;
        	for (int i = 1; i < k - 1 && current != null; i++) {
            		current = current.getNext();
        	}
        	if (current == null || current.getNext() == null) {
            		return head;
        	}
        	current.setNext(current.getNext().getNext());  
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
		ListNode head = new ListNode(3);
		ListNode node1 = new ListNode(5);
		ListNode node2 = new ListNode(6);
		ListNode node3 = new ListNode(7);

		head.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		iterateList(head); // Call the Function and print the Linked List

		ListNode node = deleteAtkth(head,3);

		iterateList(node);	//After delete at End
	}
}
