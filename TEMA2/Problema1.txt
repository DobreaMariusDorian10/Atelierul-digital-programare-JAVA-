import java.util.*;
public class Main {
    public static void main(String[] args) {
        Fighter Fighter1 = new Fighter( "Dragos",10,3);
        Fighter Fighter2 = new Fighter( "Vasile",10,2);
        BoxingMatch Meci = new BoxingMatch(Fighter1,Fighter2 );
       Meci.fight();
        }
    }

----
public class Fighter {
    String name;
    int health;
    int damagePerAtack;
    public Fighter(String name, int health, int damagePerAtack) {
        this.name = name;
        this.health=health;
        this.damagePerAtack = damagePerAtack;
    }
    public  int atack(Fighter otherFighter) {
        return this.health-otherFighter.damagePerAtack;
    }

}
---
public class BoxingMatch   {
    String name1,name2;
    int health1,health2,damagePerAtack1,damagePerAtack2;
    public  BoxingMatch(Fighter Person1,Fighter Person2) {
        this.name1=Person1.name;
        this.name2=Person2.name;
        this.health1=Person1.health;
        this.health2=Person2.health;
        this.damagePerAtack1=Person1.damagePerAtack;
        this.damagePerAtack2=Person2.damagePerAtack;
    }
    public  void fight() {
         if(health1/damagePerAtack2>health2/damagePerAtack1){
             System.out.println("Castigatorul este "+name1);
         }
         else
             System.out.println("Castigatorul este "+name2);
    }
}
