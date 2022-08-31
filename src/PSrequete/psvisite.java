package PSrequete;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import dao.connexiondao;
import classebdd.acquereur;
import classebdd.visite;


public class psvisite {

	Connection conn = connexiondao.connexionbdd();
	public void ajouteracquereur(String nom, String prenom, int prix)throws SQLException{
		try {
			java.sql.PreparedStatement ps = conn.prepareStatement("Call ajoutacquereur(?,?,?)");
			ps.setString(1, nom);
			ps.setString(2, prenom);
			ps.setInt(3, prix);
			ps.execute();
			
			System.out.println("succes des donnees");
		}catch(SQLException e ) {
			System.out.print("erreur" + e.getMessage());
		}
		
	}
	public void ajoutervisite(Date date, int acq_id, int bien_id)throws SQLException{
		try {
			java.sql.PreparedStatement ps = conn.prepareStatement("Call ajoutvisite(?,?,?)");
			ps.setDate(1, (Date) date);
			ps.setInt(2, acq_id);
			ps.setInt(3, bien_id);
			ps.execute();
			
			System.out.println("succes des donnees");
		}catch(SQLException e ) {
			System.out.print("erreur" + e.getMessage());
		}
	}
	public acquereur trouveracq(String nom, String prenom, int prix)throws SQLException{
		try {
			java.sql.PreparedStatement ps = conn.prepareStatement("Call trouveracq(?,?,?)");
			ps.setString(1, nom);
			ps.setString(2, prenom);
			ps.setInt(3, prix);
			ps.execute();
			
			ResultSet ResultSet = ps.executeQuery();
			acquereur acquereur = new acquereur();
			while(ResultSet.next()) {
				acquereur.setAcq_id(ResultSet.getInt("acq_id"));;
				acquereur.setAcq_nom(ResultSet.getString("acq_nom"));
				acquereur.setAcq_prenom(ResultSet.getString("acq_prenom"));
				acquereur.setAcq_prix(ResultSet.getInt("acq_prix"));
			
			}
			System.out.println("succes des donnees");
			return acquereur;
		}catch(SQLException e ) {
			System.out.print("erreur" + e.getMessage());
		}
		return null;
	}
	public List<visite> touteVisiteid(int bien_id)	throws SQLException{
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement("call touteVisiteId(?)");
			ps.setInt(1, bien_id);
			ResultSet rs = ps.executeQuery();
			List<visite> visites = new ArrayList<>();
			
			while(rs.next()) {
				visite visite = new visite();
				visite.setVisite_id(rs.getInt(1));
				visite.setVisite_date(rs.getDate(2));
				visite.setVisite_id_acq(rs.getInt(3));
				visite.setVisite_bien_id(rs.getInt(4));
				visites.add(visite);
			}
			System.out.println("succes des données");
			return visites;
		}catch(SQLException e) {
			System.out.print("erreur" + e.getMessage());
			return null;
		}
	}
	public acquereur touteAcqId(int id)throws SQLException{
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement("call touteAcqId(?)");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			acquereur acquereur = new acquereur();
			while(rs.next()) {
			
				acquereur.setAcq_id(rs.getInt(1));
				acquereur.setAcq_nom(rs.getString(2));
				acquereur.setAcq_prenom(rs.getString(3));
				acquereur.setAcq_prix(rs.getInt(4));
			}
			System.out.println("succes des données");
			return acquereur;
		}catch(SQLException e) {
			System.out.print("erreur" + e.getMessage());
			return null;
		}
	}
}
