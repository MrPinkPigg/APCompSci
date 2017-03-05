/**
 * A button class that does things when you press it
 *
 * @author Aaron Knestaut
 */
public class KnestautButton implements PushButton {
	int buttonCount = 0;

	/**
	 * pushes the button to change the button state
	 */
	public void push() {
		buttonCount++;
	}

	/**
	 * returns whatever the current button state is
	 * 
	 * @return whatever is required by the current button state
	 */
	public String buttonState() {
		if(buttonCount == 0){
			return "Did you ever hear the Tragedy of Darth Plagueis the Wise? It's a Sith legend. Darth Plagueis was a Dark Lord of the Sith so powerful and so wise, he could use the Force to influence the midi-chlorians to create...life. He had such a knowledge of the Dark Side, he could even keep the ones he cared about...from dying. He became so powerful, he only thing he was afraid of was losing his power...which, eventually of course, he did. Unfortunately, he taught his apprentice everything he knew. Then his apprentice killed him in his sleep. Ironic. He could save others from death...but not himself.";
		}
		else if(buttonCount == 1){
			return "It's over Anakin, I have the high ground!";
		}
		else{
			return "reddit.com/r/prequelmemes";
		}
	}
}