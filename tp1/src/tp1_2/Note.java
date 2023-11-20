package tp1_2;

public class Note extends Matiere {
	
	 Double note;

	
	public Note(String intitule, int coefficient, Double note) {
		super(intitule, coefficient);
		this.note = note;
	}
	
	
	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	
	
	
	

}
