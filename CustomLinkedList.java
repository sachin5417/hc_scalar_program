package assignments;

import DataStructures.Node;

public class CustomLinkedList {
	// head
	private Node head;
	// tail
	private Node tail;
	// no of nodes
	private int size;

	public Boolean isEmpty() {
		return head == null;
	}

	public int size() {
		return size;
	}

	// insert at head

	public void addFirst(int element) {
		Node node = new Node(element);
		if (isEmpty()) {
			head = node;
			tail = node;
		} else {
			node.setNext(head);
			head = node;
		}
		size++;
	}

	public void addLast(int element) {
		Node node = new Node(element);
		if (isEmpty()) {
			head = node;
			tail = node;
		} else {
			tail.setNext(tail);
			tail = node;
		}
		size++;
	}

	// traverse

	public void traverse() {
		System.out.println("printing LinkedList elements");
		System.out.println("head -->");
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.getData() + "-->");
			temp = temp.getNext();
		}
		System.out.println("null");
	}

	// search

	public boolean search(int searchElement) {
		boolean response = false;
		Node temp = head;
		while (temp != null) {
			if (temp.getData() == searchElement) {
				response = true;
				break;
			}
			temp = temp.getNext();
		}
		return response;

	}

	public int delete(int element) {
		if (element == 0) {
			return deleteFirst();
		}
		if (element == size - 1) {
			return deleteLast();
		}
		Node prev = get(element - 1);
		int val = prev.next.data;
		prev.next = prev.next.next;
		return val;
	}

	private Node get(int element) {
		Node node = head;
		for (int i = 0; i < element; i++) {
			node = node.getNext();
		}
		return node;
	}

	public int deleteLast() {
		if (size <= 1) {
			return deleteFirst();
		}
		Node secondLast = get(size - 2);
		int val = tail.data;
		tail = secondLast;
		tail.next = null;
		return val;
	}

	public int deleteFirst() {
		int val = head.getData();
		head = head.getNext();
		if (head == null) {
			tail = null;
		}
		size--;
		return val;
	}

//	public void insertAtPosition(int index, int element) {
//		boolean response = false;
//		Node temp = head;
//		while (temp != null) {
//			if (temp.getData() == givenElement) {
//				break;
//			}
//			temp = temp.getNext();
//		}
//		if (temp != null) {
//			Node node = new Node(element);
//		}
//		return response;
//		if (head == null) {
//			addFirst(element);
//			return;
//		}
//		if (index == size) {
//			addLast(element);
//			return;
//		}
//		Node temp = head;
//		for (int i = 0; i < index; i++) {
//			temp = temp.next;
//		}
//		Node node = new Node(element, temp.next);
//		node.next = head;
//		temp.next = node;
//		System.out.println("!$^#######");
//		size++;
//	}
//
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -->");
			temp = temp.next;
		}
	}

	public void add(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = head;
		} else {
			tail.next = node;
			tail = tail.next;
		}
		tail.next = null;

	}

//	public static void main(String[] args) {
//		CustomLinkedList cl = new CustomLinkedList();
//		cl.add(7);
//		cl.add(90);
//		cl.add(45);
//		cl.display();
//
//	}
}
