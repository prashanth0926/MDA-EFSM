
public class TemporaryDS extends DataStore {
	static int gaspump=0;
	static int gtype=0;
	static float price=0;
	static float total=0;
	public void set_GP(int gas) {
		gaspump = gas;
	}

	public int get_GP() {
		return gaspump;
		
	}
	
	public void set_gtype(int g){
		gtype = g;
	}
	
	public int get_gtype(){
		return gtype;
	}
	
	public void set_price(float z){
		price=z;
	}
	
	public float get_price(){
		return price;
	}
	
	public void set_total(float y){
		total=y;
	}
	
	public float get_total(){
		return total;
	}
}
