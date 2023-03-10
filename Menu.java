package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu extends MenuItem {

	private List<MenuItem> item = new ArrayList<MenuItem>();
	// private TreeSet<MenuItem> item = new TreeSet<>();
	private static boolean isLevelOne = true;

	public Menu(String title) {
		super(0, title);
	}

	public Menu() {
		super();
	}

	public Menu(int order, String title) {
		super(order, title);
		addMenuItem(new MenuItem(0, "Back"));
	}

	public void addMenuItem(MenuItem mi) {
		mi.setParent(this);
		item.add(mi);
	}

	public List<MenuItem> getMenuItem() {
		return item;
	}
//	public TreeSet<MenuItem> getMenuItem() {
//		return item;
//	}

	public void display() {
		if (isLevelOne) {
			isLevelOne = false;
			item.forEach(item -> item.display());
			isLevelOne = true;
			System.out.println("Enter your choice:");
			int choice = new Scanner(System.in).nextInt();
			if (choice == 0) {
				goBack();
			} else {
				MenuItem mi = getMenuItem().stream().filter(menuItem -> menuItem.getOrder() == choice).findFirst()
						.orElse(null);

				if (mi == null) {
					System.out.println("Invalid choice");
					display();
				} else if (mi instanceof Menu) {
					mi.display();
				} else {
					String operationName = mi.getName();
					String dataStructureName = mi.getParent().getName();

					switch (dataStructureName) {
					case "Stack":
						callStackOperation(operationName);

					case "Queue":
						callQueueOperation(operationName);

					case "Array":
						callArrayOperation(operationName);
					}

				}
			}

		} else {
			super.display();
		}

	}

	private void callArrayOperation(String operationName) {
		switch (operationName) {
		case "insert":
			System.out.println("Enter data: ");
			int data = new Scanner(System.in).nextInt();
			Application.array.insert(data);
			back();
			break;

		case "display":
			try {
				Application.array.display();
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
			back();
			break;
		}
	}

	private void callStackOperation(String operationName) {
		switch (operationName) {
		case "push()":
			System.out.println("Enter data: ");
			try {
				int data = new Scanner(System.in).nextInt();
				Application.stack.push(data);
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}

			back();
			break;

		case "pop()":
			try {
				System.out.println("element popped: " + Application.stack.pop());
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}

			back();
			break;

		case "peek()":
			System.out.println("Top Element: " + Application.stack.peek());
			back();
			break;

		}

	}

	private void callQueueOperation(String operationName) {
		switch (operationName) {
		case "enqueue()":
			System.out.println("Enter data: ");
			int data = new Scanner(System.in).nextInt();
			Application.queue.enqueue(data);
			back();
			break;

		case "dequeue()":
			try {
				System.out.println("element popped: " + Application.queue.dequeue());
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
			back();
			break;

		case "front()":
			System.out.println("Top Element: " + Application.queue.front());
			back();
			break;

		}

	}

	private void callLinkedListOperation(String operationName) {
		switch (operationName) {
		case "Add()":
			System.out.println("Enter data: ");
			int data = new Scanner(System.in).nextInt();
			Application.linkedlist.add(data);
			back();
			break;

		case "delete()":
			Application.linkedlist.deleteFirst();
			back();
			break;

		case "Traverse()":
			Application.linkedlist.traverse();
			back();
			break;

		case "Display()":
			System.out.println("Elements in LinkedList are: ");
			Application.linkedlist.display();
			back();
			break;

		}

	}

	public void goBack() {
		if (getParent() != null) {
			getParent().display();

		} else {
			System.exit(0);
		}

	}
}
