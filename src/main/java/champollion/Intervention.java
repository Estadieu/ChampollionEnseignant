package champollion;

import java.util.Date;

public class Intervention {
private Salle salle;
private UE ue;
private Enseignant enseignant;
private Date debut;
private int duree;
private boolean annulee = false;
private TypeIntervention type;

public Intervention(Salle s, UE u, Enseignant e, Date deb, int d, TypeIntervention type){
    this.debut = deb;
    this.duree = duree;
    this.salle = s;
    this.ue = u;
    this.enseignant = e;
    this.type = type;

}
public void annuler(){
    this.annulee = true;
}

    public Date getDebut() {
        return debut;
    }

    public int getDuree() {
        return duree;
    }

    public boolean isAnnulee() {
        return annulee;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setAnnulee(boolean annulee) {
        this.annulee = annulee;
    }

    public TypeIntervention getType() {
        return type;
    }

}