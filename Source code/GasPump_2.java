
import java.io.*;
import java.util.*;

public class GasPump_2 {
	
		public void GasPump2(){
			try
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				MDA_EFSM m = new MDA_EFSM();
				String input;
				DataStore temp = new TemporaryDS();
				DataStore d2 = new DataStore_2();
				int gaspump = 2;
				temp.set_GP(gaspump);
				Scanner in = new Scanner(System.in);
				while(true)
				{
					System.out.println("\nOperations in GP2 Class are:\n");
					System.out.println(" a)Activate, b)Start, c)PayCredit, d)Reject, e)Approved, f)Cancel, g)Regular, h)Super, i)StartPump, j)PumpGallon, k)StopPump, l)quit");
					input = br.readLine();
										
					switch(input)
					{

			case "a" : { //Activate
					 System.out.println("\n\nOperation:  Activate(float a, float b)");
					 System.out.println("\nEnter value of the parameter a:");				
					 float a = in.nextFloat();
					 System.out.println("Enter value of the parameter b:");				
					 float b = in.nextFloat();
					 d2.set_price(a,b);
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

			case "g": { //Regular
				    System.out.println("Operation:  Regular()");
					m.SelectGas(1);
					temp.set_gtype(1);
					break;
		   		    }
			
			case "h": { //Super
				System.out.println("Operation:  Super()");
				m.SelectGas(2);
				temp.set_gtype(2);
				break;
		    	}

			case "i": { //StartPump
				    	System.out.println("Operation:  StartPump()");	
				    	m.StartPump();
					break;
				    }


			case "j": { //PumpGallon
				    	System.out.println("Operation:  PumpGallon()");
				    		m.Pump();	
					break;
				    }
			
			case "k": { //StopPump
				    	System.out.println("Operation:  StopPump()");		
				    	m.StopPump();
				    	m.Receipt();
					break;
				    }
			
			case "l": {//exit
				
				break;
			}
			default: System.out.println("\n\n Incorrect choice");
				}
				
			}
		}
			catch(Exception e)
			{
				System.out.println("\n\n EXCEPTION:"+e);
			}
	}

}
