/**
 * Collects troll money, outputs troll money amount, outputs total
 * money of all trolls, and sets all values to 0
 * @author Aaron Knestaut
 */
public class Troll
{
	private static double totalMoola;
	private double money;

	/**
	 * Collects a trolls money and adds it to the total
	 * @param input takes in value
	 */
	public void collect(double input){
		money += input;
		totalMoola += money;
	} // collect money

	/**
	 * outputs the money of the troll
	 * @return money money of the trolls
	 */
	public double myMoney(){
		return money;
	} // returns this troll's money

	/**
	 * @return totalMoola total money of all trolls
	 */
	public static double treasury(){
		return totalMoola;
	} // returns total money collected by all trolls

	/**
	 * sets total money of all trolls to 0
	 */
	public static void emptyTreasury(){
		totalMoola = 0;
	} // sets the total money collected by all trolls to 0
}