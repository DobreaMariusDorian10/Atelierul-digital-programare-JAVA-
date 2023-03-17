public class Film {
    String nume;
    int anAparitie;
    int damagePerAtack;
    Actor[] actori=new Actor[5];
    public Film(String nume,int anAparitie,Actor[] actori) {
        this.nume=nume;
        this.anAparitie=anAparitie;
        this.actori=actori;
    }


}
