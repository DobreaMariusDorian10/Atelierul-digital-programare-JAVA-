public class Actor {
    String nume;
    int varsta;
    Premiu[ ] premii = new Premiu[5];
    public Actor(String nume,int varsta,Premiu[] premii) {
        this.nume=nume;
        this.varsta=varsta;
        this.premii=premii;
    }
    public String toString() {
        String result = "Nume: " + nume + "\n";
        result += "Varsta: " + varsta + "\n";
        result += "Premii: ";
        if (premii.length == 0) {
            result += "nicio premie\n";
        } else {
            for (int i = 0; i < premii.length; i++) {
                result += "\n  - " + premii[i].nume + " (" + premii[i].an + ")";
            }
        }
        return result;
    }

}
