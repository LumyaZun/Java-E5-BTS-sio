package classebdd;

import java.util.Date;

public class bien {
	private int bien_id;
	private String bien_exclusivite;
	private int bien_surfacetotal;
	private Date bien_mandat_date;
	private String bien_cuisine;
	private String bien_sdb;
	private String bien_toilette;
	private String bien_chambre1;
	private String bien_chambre2;
	private String bien_chambre3;
	private String bien_garage;
	private String bien_piscine;
	private String bien_salon;
	private String bien_terrasse;
	private String bien_grenier;
	private String bien_prix;

	public bien(/*int un_bien_id,String un_bien_exclusivite, int un_bien_surfacetotal, Date un_bien_mandat_date, String un_bien_cuisine, String un_bien_sdb, String un_bien_toilette, String un_bien_chambre1, String un_bien_chambre2, String un_bien_chambre3, String un_bien_garage, String un_bien_piscine, String un_bien_salon, String un_bien_terrasse, String un_bien_grenier, String un_bien_prix*/)
	{
		/*this.bien_id = un_bien_id;
		this.bien_exclusivite = un_bien_exclusivite;
		this.bien_surfacetotal = un_bien_surfacetotal;
		this.bien_mandat_date = un_bien_mandat_date;
		this.bien_cuisine = un_bien_cuisine;
		this.bien_sdb = un_bien_sdb;
		this.bien_toilette = un_bien_toilette;
		this.bien_chambre1 = un_bien_chambre1;
		this.bien_chambre2 = un_bien_chambre2;
		this.bien_chambre3 = un_bien_chambre3;
		this.bien_garage = un_bien_garage;
		this.bien_piscine = un_bien_piscine;
		this.bien_salon = un_bien_salon;
		this.bien_terrasse = un_bien_terrasse;
		this.bien_grenier = un_bien_grenier;
		this.bien_prix = un_bien_prix;*/
	}

	public String getBien_prix() {
		return bien_prix;
	}

	public void setBien_prix(String bien_prix) {
		this.bien_prix = bien_prix;
	}

	public int getBien_id() {
		return bien_id;
	}

	public void setBien_id(int un_bien_id) {
		this.bien_id = un_bien_id;
	}

	public String getBien_exclusivite() {
		return bien_exclusivite;
	}

	public void setBien_exclusivite(String un_bien_exclusivite) {
		this.bien_exclusivite = un_bien_exclusivite;
	}

	public int getBien_surfacetotal() {
		return bien_surfacetotal;
	}

	public void setBien_surfacetotal(int un_bien_surfacetotal) {
		this.bien_surfacetotal = un_bien_surfacetotal;
	}

	public Date getBien_mandat_date() {
		return bien_mandat_date;
	}

	public void setBien_mandat_date(Date un_bien_mandat_date) {
		this.bien_mandat_date = un_bien_mandat_date;
	}

	public String getBien_cuisine() {
		return bien_cuisine;
	}

	public void setBien_cuisine(String un_bien_cuisine) {
		this.bien_cuisine = un_bien_cuisine;
	}

	public String getBien_sdb() {
		return bien_sdb;
	}

	public void setBien_sdb(String un_bien_sdb) {
		this.bien_sdb = un_bien_sdb;
	}

	public String getBien_toilette() {
		return bien_toilette;
	}

	public void setBien_toilette(String un_bien_toilette) {
		this.bien_toilette = un_bien_toilette;
	}

	public String getBien_chambre1() {
		return bien_chambre1;
	}

	public void setBien_chambre1(String un_bien_chambre1) {
		this.bien_chambre1 = un_bien_chambre1;
	}

	public String getBien_chambre2() {
		return bien_chambre2;
	}

	public void setBien_chambre2(String un_bien_chambre2) {
		this.bien_chambre2 = un_bien_chambre2;
	}

	public String getBien_chambre3() {
		return bien_chambre3;
	}

	public void setBien_chambre3(String un_bien_chambre3) {
		this.bien_chambre3 = un_bien_chambre3;
	}

	public String getBien_garage() {
		return bien_garage;
	}

	public void setBien_garage(String un_bien_garage) {
		this.bien_garage = un_bien_garage;
	}

	public String getBien_piscine() {
		return bien_piscine;
	}

	public void setBien_piscine(String un_bien_piscine) {
		this.bien_piscine = un_bien_piscine;
	}

	public String getBien_salon() {
		return bien_salon;
	}

	public void setBien_salon(String un_bien_salon) {
		this.bien_salon = un_bien_salon;
	}

	public String getBien_terrasse() {
		return bien_terrasse;
	}

	public void setBien_terrasse(String un_bien_terrasse) {
		this.bien_terrasse = un_bien_terrasse;
	}

	public String getBien_grenier() {
		return bien_grenier;
	}

	public void setBien_grenier(String un_bien_grenier) {
		this.bien_grenier = un_bien_grenier;
	}
}
