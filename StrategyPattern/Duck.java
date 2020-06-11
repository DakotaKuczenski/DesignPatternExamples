public class Duck {
    public static void main(String[] args) {
        
        Context context = new Context(new RubberDuck());
        System.out.println(context.executeStrategy());
        
        System.out.println("Strategy Pattern");
    }
}


// strategy pattern demo .java
