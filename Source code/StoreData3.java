
public class StoreData3 extends StoreData {
	public void StoreData(){
		DataStore ds3 = new DataStore_3();
		float Rprice=ds3.get_Rprice();
		float Pprice=ds3.get_Pprice();
		System.out.println("\n\nPrice of Regular gas is: $"+Rprice);
		System.out.println("Price of Premium gas is: $"+Pprice);
	}
}
