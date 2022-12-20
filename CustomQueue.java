package assignments;

public class CustomQueue {
	int front;
	int end;
	int capacity = 10;
	int[] object;

	public CustomQueue() {
		front = -1;
		end = -1;
		object = new int[capacity];
	}

	Boolean isEmpty() {
		return end <= front;
	}

	int enqueue(int data) {

		return object[++end] = data;
	}

	int dequeue() throws DataStructureException {
		if (isEmpty()) {
			throw new DataStructureException("Queue is Empty");
		}
		// System.out.println("Queue is Empty");

		if (end >= front) {
			return object[++front];
		}

		return (Integer) null;
	}

	int size() {
		return end - front;
	}

	public int front() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");

		}
		return capacity;
	}

}
