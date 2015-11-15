
public class StoreData2 extends StoreData {
	public void StoreData(){
		DataStore ds2 = new DataStore_2();
		float Rprice=ds2.get_Rprice();
		float Sprice=ds2.get_Sprice();
		System.out.println("\n\n Price of Regular gas is: $"+Rprice);
		System.out.println("Price of Super gas is: $"+Sprice);
	}
}
