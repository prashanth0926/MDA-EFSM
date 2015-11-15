
public class PumpGasUnit1 extends PumpGasUnit {
public void PumpGasUnit(){
	DataStore ds = new DataStore();
	TemporaryDS t = new TemporaryDS();
	int gaspump = t.get_GP();
	if (gaspump==1){
		ds = new DataStore_1();
	}
	else if (gaspump==2){
		ds = new DataStore_2();
	}
	int G=ds.get_G();
	ds.set_G(G+1);
	int G1 = ds.get_G();
	System.out.println("\n\n The amount of Gas pumped is: "+G1+" Gallons\n\n");
}
}
