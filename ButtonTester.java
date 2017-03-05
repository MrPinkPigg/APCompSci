public class ButtonTester {
	public static void main (String args[]){
		PushButton b = getAButton();

		System.out.println(b.buttonState());

		b.push();
		System.out.println(b.buttonState());

		b.push();
		System.out.println(b.buttonState());
	}

	public static PushButton getAButton(){
		return new KnestautButton();
	}
}