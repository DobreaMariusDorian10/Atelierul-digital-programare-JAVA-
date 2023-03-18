public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    abstract void eat();

    void walk() {
        System.out.printf("Animalul merge si are %d picioare\n", legs);
    }
    void random(){
        System.out.println("Functia din clasa Animal");
    }
}

