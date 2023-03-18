public class Fish extends Animal{
    public Fish(){
        super(0); // Call the Animal constructor with 8 legs
        System.out.printf("Pestii nu au picioare si nu pot merge \n");
    }
    public void eat(){
        System.out.println("Pestele mananca ----");
    };

}
