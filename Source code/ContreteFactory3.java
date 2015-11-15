
public class ContreteFactory3 extends AbstractFactory {
	@Override
	public StoreData getStoreData() {
		StoreData SD = new StoreData3();
		return SD;
	}

	@Override
	public Pay_Msg getPayMsg() {
		Pay_Msg PM = new Pay_Msg3();
		return PM;
	}
	@Override
	public DisplayMenu getDspm() {
		DisplayMenu DM = new DisplayMenu3();
		return DM;
	}

	@Override
	public SetInitialValues getinitvals() {
		SetInitialValues IV = new SetInitialValues2();
		return IV;
	}

	@Override
	public PumpGasUnit getpumpunit() {
		PumpGasUnit PU = new PumpGasUnit2();
		return PU;
	}
}
