package assignments;

public class CustomStack {
	int[] stack;
	int capacity;
	int top;

	public CustomStack() {
		capacity = 10;
		top = -1;
		stack = new int[capacity];
	}

	public Boolean isEmpty() {
		return top == -1;
	}

	public Boolean isFull() {
		return top == capacity - 1;
	}

	public int push(int data) {
		if (isFull()) {
			System.out.println("Stack is Full");
		}
		return stack[++top] = data;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		}
		return stack[top--];
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("stack is Empty");
		}
		return stack[top];
	}

	public void show() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");

		}

	}

}
