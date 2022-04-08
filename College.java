package week3.day2;

public class College extends University{

	@Override
	public void ug() {
		System.out.println("Under Graduation");
		
	}
	
	public static void main(String[] args) {
		
		College college = new College();
		college.pg();
		college.ug();
					
	}

}
