package situtationjava;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import PSrequete.psdossier;
import PSrequete.psvisite;
import classebdd.acquereur;
import classebdd.adresse;
import classebdd.bien;
import classebdd.visite;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.TextArea;

public class dossier extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dossier frame = new dossier(0);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public dossier(int idAdd) throws SQLException {
		psdossier psdossier = new psdossier();
		final adresse adresse = psdossier.trouverAdresseId(idAdd);
		final bien bien = psdossier.trouverbienid(idAdd);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dossier de " + adresse.getAdd_rue());
		lblNewLabel.setBounds(277, 11, 187, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Adresse :\r\n" + adresse.getAdd_num() + " " +adresse.getAdd_rue());
		lblNewLabel_1.setBounds(30, 53, 146, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Exclusivit\u00E9 : " + bien.getBien_exclusivite());
		lblNewLabel_2.setBounds(30, 101, 121, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton buttonquitter = new JButton("Quitter");
		buttonquitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		buttonquitter.setBounds(522, 480, 169, 23);
		contentPane.add(buttonquitter);
		
		JButton btnrevenir = new JButton("revenir \u00E0 la page d'accueil");
		btnrevenir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index index;
				try {
					index = new index();
					index.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnrevenir.setBounds(30, 480, 167, 23);
		contentPane.add(btnrevenir);
		
		JLabel lblNewLabel_3 = new JLabel("Prix de vente :" + bien.getBien_prix());
		lblNewLabel_3.setBounds(30, 296, 133, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton boutonvisite = new JButton("Ajoutez une visite");
		boutonvisite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				situtationjava.visite visite = new situtationjava.visite(adresse);
				visite.setVisible(true);
				dispose();
			}
		});
		boutonvisite.setBounds(522, 290, 169, 27);
		contentPane.add(boutonvisite);
		
		JLabel lblNewLabel_4 = new JLabel("Pi\u00E8ces : ");
		lblNewLabel_4.setBounds(30, 145, 87, 14);
		contentPane.add(lblNewLabel_4);
		
		
		JLabel lblNewLabel_6 = new JLabel("Superficie : " +bien.getBien_surfacetotal());
		lblNewLabel_6.setBounds(198, 101, 121, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Date mandat :" + bien.getBien_mandat_date());
		lblNewLabel_7.setBounds(364, 101, 146, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_5 = new JLabel("Cuisine :" + bien.getBien_cuisine());
		lblNewLabel_5.setBounds(30, 170, 121, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_8 = new JLabel("Salle de bain : " + bien.getBien_sdb());
		lblNewLabel_8.setBounds(161, 170, 121, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Toilette :" + bien.getBien_toilette());
		lblNewLabel_9.setBounds(277, 170, 100, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Chambre 1 :" +bien.getBien_chambre1());
		lblNewLabel_10.setBounds(378, 170, 100, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Chambre 2 :" +bien.getBien_chambre2());
		lblNewLabel_11.setBounds(503, 170, 87, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Chambre 3 :" +bien.getBien_chambre3());
		lblNewLabel_12.setBounds(30, 208, 78, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Garage :" +bien.getBien_garage());
		lblNewLabel_13.setBounds(161, 208, 78, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Piscine :" + bien.getBien_piscine());
		lblNewLabel_14.setBounds(277, 208, 78, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Salon :" + bien.getBien_salon());
		lblNewLabel_15.setBounds(378, 208, 86, 14);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Terrasse :" + bien.getBien_terrasse());
		lblNewLabel_16.setBounds(503, 208, 87, 14);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Grenier :"+ bien.getBien_grenier());
		lblNewLabel_17.setBounds(30, 246, 87, 14);
		contentPane.add(lblNewLabel_17);
		
		psvisite psvisite = new psvisite();
		List<visite> visites = psvisite.touteVisiteid(idAdd);
		List<acquereur> acquereurs = new ArrayList<acquereur>();
		for (int i = 0; i < visites.size(); i++) {
			acquereurs.add((acquereur) psvisite.touteAcqId(visites.get(i).getVisite_id_acq()));
		}
		
		TextArea textArea = new TextArea();
		textArea.setBounds(29, 314, 487, 160);
		textArea.setText(" ");
	
		for (int i = 0; i < visites.size(); i++) {
			textArea.setText( "nom = " + textArea.getText() + acquereurs.get(i).getAcq_nom() + "   " + acquereurs.get(i).getAcq_prenom() + "\n" + acquereurs.get(i).getAcq_prix() + "  " + visites.get(i).getVisite_date() +"\n \n");
		}
		contentPane.add(textArea);
	}
}
