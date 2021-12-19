import java.util.ArrayDeque;

public class Workbench {
	private boolean isCrafting = false;
	private ArrayDeque<String> queue = new ArrayDeque();

	public void craftRandomItem() {
		isCrafting = true;

		System.out.println("Crafting random item...");
	}

	public void craftItem(String item) {
		isCrafting = true;
		queue.addLast(item);

		System.out.println("Crafting item \'" + item + "\'");
	}

	public void cancelAll() {
		isCrafting = false;
		queue = new ArrayDeque();
	}
}