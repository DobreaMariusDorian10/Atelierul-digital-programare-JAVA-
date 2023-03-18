public class Spider extends Animal{
    public Spider(){
        super(8); // Call the Animal constructor with 8 legs
    }
    public void eat() {
        System.out.println("The Spider is eating.");
    }
    void random(){
        super.random();
        System.out.println("Functia din clasa Spider");
    }
}
