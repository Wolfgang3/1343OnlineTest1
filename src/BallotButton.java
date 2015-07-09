
public class BallotButton implements Button {
	private boolean clickStatus=false;
	
	public BallotButton(){
		
	}

	@Override
	public boolean click() {
		clickStatus=true;
		// TODO Auto-generated method stub
		return clickStatus;
		
	}
}
