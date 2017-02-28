public class Shiba extends Dog {
	public Shiba() {
		this.tailLen = 3.5;
		this.name = "Doggo";
	}

	//Can change body of methods in subclasses
	//Must have identical parameters and return types
	public String noise() {return "Bork";}
}