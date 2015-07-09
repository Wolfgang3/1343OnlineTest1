
public class ControlUnit {
private boolean status ;

public ControlUnit(){
	status=true;
}

Context c=new Context();
Constituency con = new Constituency("Ponda");


public void addCandidate(Candidate c){
	con.addCandidate(c);
}

public void getCandidates(){
	con.getCandidates();
}

public void switchstate(){
	
}


}
