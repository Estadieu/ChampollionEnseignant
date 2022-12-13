package champollion;

public class Salle {

private String intitule;
private int capacite;

public Salle (String i, int c){
    this.intitule=i;
    this.capacite=c;
}

    public String getIntitule() {
        return intitule;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

}
