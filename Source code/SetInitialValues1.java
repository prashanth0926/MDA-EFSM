
public class SetInitialValues1 extends SetInitialValues {
public void SetInitialValues(){
	DataStore ds = new DataStore();
	TemporaryDS t = new TemporaryDS();
	int gaspump = t.get_GP();
	if (gaspump==1){
		ds = new DataStore_1();
	}
	else if (gaspump==2){
		ds = new DataStore_2();
	}	
	ds.set_G(0);
	System.out.println("setting initial value of G to 0");
}
}
