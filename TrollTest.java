public class TrollTest {
	public static void main (String args[]) {
		Troll a = new Troll();
		Troll b = new Troll();

		a.collect(5);
		b.collect(15);

		System.out.println("troll a: " + a.myMoney());
		System.out.println("troll b: " + b.myMoney());

		System.out.println("total: " + Troll.treasury());
		Troll.emptyTreasury();
		System.out.println("reset total: " + Troll.treasury());
	}
}