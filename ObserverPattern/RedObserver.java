public class RedObserver extends Observer{

	public RedObserver(Subject subject){
       this.subject = subject;
       this.subject.attach(this);
    }
 
    @Override
    public void update() {
       System.out.println( "Light is Red. State is " + subject.getState()); 
    }
 }