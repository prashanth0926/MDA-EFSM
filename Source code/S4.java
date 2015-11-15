
public class S4 extends State {
	public int id = 5;
	
	public void StartPump(){
		o.SetInitialValues();
		o.Ready_Msg();
	}
	public int GetID(){
		return id;
	}
}
