/*
	Sort the Linked List.

	i/p : 3 -> 1 -> 5 -> 9 -> 4 -> null
	o/p : 1 -> 3 -> 4 -> 5 -> 9 -> null
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
class SortSLL{
	static ListNode findMiddleNode(ListNode head){
		ListNode slow = head;
		ListNode fast = head.getNext();

		while(fast != null && fast.getNext()!=null){
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return slow;
	}

	static ListNode merge(ListNode h1, ListNode h2){
		ListNode head = null;
		ListNode prev = null;

		while(h1 != null && h2 != null){
			ListNode node = null;
			
			if(h1.getData() < h2.getData()){
				node = new ListNode(h1.getData());
				h1 = h1.getNext();
			}else{
				node = new ListNode(h2.getData());
				h2 = h2.getNext();
			}
			if(head == null){
				head = node;
		
			}else{
				prev.setNext(node);
			}
			prev = node;
		}

		while(h1!=null){
			ListNode node = new ListNode(h1.getData());
			if(head == null){
                                head = node;
                        }else{
                                prev.setNext(node);
                        }
			prev = node;
			h1 = h1.getNext();
		}
		while(h2!=null){
                        ListNode node = new ListNode(h2.getData());
                        if(head == null){
                                head = node;
                        }else{
                                prev.setNext(node);
                        }
			prev = node;
			h2 = h2.getNext();
                }
		return head;
	}

    	static ListNode mergeSort(ListNode head){
		//Base Condition
		if(head == null || head.getNext() == null){
			return head;
		}

		ListNode mid = findMiddleNode(head);
		ListNode leftH = head;
		ListNode rightH = mid.getNext();

		mid.setNext(null);

		ListNode leftHNew = mergeSort(leftH);
		ListNode rightHNew = mergeSort(rightH);

		//Merge the Two Sorted LinkedList
		return merge(leftHNew , rightHNew);
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
		ListNode head = new ListNode(2);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(5);
		ListNode node5 = new ListNode(6);
		ListNode node6 = new ListNode(7);

		head.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);
		System.out.print("Before Sort : ");
		iterateList(head);	//Before Sort
		
		System.out.println();

		ListNode node = mergeSort(head);
		
		System.out.print("After Sort : ");
		iterateList(node);	//After Sort
	}
}
