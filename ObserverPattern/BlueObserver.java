public class BlueObserver extends Observer{

    public BlueObserver(Subject subject){
       this.subject = subject;
       this.subject.attach(this);
    }
 
    @Override
    public void update() {
       System.out.println( "Light is Blue. State is "+ subject.getState() ); 
    }
 }