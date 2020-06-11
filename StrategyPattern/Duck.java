public class Duck {
    public static void main(String[] args) {
        
        Context context = new Context(new RubberDuck());
        System.out.println(context.executeStrategy());
        
        System.out.println("Hello World");
    }
}


// strategy pattern demo .java