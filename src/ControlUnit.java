
public class ControlUnit {
private boolean status ;

Button ballot_button =new BallotButton();
Button total_button =new TotalButton();
Lamp on_lamp =new OnLamp();
Lamp busy_lamp =new BusyLamp();
private boolean onStatus;

public ControlUnit(){
	this.status=true;
}
public void powerOnLamp(){
if(this.onStatus==true){
	on_lamp.lighton();
}
else{
	on_lamp.lightoff();
}
}

public void clickBallotButton(){
if(ballot_button.click()){
	busy_lamp.lighton();
	}
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
