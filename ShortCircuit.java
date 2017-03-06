public class ShortCircuit{
	
	/**
	 * Short circuiting happens with boolean expressions
	 * once java knows something is true or false it will
	 * stop evaluating at that point
	 */
	public static void main(String args[]){
		int x = 1;
		//stops checking after 'x < 3' is true bc it's or
		if(x < 3 || x / 0 == 5){
			System.out.println("Will this print, or will there be an exception?");
		}

		int y = 4;
		//stops checking after 'y < 3' is false bc it's and
		if(y < 3 && y / 0 == 5){
			System.out.println("Will this print, or will there be an exception?");
		}
		else{
			System.out.println("jbsaifbiusbdfiusiubsai");
		}
	}
}