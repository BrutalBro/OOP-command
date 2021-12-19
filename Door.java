public class Door {
	private boolean isOpen = false;

	public void open() {
		if (!isOpen) {
			isOpen = true;

			System.out.println("Opening door...");
		}
	}

	public void close() {
		if (isOpen) {
			isOpen = false;

			System.out.println("Closing door...");
		}
	}

	public boolean getIsOpen() {
		return isOpen;
	}
}