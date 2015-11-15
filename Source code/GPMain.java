import java.io.BufferedReader;
import java.io.InputStreamReader;


public class GPMain {
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("\n\t\t\t\tCS 586 : Spring 2014");
			System.out.println("\t\t\t  TESTING PROJECT - GASPUMP CLASS");
			System.out.println("\t\t\t Prashanth");
			System.out.println("Select any GasPump");
			System.out.println("1. GP1");
			System.out.println("2. GP2");
			System.out.println("3. GP3");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int ch = Integer.parseInt(br.readLine());
			switch(ch)
			{
			case 1:
				System.out.println("GasPump1");
				GasPump_1 gp1 = new GasPump_1();
				gp1.GasPump1();
				break;
				
			case 2:
				System.out.println("GasPump2");
				GasPump_2 gp2 = new GasPump_2();
				gp2.GasPump2();
				break;
				
			case 3:
				System.out.println("GasPump3");
				GasPump_3 gp3 = new GasPump_3();
				gp3.GasPump3();
				break;
			
			default: System.out.println("Incorrect choice");
			}
			
			
		}catch(Exception e){System.out.println("EXCEPTION"+e);}

	}
}