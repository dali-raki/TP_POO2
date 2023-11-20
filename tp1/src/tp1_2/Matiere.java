package tp1_2;

public class Matiere {
	 String intitule;
	int coefficient;
	
	public Matiere(String intitule, int coefficient) {
		
		this.intitule = intitule;
		this.coefficient = coefficient;
	}
	
	public int getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}
	
	

}
