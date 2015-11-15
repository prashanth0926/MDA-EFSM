
public class DataStore_2 extends DataStore {
	
	static float Rprice;
	static float Sprice;
	static int G;
	static int w;
	
	public void set_price(float a, float b) {
		Rprice = a;
		Sprice = b;
	}
	
	public void set_G(int g) {
		G = g;
	}
	
	public int get_G() {
		return G;
	}

	public float get_Rprice() {
		return Rprice;
	}
	
	public float get_Sprice() {
		return Sprice;
	}
	
}
