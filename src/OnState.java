public class OnState implements State {

   public boolean doAction(Context context) {
   
      context.setState(this);
	return false;	
   }

   public String toString(){
      return "Start State";
   }
}