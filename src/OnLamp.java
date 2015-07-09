
public class OnLamp  implements Lamp{
	 Context context = new Context();
	 OnState on_state = new OnState();
	 
	public void on() {
		context.setState(on_state);
	}

	@Override
	public void lighton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lightoff() {
		// TODO Auto-generated method stub
		
	}

}
