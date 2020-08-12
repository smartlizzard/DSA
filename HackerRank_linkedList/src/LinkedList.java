
public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
	}

	private static LinkedList insert(LinkedList list, int data) {

		Node n = new Node(data);

		if (list.head == null) {
			list.head = n;
		} else {
			Node last = list.head;

			while (last.next != null) {
				last = last.next;
			}
			last.next = n;
		}
		return list;

	}

	public static void traverse(LinkedList list) {

		Node n = list.head;

		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}

	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);
		traverse(list);
	}
	/*
	 * 
	 * static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int
	 * data)
	 *  { 
	 *  SinglyLinkedListNode n= new SinglyLinkedListNode(data);
	 * if(head==null)
	 * { head =n; return head;
	 * 
	 * }else{
	 *  SinglyLinkedListNode c=head;
	 *   while(c.next!=null)
	 *   { c=c.next; 
	 *   }
	 * 
	 * 
	 * c.next=n; }
	 * 
	 * 
	 * return head;
	 */


}