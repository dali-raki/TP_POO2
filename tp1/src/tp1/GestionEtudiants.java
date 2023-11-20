package tp1;

import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom;
		LocalDate maDate = LocalDate.of(2023, Month.FEBRUARY, 5);

		Etudiant lolo = new Etudiant("dali","raki",maDate,"dali@gmail.com","123");
		Etudiant toto = new Etudiant("ali","ahmed",maDate,"ali@gmail.com","123");
		
		
		
		
		System.out.println(lolo.toString()==toto.toString());
		
		
		toto.setNom("lolo");
		
		System.out.println(toto);
		
		System.out.println("\n \n \n");
		Etudiant fifi = new Etudiant("fifi","fifi",maDate,"fifi@gmail.com","123");
		Etudiant riri = new Etudiant("riri","riri",maDate,"riri@gmail.com","123");
		
		Departement monDepInfo=new Departement("Informatique","biskra");
		
		monDepInfo.inscrire(lolo);
		monDepInfo.inscrire(fifi);
		monDepInfo.inscrire(toto);
		monDepInfo.inscrire(riri);
		
		System.out.println(monDepInfo);
		
		System.out.println("\n \n \n");
		monDepInfo.desinscrire(toto);
		
		System.out.println(monDepInfo);
	
}
	



}