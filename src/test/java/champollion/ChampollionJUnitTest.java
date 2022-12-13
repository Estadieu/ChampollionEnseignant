package champollion;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ChampollionJUnitTest {
	Enseignant untel;
	UE uml, java;


	@BeforeEach
	public void setUp() {
		untel = new Enseignant("untel", "untel@gmail.com");
		uml = new UE("UML");
		java = new UE("Programmation en java");		
		java = new UE("Programmation en java");	

	}

        @Test
        public void testHeuresPrevues(){
            untel.ajouteEnseignement(uml, 0, 1, 0);
            untel.ajouteEnseignement(java, 0, 1, 0);
            assertEquals(2, untel.heuresPrevues(),"L'enseignant doit réaliser 4h" );
        }
        
       
        @Test
        public void testHeuresPlanifiees(){
            Salle s = new Salle ("Salle 1", 25);
            Intervention e = new Intervention (s, uml, untel, new Date(), 2, TypeIntervention.TD);
            untel.ajouteInterventions(e);
            assertEquals(2, untel.heuresPlanifiees(), "L'enseignant doit réaliser 2h");
        }

        @Test 
        public void testEnSousService(){
            untel.ajouteEnseignement(uml, 1, 1, 1);
            assertEquals(true, untel.enSousService(), "L'enseignant est en sous service");

            untel.ajouteEnseignement(uml, 100, 50, 50);
            assertEquals(true, untel.enSousService(), "L'enseignant n'est pas en sous service");

        }

}