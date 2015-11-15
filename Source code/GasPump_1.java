
import java.io.*;
import java.util.*;

public class GasPump_1 {
	
		public void GasPump1()
		{
			try
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				MDA_EFSM m = new MDA_EFSM();
				String input;
				DataStore temp = new TemporaryDS();
				DataStore d1 = new DataStore_1();
				Scanner in = new Scanner(System.in);
				int gaspump = 1;
				
				while(true)
				{
					temp.set_GP(gaspump);
					System.out.println("\n\n Operations in GasPump1 Class are:\n");
					System.out.println(" a)Activate, b)Start, c)PayCredit, d)Reject, e)Approved, f)Cancel, g)PayCash, h)StartPump, i)PumpGallon, j)StopPump, k)quit");
					input = br.readLine();
					
					switch(input)
					{

				case "a" : { //Activate()
					 System.out.println("\n\n Operation:  Activate(int a)");
					 System.out.println("Enter value of the parameter a:");				
					 int a = in.nextInt();
					 d1.set_Rprice1(a);
					 m.Activate();
					 break;
		   		  }
			  
			case "b": { //Start
					System.out.println("Operation:  Start()");
					m.Start();
					break;
				    }

			case "c": { //PayCredit 
				    	System.out.println("Operation:  PayCredit()");
				    	m.PayCredit();
					break;
				    }

			case "d": { //Reject 
				    	System.out.println("Operation:  Reject()");
				    	m.Reject();
					break;
				    }

			case "e": { //Approved
				    	System.out.println("Operation:  Approved()");
				    	m.Approved();
					break;
				    }
			
			case "f": { //Cancel
		    	System.out.println("Operation:  Cancel()");
		    	m.Cancel();
			break;
		    } 
			
			case "g": { //PayCash
				      	System.out.println("\n\n Operation:  PayCash(int c)");
					System.out.println("Enter value of the parameter c:");				
					int c = in.nextInt();
					d1.set_cash(c);
					m.PayCash();
					break;
		   		    }

			case "h": { //StartPump
				    	System.out.println("Operation:  StartPump()");	
				    	m.SelectGas(1);
				    	temp.set_gtype(1);
				    	m.StartPump();
					break;
				    }


			case "i": { //PumpGallon
				    	System.out.println("Operation:  PumpGallon()");
				    	int price =d1.get_Rprice1();
				    	int cash=d1.get_cash1();
				    	int G=d1.get_G();
				    	int w = d1.get_w();
				    	if((w==1)){
				    		m.Pump();
				    	}
				    	else if((w==0)&&(cash < (G+1)*price)){
				    		m.StopPump();  //insufficient funds
				    		m.Receipt();
				    	}
				    	else
				    	{
				    		m.Pump();
				    	}
				    	
					break;
				    }
			
			case "j": { //StopPump
				    	System.out.println("Operation:  StopPump()");		
				    	m.StopPump();
				    	m.Receipt();
					break;
				    }
			
			case "k": {//exit
				break;
			}
			default: System.out.println("Incorrect choice");
				}
				
			}
		}
			catch(Exception e)
			{
				System.out.println("EXCEPTION:"+e);
			}
}
}