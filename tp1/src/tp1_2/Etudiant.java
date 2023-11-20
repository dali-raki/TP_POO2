package tp1_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Etudiant {
	
	
	String nom;
    String prenom;
    LocalDate DateNaissance;
    String adressemail;
    String adressepostal;
    List <Note> ListNote;
    

	
	public Etudiant(String nom,String prenom,LocalDate DateNaissance,String adressemail,String adressepostal) {
		
		this.nom=nom;
		this.prenom=prenom;
		this.DateNaissance=DateNaissance;
		this.adressemail=adressemail;
		this.adressepostal=adressepostal;		
		

	}
	
	
	public void noter(String matiere,Double valeur ) {
		
		
		
	}
	
	Note math = new Note("math",1,15.0);
	Note physics = new Note("math",1,15.0);
	
	
	public void addList(Note a) {
	ListNote = new ArrayList<>();
	ListNote.add(a);
	}
	
	
	  Double calculerMoyenne() {
		  Double x=0.0,z=0.0,y=0.0;Double i=0.0;
		  
		  
		  addList(math);
		  addList(physics);
		 
		 if(ListNote == null) {
			 
			 z=0.0;
		 }else {
		  
			 for(Note note : ListNote) {
				 		
				 i =+ 1.0;
				 
				 x=note.note*note.coefficient;
				 
				 y=+x;
			 }
			 
			 
			 z=y/i;
		 }
			  
			  
		  return z;  
		  }
	 
	  
	   

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String toString() {
		 
		 return "|| le nom:"+this.nom  + "|| le prenom"+this.prenom +"|| la dateN :"+ this.DateNaissance +"|| email:"+ this.adressemail + "|| code:"+this.adressepostal+"||"+"moy:"+calculerMoyenne()+"||";
	 }

}
