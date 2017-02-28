public class Dog {
	int numLegs = 4;
	double tailLen = 9.2;
	String name = "Sparky";

	public int getLegs() {return numLegs;}
	public double getTailLen() {return tailLen;}
	public String getName() {return name;}
	
	public void accident() {
		numLegs--;
		tailLen = tailLen  / 2;
	}
	
	public void rename(String n) {
		name = n;
	}
	
	public String noise() {
		return "Woof";
	}
}