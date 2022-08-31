package classebdd;

import java.util.Date;


public class visite {
	
	private int visite_id;
	private Date visite_date;
	private int visite_id_acq;
	private int visite_bien_id;
	
	public visite(/*int un_visite_id,Date un_visite_date*/) {
		/*this.visite_id = un_visite_id;
		this.visite_date= un_visite_date;*/
	}
	public int getVisite_id_acq() {
		return visite_id_acq;
	}

	public void setVisite_id_acq(int visite_id_acq) {
		this.visite_id_acq = visite_id_acq;
	}

	public int getVisite_bien_id() {
		return visite_bien_id;
	}

	public void setVisite_bien_id(int visite_bien_id) {
		this.visite_bien_id = visite_bien_id;
	}



	public int getVisite_id() {
		return visite_id;
	}

	public void setVisite_id(int un_visite_id) {
		this.visite_id = un_visite_id;
	}

	public Date getVisite_date() {
		return visite_date;
	}

	public void setVisite_date(Date un_visite_date) {
		this.visite_date = un_visite_date;
	}
}
