
public class TotalButton implements Button {
	private boolean clickStatus=false;
	TotalButton(){
		
	}

	@Override
	public boolean click() {
		clickStatus=true;
		return clickStatus;
		// TODO Auto-generated method stub
		
	}
}
