/*
	Add the Two Linked List.
        
	2 -> 3 -> 4
	1 -> 3 -> 5
	-----------
	3 -> 6 -> 9	
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
class LinkedListSum {
	
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
    static ListNode sumUntil(ListNode h1, ListNode h2){
	    ListNode temp1 = h1;
	    ListNode temp2 = h2;
		
	    ListNode prev = null;
	    ListNode head = null;
	    int carry = 0;
	    while(temp1 != null && temp2 != null){
		    int sum = temp1.getData()+temp2.getData() + carry;
		    carry = sum / 10;
		    int value = sum % 10;
		    ListNode curr = new ListNode(value);
		    if(prev==null){
			    head = curr;
			    prev = curr;
		    }else{
			    prev.setNext(curr);
		    }
		    prev = curr;
		    temp1 = temp1.getNext();
		    temp2 = temp2.getNext();
	    }
	    while(temp1 != null){
		    int data = temp1.getData()+carry;
		    carry = data/10;
		    int val = carry % 10;
		    ListNode curr = new ListNode(val);
		    prev.setNext(curr);
		    prev = curr;
		    temp1 = temp1.getNext();
	    }

	    while(temp2 != null){
		    int data = temp2.getData()+carry;
		    carry = data/10;
		    int val = carry % 10;
		    ListNode curr = new ListNode(val);
		    prev.setNext(curr);
		    prev = curr;
		    temp2 = temp2.getNext();
	    }
	    return head;
    }

    static ListNode add(ListNode head1, ListNode head2){
	if(head1 == null && head2 == null){
		return null;
	}
	if(head1 == null){
		return head2;
	}
	if(head2 == null){
		return head1;
	}

	ListNode newH1 = reverseSLL(head1);
	ListNode newH2 = reverseSLL(head2);
	ListNode sumH = sumUntil(newH1, newH2);

	ListNode sumFinal = reverseSLL(sumH);
	return sumFinal;
    }
     static void iterateList(ListNode head){

                ListNode temp = head;
                while(temp != null){
                        System.out.print(temp.getData() + " -> ");
                        temp = temp.getNext();
                }
                System.out.println();
     }
    public static void main(String[] args) {

        ListNode head1 = new ListNode(2);
        ListNode second1 = new ListNode(3);
        ListNode third1 = new ListNode(4);
        

        head1.setNext(second1);;
        second1.setNext(third1);
        third1.setNext(null);

	ListNode head2 = new ListNode(1);
	ListNode second2 = new ListNode(3);
	ListNode third2 = new ListNode(5);

	head2.setNext(second2);
	second2.setNext(third2);
	third2.setNext(null);

	ListNode sum = add(head1,head2);

	iterateList(sum);
    }
}


