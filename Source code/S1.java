
public class S1 extends State {
	public int id = 2;

	public void PayCredit(){
		System.out.println("\n\nWaiting for approval\n");
	}
	
	public void PayCash(){
		o.StoreCash();
		o.SetW(0);
		o.DisplayMenu();
	}
	public int GetID(){
		return id;
	}
}
