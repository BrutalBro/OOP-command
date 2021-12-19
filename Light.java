public class Light {
	private boolean isOn = false;
	private double brightness = 0; // 0-1

	public void sswitch() {
		isOn = !isOn;
		brightness = isOn ? 1 : 0;

		System.out.println("Light is " + (isOn ? "on" : "off"));
	}

	public void setBrightness(double v) {
		if (isOn) {
			if (v > 0 && v <= 1) {
				brightness = v;
				System.out.println("Brightness value is set to " + v);
			} else {
				System.out.println("Brightness value must be (0; 1]");
			}
		}
	}
}