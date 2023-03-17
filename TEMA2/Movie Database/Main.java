public class Main {
    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu( "oscar",1990);
        Premiu oscar2000 = new Premiu( "oscar",2000);
        Premiu oscar2010 = new Premiu( "oscar",2010);
        Premiu oscar2018 = new Premiu( "oscar",2018);
        Actor actorOscar1990=new Actor("actori cu 2 oscaruri",35, new Premiu[]{oscar1990,oscar2000});
        Actor actorOscar2010=new Actor("actori cu oscar",55, new Premiu[]{oscar2010});
        Actor actorOscar2018=new Actor("actor cu oscar din 2019",23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01=new Actor("actor fara oscar 01",33, new Premiu[]{});
        System.out.println(actorOscar1990.toString());
        System.out.println(actorOscar2010.toString());
        System.out.println(actorOscar2018.toString());
        System.out.println(actorFaraPremii01.toString());
    }
    }
