
public class ControlUnit {
private boolean status ;

public ControlUnit(){
	status=true;
}

Context c=new Context();
Constituency cont = new Constituency("Mapusa");


public void addCandidate(Candidate c){
	cont.addCandidate(c);
}

public void getCandidates(){
	cont.getCandidates();
}

public void switchstate(){
	
}


}
