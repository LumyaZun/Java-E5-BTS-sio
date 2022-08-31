package classebdd;

public class acquereur {
	private int acq_id;
	private String acq_nom;
	private String acq_prenom;
	private int acq_prix;
	
	public acquereur(/*int un_acq_id ,String un_acq_nom, String un_acq_prenom, int un_acq_prix*/) {
		/*this.acq_id = un_acq_id;
		this.acq_nom = un_acq_nom;
		this.acq_prenom = un_acq_prenom;
		this.acq_prix = un_acq_prix;*/
	}

	public int getAcq_id() {
		return acq_id;
	}

	public void setAcq_id(int un_acq_id) {
		this.acq_id = un_acq_id;
	}

	public String getAcq_nom() {
		return acq_nom;
	}

	public void setAcq_nom(String un_acq_nom) {
		this.acq_nom = un_acq_nom;
	}

	public String getAcq_prenom() {
		return acq_prenom;
	}

	public void setAcq_prenom(String un_acq_prenom) {
		this.acq_prenom = un_acq_prenom;
	}

	public int getAcq_prix() {
		return acq_prix;
	}

	public void setAcq_prix(int un_acq_prix) {
		this.acq_prix = un_acq_prix;
	}
}
