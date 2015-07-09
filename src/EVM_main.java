
public class EVM_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ControlUnit cont_uni = new ControlUnit();
		Candidate cand1 = new Candidate("RAm");
		Candidate cand2 = new Candidate("Sham");
		Candidate cand3 = new Candidate("mohan");
		
		cont_uni.addCandidate(cand1);
		cont_uni.addCandidate(cand2);
		cont_uni.addCandidate(cand3);
		cont_uni.getCandidates();
		
	}

}
