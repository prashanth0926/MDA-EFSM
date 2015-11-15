
public class ConcreteFactory1 extends AbstractFactory {

	@Override
	public StoreData getStoreData() {
		StoreData SD = new StoreData1();
		return SD;
	}

	@Override
	public Pay_Msg getPayMsg() {
		Pay_Msg PM = new Pay_Msg1();
		return PM;
	}
	@Override
	public DisplayMenu getDspm() {
		DisplayMenu DM = new DisplayMenu1();
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
