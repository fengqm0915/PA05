package lesson25;

public class Secretary extends Employee {
	
	public Secretary(int years) {
		super(years);
	}
	
	public void takeDictation(String text) {
		System.out.println("Taking dictation of text: "+text);
	}
	
	public int getSeniorityBonus() {
		return 0;
	}

}
