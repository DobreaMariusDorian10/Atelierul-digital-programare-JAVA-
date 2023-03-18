/*1. Create the Animal class. which is the abstract superclass of all animals.
     a. Declare a protected integer attribute called legs. which records the number
        of legs for this animal.
     b. Define. protected constructor that initiate the legs attribute.
     c. Declare an abstract method to eat.
        Declare a concrete method walk that prints out something about how the
        animal walks (including the number of legs).
2. Create the Spder class.
     a. The Spider class extends the Animal clasa.
     b. Define a default constructor that calls the superclass constructor to
        specify that all spiders have eght legs
        Implement the eat method.
3. Create the Pet interface specified by the UML diagram.
   Create the Cat class that ertends Animal and implements Pet.
        This class must told. a String attribute to wore the name of the pet_
     b. Define a constructor that takes one String parameter that specifies the
        Catenate This constructor must also call the uperclass constructor to
        specify that all cats have four lege.
     c. Define another constructor that takes no parameters. Have this
        constructor call the preHous constructor (using this keyword) and pass an
        empty string as the argument.
      d. Implement the Pet interface methods.
      e.Implement the eat method.
C Create the Fish class_ Override the Animal methods to specify that fish can't walk
   and don't have leg a
6. Create a Test Anirnals program. Have the man method create and manipulate
   instances of the claues you created above. Start with:
            i. Fish d = new Fish();
         ii. Cat c = new Cat("Fluffy");
          iii. Animal a = new Fish():
        iv. Animal e e new Spider();
         v. Pet p = new Cat():
7. Experiment by:
   a) calling the methods of each object.
   b)casting objects
   c)using polymorphism.
   d)using super to call superclass methods_


*/
public class TestAnimal {
    public static void main(String[] args) {
        Fish d=new Fish();
        d.eat();
        d.walk();

        Cat c=new Cat("Fluffy");
        Cat c1=new Cat();
        c.eat();
        c.play();
        c1.eat();
        c1.play();

        Animal a=new Fish(); // nu se mai apeleaza constructorul din clasa Fish();
        a.walk(); // metoda din clasa animal
        a.eat();// se apeleaza metoda din clasa fish pt ca e o metoda abstracta
        Fish f = (Fish) a;
         a.eat(); // face fix acelasi lucru
        Animal e=new Spider();
        e.eat();
        e.walk();
        Pet p=new Cat();
        p.setName("Pisicuta declarata in interfata");
        p.getName();
        p.play();
       // p.eat(); eroare, fiind un obiect de tip interfata poate apela doar metodele din interfata
        e.random();
        a.random();//Fish d=new Fish();







    }
}
