public class Cat extends Animal implements Pet{
    String name;
    public Cat(String name){
        super(4);// Call the Animal constructor with 4 legs
        this.name=name;
    }
    public Cat(){
        this("unknown"); // Call the one-argument constructor with a default name
    }
    @Override
    public String getName() {
        return name;
    }
    public void setName(String newName){
        this.name=newName;
    }

    @Override
    void eat() {
        System.out.println("niom niom niom");
    }
    public void play() {
        System.out.println("Pisica "+this.name+" se joaca");
    }
}
