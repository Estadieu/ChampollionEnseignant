package champollion;


import java.util.ArrayList;
import java.util.LinkedList;

public class Enseignant extends Personne {


    ArrayList<ServicePrevu> serviceprevu = new ArrayList<>();
    LinkedList<Intervention> interventions = new LinkedList<>();

    public Enseignant(String nom, String email) {
        super(nom, email);
    }

    public int heuresPrevues() {
        int equivalentTD = 0;
        for (ServicePrevu servicep : serviceprevu){
            equivalentTD += 1.5 * servicep.getVolumeCM();
            equivalentTD += servicep.getVolumeTD();
            equivalentTD += 0.75 * servicep.getVolumeTP();
        }  
        return Math.round(equivalentTD);
    }

    public int heuresPrevuesPourUE(UE ue) {
        int equivalentTD_UE = 0;

        for (ServicePrevu servicep : serviceprevu){
            if (servicep.getUe() == ue){
            equivalentTD_UE += 1.5 * servicep.getVolumeCM();
            equivalentTD_UE += servicep.getVolumeTD();
            equivalentTD_UE += 0.75 * servicep.getVolumeTP();
        }
    }
        return Math.round(equivalentTD_UE);
    }

   
    public void ajouteEnseignement(UE ue, int volumeCM, int volumeTD, int volumeTP) {
        ServicePrevu servicep = new ServicePrevu (volumeCM, volumeTD, volumeTP, ue, this);
        serviceprevu.add(servicep);
  
    }


    public void ajouteInterventions(Intervention e){
        interventions.add(e);

    }


    public int heuresPlanifiees(){
        int heuresPlanifiees =0 ;

        for (int i = 0; i < interventions.size(); i++){

            switch (interventions.get(i).getType()){

                case CM:
                    heuresPlanifiees += interventions.get(i).getDuree() * 1.5;
                    break;
                case TD: 
                    heuresPlanifiees += interventions.get(i).getDuree();
                    break;
                case TP:
                    heuresPlanifiees += interventions.get(i).getDuree() * 0.75;
                    break;
                default:
                    break;
            }

        }
        return Math.round(heuresPlanifiees);
    }

    public boolean enSousService(){
        if(heuresPlanifiees()>= 192){
            return false;
        }else{
            return true;
        }

    }
}
