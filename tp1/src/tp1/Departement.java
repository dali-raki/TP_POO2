package tp1;

import java.util.ArrayList;
import java.util.List;

public class Departement {
	
	private String specialite;
	private String adresse;
	private List <Etudiant> etudiantsInscrits =new ArrayList<>();
	
	
	public Departement(String specialite,String adresse) {
		
		this.specialite = specialite;
		this.adresse = adresse;
		this.etudiantsInscrits = new ArrayList<>();
	}
	
	
	
	public void inscrire(Etudiant etudiant) {
		
	etudiantsInscrits.add(etudiant);
	}
	
	public void desinscrire(Etudiant etudiant) {
		
		etudiantsInscrits.remove(etudiant);

	}



	@Override
	public String toString() {
		for(int i=0;i<etudiantsInscrits.size();i++) 
		      System.out.println(etudiantsInscrits.get(i));

		return "";	
	}

}
