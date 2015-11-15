
public class PumpGasUnit2 extends PumpGasUnit {
	public void PumpGasUnit(){
		DataStore ds = new DataStore_3();
		
		int L=ds.get_L();
		ds.set_L(L+1);
		int L1 = ds.get_L();
		System.out.println("\n\n The amount of Gas pumped is: "+L1+" Liters\n\n");
	}
}
