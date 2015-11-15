
public class S5 extends State {
	public int id = 6;
	
	public void Pump(){
		o.GasPumpedMsg();
		o.PumpGasUnit();
	}
	public void StopPump(){
		o.StopMsg();
	}
	public int GetID(){
		return id;
	}
}
