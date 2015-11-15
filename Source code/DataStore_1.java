
public class DataStore_1 extends DataStore {
	
	static int price;
	static int cash;
	static int G;
	static int w;
	
	public void set_Rprice1(int a) {
		price = a;
	}

	public void set_cash1(int c) {
		cash = c;
	}
	
	public void set_G(int g) {
		G = g;
	}
	
	public void set_w(int w1) {
		w = w1;
	}

	public int get_cash1() {
		return cash;
	}

	public int get_G() {
		return G;
	}

	public int get_Rprice1() {
		return price;
	}
	
	public int get_w() {
		return w;
	}
	

}
