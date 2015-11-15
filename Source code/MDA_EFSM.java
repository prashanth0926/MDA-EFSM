
public class MDA_EFSM {
	
	State s = new State();
	State strt = new Start();
	State s0 = new S0();
	State s1 = new S1();
	State s2 = new S2();
	State s3 = new S3();
	State s4 = new S4();
	State s5 = new S5();
	State s6 = new S6();
	
	int id = 0;
	public void Activate(){
		s=strt;
		s.Activate();
		id = s.GetID();
		if(id==0){
		s = s0;
		}
}
	public void Start(){
		s.Start();
		id = s.GetID();
		if(id==1){
			s = s1;
		}
	}
	public void PayCredit(){
		s.PayCredit();
		id = s.GetID();
		if(id==2){
			s = s2;
		}
	}
	public void Approved(){
		s.Approved();
		id = s.GetID();
		if(id==3){
			s = s3;
		}
	}
	public void Reject(){
		s.Reject();
		id = s.GetID();
		if(id==3){
			s = s0;
		}
	}
	public void PayCash(){
		s.PayCash();
		id = s.GetID();
		if(id==2){
			s = s3;
		}
	}
	public void Cancel(){
		s.Cancel();
		id = s.GetID();
		if(id==4){
			s = s0;
		}
	}
	public void SelectGas(int g){
		s.SelectGas(g);
		id = s.GetID();
		if(id==4){
			s = s4;
		}
	}
	public void StartPump() {
		s.StartPump();
		id = s.GetID();
		if(id==5){
			s = s5;
		}	
	}
	public void Pump() {
		s.Pump();
		id = s.GetID();
		if(id==6){
			s = s5;
		}	
	}
	public void StopPump() {
		s.StopPump();
		id = s.GetID();
		if(id==6){
			s = s6;
		}	
	}
	public void Receipt() {
		s.Receipt();
		id = s.GetID();
		if(id==7){
			s = s0;
		}
	}
	public void NoReceipt() {
		s.NoReceipt();
		id = s.GetID();
		if(id==7){
			s = s0;
		}
	}
	
}
