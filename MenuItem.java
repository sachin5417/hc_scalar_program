package assignments;

public class MenuItem {

	private String name;
	private int order;
	private MenuItem parent;

	public MenuItem(int order, String name) {

		this.name = name;
		this.order = order;
	}

	public MenuItem(int order, String name, MenuItem parent) {
		super();
		this.name = name;
		this.order = order;
		this.parent = parent;
	}

	public MenuItem() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public MenuItem getParent() {
		return parent;
	}

	public void setParent(MenuItem parent) {
		this.parent = parent;
	}

	public void display() {
		System.out.println(order + " - " + name);
	}

	public void back() {
		if (parent != null) {
			display();
		} else {
			System.exit(0);
		}

	}

}
