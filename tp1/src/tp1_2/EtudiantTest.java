package tp1_2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class EtudiantTest {

	@Test
	void test_calcul_moyenne_retourne_zero_Quand_Pas_De_Note() {
		Etudiant o1 =new Etudiant(null, null, null, null, null);
		
		
		Double x=o1.calculerMoyenne();
		
		assertEquals(0.0,x);
	}
	
	
	@Test
	
	void test_calcul_moyenne_retourne_valeur_note_quand_une_seule_note() {
		Etudiant o2 =new Etudiant(null, null, null, null, null);
		Note f=new Note("math",1,15.0);
		Double x=o2.calculerMoyenne();
		
		assertEquals(15.0,x);
	}
	
	@Test 
	
	void test_calcul_moyenne_retourne_valeur_note_pondérée_quand_une_seule_note_avec_coefficient() {
		
		Etudiant o3 =new Etudiant(null, null, null, null, null);
		
		Note f=new Note("math",1,15.0);
		
		assertEquals(15,o3.calculerMoyenne());
	}
	
	@Test
	void test_calcul_moyenne_retourne_moyenne_quand_plusieurs_notes_avec_differents_coefficients() {
		
		Etudiant o4 =new Etudiant(null, null, null, null, null);
		
	
		
		assertEquals(15,o4.calculerMoyenne());
		
	}

	

	


	
	
	
	
	

}
