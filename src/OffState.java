public class OffState implements State {

   public boolean doAction(Context context) {
      
      context.setState(this);
	return false;	
   }


}