
public class S3 extends State {
	public int id = 4;

	public void Cancel(){
		o.Cancel_Msg();
	}
	public void SelectGas(int g){
		o.SetPrice(g);
	}
	public int GetID(){
		return id;
	}
}
