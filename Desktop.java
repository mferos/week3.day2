package week3.day2;

public class Desktop implements Hardware, Software {

	public static void main(String[] args) {
		
		Desktop desktop = new Desktop();
		desktop.hardwareResources();
		desktop.softwareResources();
	}

	public void softwareResources() {
		System.out.println("Software Resources");
		
	}

	public void hardwareResources() {
		System.out.println("Hardware Resources");
	}

}
