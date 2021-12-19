public class Door {
	private boolean isOpen = false;

	public void open() {
		if (!isOpen) {
			isOpen = true;

			System.out.println("Opening boy door...");
		}
	}

	public void close() {
		if (isOpen) {
			isOpen = false;

			System.out.println("Closing boy door...");
		}
	}

	public boolean getIsOpen() {
		return isOpen;
	}
}