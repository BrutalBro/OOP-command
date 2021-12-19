public class SmartGarage {
	Light l;
	Door d;
	Workbench w;
	public SmartGarage(Light l, Door d, Workbench w) {
		this.l = l;
		this.d = d;
		this.w = w;
	}

	public void switchLight() {
		l.sswitch();
	}

	public void setBrightness(double v) {
		l.setBrightness(v);
	}

	public void switchDoor() {
		if (d.getIsOpen())
			d.close();
		else
			d.open();
	}

	public void craftItem(String item) {
		w.craftItem(item);
	}

	public void cancelAllCrafts() {
		w.cancelAll();
	}
}