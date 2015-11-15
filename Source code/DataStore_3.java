
public class DataStore_3 extends DataStore {
	static float Rprice;
	static float Pprice;
	static float cash;
	static int L;
	
	public void set_price(float a, float b) {
		Rprice = a;
		Pprice = b;
	}

	public void set_cash(float c) {
		cash = c;
	}
	
	public void set_L(int g) {
		L = g;
	}
	
	public float get_cash() {
		return cash;
	}

	public int get_L() {
		return L;
	}

	public float get_Rprice() {
		return Rprice;
	}
	
	public float get_Pprice() {
		return Pprice;
	}
	
}
