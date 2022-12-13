package champollion;

public class ServicePrevu {

    private int volumeCM, volumeTD, volumeTP;
    private UE ue;
    private Enseignant enseignant;

    public ServicePrevu (int CM, int TD, int TP, UE ue, Enseignant e){
        this.volumeCM = CM;
        this.volumeTD = TD;
        this.volumeTP = TP;
        this.ue = ue;
        this.enseignant = e;

    }
	
    public UE getUe() {
        return ue;
    }

    public int getVolumeCM() {
        return volumeCM;
    }

    public int getVolumeTD() {
        return volumeTD;
    }

    public int getVolumeTP() {
        return volumeTP;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setUe(UE ue) {
        this.ue = ue;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    public void setVolumeCM(int volumeCM) {
        this.volumeCM = volumeCM;
    }

    public void setVolumeTD(int volumeTD) {
        this.volumeTD = volumeTD;
    }

    public void setVolumeTP(int volumeTP) {
        this.volumeTP = volumeTP;
    }


}
