public class Main {
	public static void main(String[] args) {
		SmartGarage sg = new SmartGarage(new Light(), new Door(), new Workbench());

		sg.switchLight();
		sg.setBrightness(0.14123);
		sg.switchLight();

		sg.switchDoor();
		sg.switchDoor();

		sg.craftItem("Claw hamer");
	}
}