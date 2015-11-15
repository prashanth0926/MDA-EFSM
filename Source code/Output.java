public class Output {

	DataStore ds = new DataStore();
	TemporaryDS t = new TemporaryDS();
	AbstractFactory af1 = new ConcreteFactory1();
	AbstractFactory af2 = new ConcreteFactory2();
	AbstractFactory af3 = new ContreteFactory3();

	public void StoreData() {
		StoreData SD;
		int GP = t.get_GP();
		if (GP == 1) {
			SD = af1.getStoreData();
			SD.StoreData();
		}
		if (GP == 2) {
			SD = af2.getStoreData();
			SD.StoreData();
		}
		if (GP == 3) {
			SD = af3.getStoreData();
			SD.StoreData();
		}

	}

	public void Pay_Msg() {

		Pay_Msg PM;
		int GP = t.get_GP();
		if (GP == 1) {
			PM = af1.getPayMsg();
			PM.Pay_Msg();
		}
		if (GP == 2) {
			PM = af2.getPayMsg();
			PM.Pay_Msg();
		}
		if (GP == 3) {
			PM = af3.getPayMsg();
			PM.Pay_Msg();
		}

	}

	public void StoreCash() {
		int GP = t.get_GP();

		if (GP == 1) {
			ds = new DataStore_1();
			int cash = ds.get_cash1();
			System.out.print("\n\n Cash inserted = $" + cash);
		}
		if (GP == 3) {
			ds = new DataStore_3();
			float cash = ds.get_cash();
			System.out.print("\n\n Cash inserted = $" + cash);
		}
	}

	public void SetW(int i) {
		ds = new DataStore_1();
		int GP = t.get_GP();
		if (GP == 1) {
			if (i == 0) {
				ds.set_w(0);
				System.out.print("\n\n The value of w is set to o");
			} else if (i == 1) {
				ds.set_w(1);
				System.out.print("\n\n The value of w is set to 1");
			}
		}

	}

	public void DisplayMenu() {
		int GP = t.get_GP();
		DisplayMenu DM;

		if (GP == 1) {
			DM = af1.getDspm();
			DM.DisplayMenu();
		}
		if (GP == 2) {
			DM = af2.getDspm();
			DM.DisplayMenu();
		}
		if (GP == 3) {
			DM = af3.getDspm();
			DM.DisplayMenu();
		}

	}

	public void Reject_Msg() {
		System.out.println("\n\n Credit Card has been rejected");
	}

	public void Cancel_Msg() {
		System.out.println("\n\n Transaction has been cancelled");
	}

	public void SetPrice(int g) {
		int GP = t.get_GP();
		if (GP == 1) {
			ds = new DataStore_1();
			int price = ds.get_Rprice1();
			t.set_price(price);
			System.out.println("\n\n Price of selected gas is $" +ds.get_Rprice1());
		}
		if (GP == 2) {
			ds = new DataStore_2();
			if (g == 1) {
				float price = ds.get_Rprice();
				t.set_price(price);
				System.out.println("\n\n Price of selected gas is $" + price);
			} else if (g == 2) {
				float price = ds.get_Sprice();
				t.set_price(price);
				System.out.println("\n\n Price of selected gas is $" + price);
			}
		}
		if (GP == 3) {
			ds = new DataStore_3();
			if (g == 1) {
				float price = ds.get_Rprice();
				t.set_price(price);
				System.out.println("\n\n Price of selected gas is $" + price);
			} else if (g == 3) {
				float price = ds.get_Pprice();
				t.set_price(price);
				System.out.println("\n\n Price of selected gas is $" + price);
			}
		}
	}

	public void SetInitialValues() {
		int GP = t.get_GP();
		SetInitialValues IV;

		if (GP == 1) {
			IV = af1.getinitvals();
			IV.SetInitialValues();
		}
		if (GP == 2) {
			IV = af2.getinitvals();
			IV.SetInitialValues();
		}
		if (GP == 3) {
			IV = af3.getinitvals();
			IV.SetInitialValues();
		}

	}

	public void Ready_Msg() {
		System.out.println("\n\n The GasPump is ready to dispose gas");

	}

	public void GasPumpedMsg() {
			System.out.println("\n\n The GasPump has started pumping \n");
	}

	public void PumpGasUnit() {
		int GP = t.get_GP();
		PumpGasUnit PU;

		if (GP == 1) {
			PU = af1.getpumpunit();
			PU.PumpGasUnit();
		}
		if (GP == 2) {
			PU = af2.getpumpunit();
			PU.PumpGasUnit();
		}
		if (GP == 3) {
			PU = af3.getpumpunit();
			PU.PumpGasUnit();
		}

	}

	public void PrintReceipt() {
		int GP = t.get_GP();
		if (GP == 1) {
			ds = new DataStore_1();
			int G = ds.get_G();
			float price1 = t.get_price();
			int price = (int)price1;
			float total1 = (price * G);
			int total = (int)total1;
			t.set_total(total);
			System.out.println(G + " Gallons of Regular gas has been pumped");
			System.out.println("\n Totalprice for the gas pumped is:  $"
					+ total);
			float cash1 = ds.get_cash();
			int cash = (int)cash1;
			int w = ds.get_w();
			if (w == 0) {
				if (cash > total) {
					System.out.println("\n Cash returned:  $" + (cash - total));
				}
			}
		}
		if (GP == 2) {
			ds = new DataStore_2();
			int G = ds.get_G();
			int g = t.get_gtype();
			if (g == 1) {
				System.out.println(G
						+ " Gallons of Regular gas has been pumped");
			} else if (g == 2) {
				System.out.println(G + " Gallons of Super gas has been pumped");
			}
			float price = t.get_price();
			float total = (price*G);
			t.set_total(total);
			System.out.println("\n Totalprice for the gas pumped is $" + total);
		}
		if (GP == 3) {
			ds = new DataStore_3();
			int L = ds.get_L();
			int g = t.get_gtype();
			if (g == 1) {
				System.out
						.println(L + " Liters of Regular gas has been pumped");
			} else if (g == 3) {
				System.out.println(L + "Liters of Premium gas has been pumped");
			}
			float price = t.get_price();
			float total = (price*L);
			t.set_total(total);
			float cash = ds.get_cash();
			System.out.println("\nTotal price for the gas pumped is $" + total);
			if (cash > total) {
				System.out.println("\n Cash returned:  $" + (cash - total));
			}
		}
	}

	public void StopMsg() {
		System.out.println("\n\n GasPump has been stopped \n\n");
		int GP = t.get_GP();
		if (GP == 1) {
			ds = new DataStore_1();
			int w = ds.get_w();
			float cash = ds.get_cash();
			float total = t.get_total();
			if (w == 0) {
				if (cash > total) {
					System.out.println("\n Cash returned:  $" + (cash - total));
				}
			} else if (GP == 3) {
				ds = new DataStore_3();
				cash = ds.get_cash();
				total = t.get_total();
				if (cash > total) {
				System.out.println("\n Cash returned:  $" + (cash - total));
				}
			}
		}
	}
}
