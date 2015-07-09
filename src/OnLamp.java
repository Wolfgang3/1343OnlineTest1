
public class OnLamp  implements Lamp{
	 Context context = new Context();
	 OnState on_state = new OnState();
	 
	public void on() {
		context.setState(on_state);
	}

}
