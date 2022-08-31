package PSrequete;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import dao.connexiondao;
import classebdd.bien;
import classebdd.adresse;


public class psdossier {

	Connection conn = connexiondao.connexionbdd();
	
	public void ajouteradresse(int num, String rue, String ville, int CP) throws SQLException{
		try {
			java.sql.PreparedStatement ps = conn.prepareStatement(" CALL ajoutadresse(?,?,?,?)");
			ps.setInt(1, num);
			ps.setString(2, rue);
			ps.setString(3, ville);
			ps.setInt(4, CP);
			ps.execute();
			
			System.out.println("succes des donnees");
			
		}catch(SQLException e) {
			System.out.print("erreur" + e.getMessage());
		}
	}
	
	
	public void ajouterbien(String exclu, int surfacetotal, Date mandat, String cuisine, String sdb, String toilette, String chambre1, String chambre2, String chambre3, String garage , String piscine, String salon, String terrasse , String grenier , String prix, int add_id) throws SQLException{
		try {
			java.sql.PreparedStatement ps = conn.prepareStatement(" Call ajoutbien(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, exclu);
			ps.setInt(2, surfacetotal);
			ps.setDate(3, (Date) mandat);
			ps.setString(4, cuisine);
			ps.setString(5, sdb);
			ps.setString(6, toilette);
			ps.setString(7, chambre1);
			ps.setString(8, chambre2);
			ps.setString(9, chambre3);
			ps.setString(10, garage);
			ps.setString(11, piscine);
			ps.setString(12, salon);
			ps.setString(13, terrasse);
			ps.setString(14, grenier);
			ps.setString(15, prix);
			ps.setInt(16, add_id);
			ps.execute();
			
			System.out.println("succes des donnees");
		}catch (SQLException e) {
			System.out.print("erreur" + e.getMessage());
		}
	}
	
	public adresse trouverAdresse(int num, String rue, String ville, int CP) throws SQLException{
		try {
			java.sql.PreparedStatement ps = conn.prepareStatement(" Call trouverAdresse(?,?,?,?)");
			ps.setInt(1, num);
			ps.setString(2, rue);
			ps.setString(3, ville);
			ps.setInt(4, CP);
			
			ps.execute();
			
			ResultSet ResultSet = ps.executeQuery();
			adresse adresse = new adresse();
			while(ResultSet.next()) {
				adresse.setAdd_id(ResultSet.getInt("add_id"));;
				adresse.setAdd_num(ResultSet.getInt("add_num"));
				adresse.setAdd_rue(ResultSet.getString("add_rue"));
				adresse.setAdd_ville(ResultSet.getString("add_ville"));
				adresse.setAdd_CP(ResultSet.getInt("add_CP"));
			
			}
			
			System.out.println("succes des donnees");
			return adresse;
		}catch (SQLException e) {
			System.out.print("erreur" + e.getMessage());
			return null;
		}
	}
	
	public adresse trouverAdresseId(int id) throws SQLException{
		try {
			java.sql.PreparedStatement ps = conn.prepareStatement(" Call adresseId(?)");
			ps.setInt(1, id);
			
			ps.execute();
			
			ResultSet ResultSet = ps.executeQuery();
			adresse adresse = new adresse();
			while(ResultSet.next()) {
				adresse.setAdd_id(ResultSet.getInt("add_id"));;
				adresse.setAdd_num(ResultSet.getInt("add_num"));
				adresse.setAdd_rue(ResultSet.getString("add_rue"));
				adresse.setAdd_ville(ResultSet.getString("add_ville"));
				adresse.setAdd_CP(ResultSet.getInt("add_CP"));
			
			}
			
			System.out.println("succes des donnees");
			return adresse;
		}catch (SQLException e) {
			System.out.print("erreur" + e.getMessage());
			return null;
		}
	}
	
	public List<adresse> touteAdresse() throws SQLException {

		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement("CALL touteAdresse()");
			ResultSet rs = ps.executeQuery();
			List<adresse> adresses = new ArrayList<>();
			while (rs.next()) {
				adresse adresse = new adresse();
				adresse.setAdd_id(rs.getInt(1));
				adresse.setAdd_num(rs.getInt(2));
				adresse.setAdd_rue(rs.getString(3));
				adresse.setAdd_ville(rs.getString(4));
				adresse.setAdd_CP(rs.getInt(5));
				adresses.add(adresse);
			}
			System.out.println("Succés des données ");
			return adresses;
		} catch (SQLException e) {
			System.out.print("erreur" + e.getMessage());
			return null;
		}
	}
	public bien trouverbienid(int id) throws SQLException{
		try {
			java.sql.PreparedStatement ps = conn.prepareStatement(" Call bienid(?)");
			ps.setInt(1, id);
			
			ps.execute();
			ResultSet ResultSet = ps.executeQuery();
			bien bien = new bien();
			while(ResultSet.next()) {
				bien.setBien_id(ResultSet.getInt("bien_id"));
				bien.setBien_exclusivite(ResultSet.getString("bien_exclusivite"));
				bien.setBien_surfacetotal(ResultSet.getInt("bien_surfacetotal"));
				bien.setBien_mandat_date(ResultSet.getDate("bien_mandat_date"));
				bien.setBien_cuisine(ResultSet.getString("bien_cuisine"));
				bien.setBien_sdb(ResultSet.getString("bien_sdb"));
				bien.setBien_toilette(ResultSet.getString("bien_toilette"));
				bien.setBien_chambre1(ResultSet.getString("bien_chambre1"));
				bien.setBien_chambre2(ResultSet.getString("bien_chambre2"));
				bien.setBien_chambre3(ResultSet.getString("bien_chambre3"));
				bien.setBien_garage(ResultSet.getString("bien_garage"));
				bien.setBien_piscine(ResultSet.getString("bien_piscine"));
				bien.setBien_salon(ResultSet.getString("bien_salon"));
				bien.setBien_terrasse(ResultSet.getString("bien_terrasse"));
				bien.setBien_grenier(ResultSet.getString("bien_grenier"));
				bien.setBien_prix(ResultSet.getString("bien_grenier"));
				bien.setBien_prix(ResultSet.getString("bien_prix"));
			}
			
			System.out.println("succes des donnees");
			return bien;
			
		}catch (SQLException e) {
			System.out.print("erreur" + e.getMessage());
			return null;
		}
	}


	public static void ajoutervisite(java.util.Date date_visite, int acq_id, int bien_id) {
		// TODO Auto-generated method stub
		
	}
}
