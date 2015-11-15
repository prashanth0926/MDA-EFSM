import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GasPump_3 {

	public void GasPump3() {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			MDA_EFSM m = new MDA_EFSM();
			String input;
			DataStore temp = new TemporaryDS();
			DataStore d3 = new DataStore_3();
			Scanner in = new Scanner(System.in);
			int gaspump = 3;
			while (true) {
				System.out.println("\nOperations in GP3 Class are:\n");
				System.out
						.println("a)Activate, b)Start, c)PayCash, d)Cancel, e)Regular, f)Premium, g)StartPump, h)PumpLiter, i)StopPump, j)Receipt, k)NoReceipt l)quit \n\n");
				input = br.readLine();

				switch (input) {

				case "a": { // Activate
					System.out.println("Operation:  Activate(float a, float b)");
					System.out.println("\n Enter value of the parameter a:");
					float a = in.nextFloat();
					System.out.println("\n Enter value of the parameter b:");
					float b = in.nextFloat();
					temp.set_GP(gaspump);
					d3.set_price(a, b);
					m.Activate();
					break;
				}

				case "b": { // Start
					System.out.println("Operation:  Start()");
					m.Start();
					break;
				}

				case "c": { // PayCash
					System.out.println("Operation:  PayCash(float c)");
					System.out.println("Enter value of the parameter c:");
					float c = in.nextFloat();
					d3.set_cash(c);
					m.PayCash();
					break;
				}

				case "d": { // Cancel
					System.out.println("Operation:  Cancel()");
					m.Cancel();
					break;
				}

				case "e": { // Regular
					System.out.println("Operation:  Regular()");
					m.SelectGas(1);
					temp.set_gtype(1);
					break;
				}

				case "f": { // Premium
					System.out.println("Operation:  Premium()");
					m.SelectGas(3);
					temp.set_gtype(3);
					break;
				}

				case "g": { // StartPump
					System.out.println("Operation:  StartPump()");
					m.StartPump();
					break;
				}

				case "h": { // PumpLiter
					System.out.println("Operation:  PumpLiter()");
					float price=0;
					int g = temp.get_gtype();
					if (g == 1){
						price = d3.get_Rprice();
					} else if (g == 3){
						price = d3.get_Pprice();
					}
					float cash = d3.get_cash();
					int L = d3.get_L();
					if (cash < (L + 1) * price) {
						m.StopPump(); // insufficient funds
					} else {
						m.Pump();
					}
					break;
				}

				case "i": { // StopPump
					System.out.println("Operation:  StopPump()");
					m.StopPump();
					break;
				}

				case "j": { // Receipt
					System.out.println("Operation:  Receipt()");
					m.Receipt();
					break;
				}

				case "k": { // NoReceipt
					System.out.println("Operation:  NoReceipt()");
					m.NoReceipt();
					break;
				}

				case "l": {// exit

					break;
				}
				default:
					System.out.println("\n\n Incorrect choice");
				}

			}
		} catch (Exception e) {
			System.out.println("\n\n EXCEPTION:" + e);
		}

	}

}
