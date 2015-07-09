
public class EVM_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ControlUnit CU = new ControlUnit();
		Candidate c1 = new Candidate("RAm");
		Candidate c2 = new Candidate("Sham");
		
		CU.addCandidate(c1);
		CU.addCandidate(c2);
		CU.getCandidates();
		
	}

}
