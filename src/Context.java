
public class Context {
   private State state;

   public Context(){
      this.state = new OnState();
   }

   public void setState(State state){
      this.state = state;		
   }

   public State getState(){
      return state;
   }
}