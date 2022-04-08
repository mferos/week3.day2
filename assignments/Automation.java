package week3.day2.assignments;

public class Automation extends MultipleLanguages implements Language, TestTool{

	public static void main(String[] args) {
		Automation automation = new Automation();
		automation.Java();
		automation.Selenium();
		automation.python();
		automation.ruby();

	}

	public void Selenium() {
		System.out.println("Selenium from Test tool Interface");
	}

	public void Java() {
		System.out.println("Java from Language Interface");
	}

	@Override
	public void ruby() {
		System.out.println("Ruby from Multiple Language abstract class");
	}

}
