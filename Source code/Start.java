
public class Start extends State {
	public int id = 0;
		
	public void Activate() {
		o.StoreData();
	}
	public int GetID(){
		return id;
	}
}
