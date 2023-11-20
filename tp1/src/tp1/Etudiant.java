package tp1;

import java.time.LocalDate;

public class Etudiant {
	
	
	String nom;
    String prenom;
    LocalDate DateNaissance;
    String adressemail;
    String adressepostal;
	
	
	
	
	public Etudiant(String nom,String prenom,LocalDate DateNaissance,String adressemail,String adressepostal) {
		
		this.nom=nom;
		this.prenom=prenom;
		this.DateNaissance=DateNaissance;
		this.adressemail=adressemail;
		this.adressepostal=adressepostal;
	}
	
	
	
	
	
	
	
	
	
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String toString() {
		 
		 return "||"+this.nom  + "||"+this.prenom +"||"+ this.DateNaissance +"||"+ this.adressemail + "||"+this.adressepostal+"||";
	 }

}
