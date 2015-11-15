
public class S2 extends State {
	public int id = 3;
	
	public void Reject(){
		o.Reject_Msg();
	}
	
	public void Approved(){
		o.SetW(1);
		o.DisplayMenu();
	}
	public int GetID(){
		return id;
	}

}
