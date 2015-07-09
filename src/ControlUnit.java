
public class ControlUnit {
private boolean status ;

Button ballot_button =new BallotButton();
Button total_button =new TotalButton();
Lamp on_lamp =new OnLamp();
Lamp busy_lamp =new BusyLamp();

public ControlUnit(){
	status=true;
}
public void switchstate(){
	
}

Context c=new Context();
Constituency cont = new Constituency("Mapusa");


public void addCandidate(Candidate c){
	cont.addCandidate(c);
}

public void getCandidates(){
	cont.getCandidates();
}




}
