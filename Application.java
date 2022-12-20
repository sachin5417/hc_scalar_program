package assignments;

import DataStructures.CustomStack;

public class Application {

	public static final CustomStack stack = new CustomStack();
	public static final CustomQueue queue = new CustomQueue();
	public static final ArrayDs array = new ArrayDs();
	public static final CustomLinkedList linkedlist = new CustomLinkedList();

	public static void main(String[] args) {

		Menu mainMenu = new Menu("Data Structures");
		Menu arrayMenu = new Menu(1, "Array");
		Menu stackMenu = new Menu(2, "Stack");
		Menu queueMenu = new Menu(3, "Queue");
		Menu linkedListMenu = new Menu(4, "Linked list");

		mainMenu.addMenuItem(arrayMenu);
		mainMenu.addMenuItem(stackMenu);
		mainMenu.addMenuItem(queueMenu);
		mainMenu.addMenuItem(linkedListMenu);

		arrayMenu.addMenuItem(new MenuItem(1, "insert"));
		arrayMenu.addMenuItem(new MenuItem(2, "display"));

		// stackMenu.setParent(mainMenu);
		stackMenu.addMenuItem(new MenuItem(1, "push()"));
		stackMenu.addMenuItem(new MenuItem(2, "pop()"));
		stackMenu.addMenuItem(new MenuItem(3, "peek()"));
		// stackMenu.back();
		// stackMenu.display();

		// Menu queueMenu1 = new Menu("Queue");
		// queueMenu.setParent(mainMenu);
		queueMenu.addMenuItem(new MenuItem(1, "enqueue()"));
		queueMenu.addMenuItem(new MenuItem(2, "dequeue()"));
		queueMenu.addMenuItem(new MenuItem(3, "front()"));
		// queueMenu.back();
		// queueMenu.display();

		// Menu listMenu = new Menu("LinkedList");
		// linkedListMenu.setParent(mainMenu);

		linkedListMenu.addMenuItem(new MenuItem(1, "InsertAtPosition()"));
		linkedListMenu.addMenuItem(new MenuItem(2, "Delete()"));
		linkedListMenu.addMenuItem(new MenuItem(3, "Traverse()"));

		// listMenu.back();
		// listMenu.display();

		mainMenu.display();

	}
}
