
public class ConcreteFactory2 extends AbstractFactory {

	@Override
	public StoreData getStoreData() {
		StoreData SD = new StoreData2();
		return SD;
	}

	@Override
	public Pay_Msg getPayMsg() {
		Pay_Msg PM = new Pay_Msg2();
		return PM;
	}
	@Override
	public DisplayMenu getDspm() {
		DisplayMenu DM = new DisplayMenu2();
		return DM;
	}

	@Override
	public SetInitialValues getinitvals() {
		SetInitialValues IV = new SetInitialValues1();
		return IV;
	}

	@Override
	public PumpGasUnit getpumpunit() {
		PumpGasUnit PU = new PumpGasUnit1();
		return PU;
	}

}
