package situtationjava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import PSrequete.psdossier;
import classebdd.adresse;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import dao.connexiondao;

public class formulairedossier extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textnumadresse;
	private JTextField textrue;
	private JTextField textville;
	private JTextField textcp;
	private JTextField textsuperficie;
	private JTextField textdate;
	private JTextField textprixdevente;

	Connection conn = connexiondao.getConn();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formulairedossier frame = new formulairedossier();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public formulairedossier() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("formulaire cr\u00E9ation de dossier");
		lblNewLabel.setBounds(258, 10, 186, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Num\u00E9ro adresse :");
		lblNewLabel_1.setBounds(10, 56, 115, 13);
		contentPane.add(lblNewLabel_1);
		
		textnumadresse = new JTextField();
		textnumadresse.setBounds(110, 53, 28, 19);
		contentPane.add(textnumadresse);
		textnumadresse.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("rue :");
		lblNewLabel_2.setBounds(157, 56, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		textrue = new JTextField();
		textrue.setBounds(191, 53, 96, 19);
		contentPane.add(textrue);
		textrue.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ville :");
		lblNewLabel_3.setBounds(297, 56, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		textville = new JTextField();
		textville.setBounds(341, 53, 59, 19);
		contentPane.add(textville);
		textville.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("CP :");
		lblNewLabel_4.setBounds(435, 56, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		textcp = new JTextField();
		textcp.setBounds(475, 53, 45, 19);
		contentPane.add(textcp);
		textcp.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("exclusivit\u00E9");
		lblNewLabel_5.setBounds(10, 114, 85, 13);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton radioexclusiviteoui = new JRadioButton("Oui");
		radioexclusiviteoui.setBounds(110, 110, 59, 21);
		contentPane.add(radioexclusiviteoui);
		
		JRadioButton radioexclusivitenon = new JRadioButton("Non");
		radioexclusivitenon.setBounds(174, 110, 51, 21);
		contentPane.add(radioexclusivitenon);
		
		ButtonGroup radio = new ButtonGroup(); 
		radio.add(radioexclusiviteoui);
		radio.add(radioexclusivitenon);
		
		JLabel lblNewLabel_6 = new JLabel("Superficie : ");
		lblNewLabel_6.setBounds(10, 160, 85, 13);
		contentPane.add(lblNewLabel_6);
		
		textsuperficie = new JTextField();
		textsuperficie.setBounds(82, 157, 96, 19);
		contentPane.add(textsuperficie);
		textsuperficie.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Date de fin de mandat :");
		lblNewLabel_7.setBounds(216, 160, 153, 13);
		contentPane.add(lblNewLabel_7);
		
		textdate = new JTextField();
		textdate.setBounds(368, 157, 96, 19);
		contentPane.add(textdate);
		textdate.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Pi\u00E8ces :");
		lblNewLabel_8.setBounds(10, 218, 65, 13);
		contentPane.add(lblNewLabel_8);
		
		final JCheckBox checkboxcuisine = new JCheckBox("cuisine");
		checkboxcuisine.setBounds(14, 258, 93, 21);
		contentPane.add(checkboxcuisine);
		
		final JCheckBox checkboxsdb = new JCheckBox("salle de bain ");
		checkboxsdb.setBounds(109, 258, 111, 21);
		contentPane.add(checkboxsdb);
		
		final JCheckBox checkboxtoilette = new JCheckBox("toilette");
		checkboxtoilette.setBounds(222, 258, 83, 21);
		contentPane.add(checkboxtoilette);
		
		final JCheckBox checkboxchambre1 = new JCheckBox("chambre1");
		checkboxchambre1.setBounds(307, 258, 93, 21);
		contentPane.add(checkboxchambre1);
		
		final JCheckBox checkboxchambre2 = new JCheckBox("chambre2");
		checkboxchambre2.setBounds(406, 258, 93, 21);
		contentPane.add(checkboxchambre2);
		
		final JCheckBox checkboxchambre3 = new JCheckBox("chambre3");
		checkboxchambre3.setBounds(514, 258, 93, 21);
		contentPane.add(checkboxchambre3);
		
		final JCheckBox checkboxgarage = new JCheckBox("garage");
		checkboxgarage.setBounds(14, 310, 93, 21);
		contentPane.add(checkboxgarage);
		
		final JCheckBox checkboxpiscine = new JCheckBox("piscine");
		checkboxpiscine.setBounds(110, 310, 93, 21);
		contentPane.add(checkboxpiscine);
		
		final JCheckBox checkboxsalon = new JCheckBox("salon");
		checkboxsalon.setBounds(222, 310, 85, 21);
		contentPane.add(checkboxsalon);
		
		final JCheckBox checkboxterrasse = new JCheckBox("terrasse");
		checkboxterrasse.setBounds(307, 310, 93, 21);
		contentPane.add(checkboxterrasse);
		
		final JCheckBox checkboxgrenier = new JCheckBox("grenier");
		checkboxgrenier.setBounds(406, 310, 93, 21);
		contentPane.add(checkboxgrenier);
		
		JLabel lblNewLabel_9 = new JLabel("Prix de vente :");
		lblNewLabel_9.setBounds(14, 397, 93, 13);
		contentPane.add(lblNewLabel_9);
		
		textprixdevente = new JTextField();
		textprixdevente.setBounds(106, 394, 96, 19);
		contentPane.add(textprixdevente);
		textprixdevente.setColumns(10);
		
		JButton btnenvoieform = new JButton("enregistrez");
		btnenvoieform.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int add_num = Integer.parseInt(textnumadresse.getText());
				String add_rue = textrue.getText();
				String add_ville = textville.getText();
				int add_CP = Integer.parseInt(textcp.getText());
				int bien_surfacetotal = Integer.parseInt(textsuperficie.getText());
				Date bien_mandat_date = Date.valueOf(textdate.getText());
				
				psdossier psdossier = new psdossier();
				try {
					psdossier.ajouteradresse(add_num, add_rue, add_ville, add_CP);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String cuisine;
				if(checkboxcuisine.isSelected()) {
					 cuisine = "oui";
				}
				else {
					 cuisine = "non";
				}
				String sdb;
				if(checkboxsdb.isSelected()) {
					sdb = "oui";
				}
				else {
					sdb = "non";
				}
				String toilette;
				if(checkboxtoilette.isSelected()) {
					toilette = "oui";
				}
				else {
					toilette = "non";
				}
				String chambre1;
				if(checkboxchambre1.isSelected()) {
					chambre1 = "oui";
				}
				else {
					chambre1 = "non";
				}				
				String chambre2;
				if(checkboxchambre2.isSelected()) {
					chambre2 = "oui";
				}
				else {
					chambre2 = "non";
				}			
				String chambre3;
				if(checkboxchambre3.isSelected()) {
					chambre3 = "oui";
				}
				else {
					chambre3 = "non";
				}
				String garage;
				if(checkboxgarage.isSelected()) {
					garage = "oui";
				}
				else {
					garage = "non";
				}
				String piscine;
				if(checkboxpiscine.isSelected()) {
					piscine = "oui";
				}
				else {
					piscine = "non";
				}
				String salon;
				if(checkboxsalon.isSelected()) {
					salon = "oui";
				}
				else {
					salon = "non";
				}				
				String terrasse;
				if(checkboxterrasse.isSelected()) {
					terrasse = "oui";
				}
				else {
					terrasse = "non";
				}
				String grenier;
				if(checkboxgrenier.isSelected()) {
					grenier = "oui";
				}
				else {
					grenier = "non";
				}

				
				String prix_vente = textprixdevente.getText();
				
				adresse adresse = null;
				try {
					adresse = psdossier.trouverAdresse(add_num, add_rue, add_ville, add_CP);
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					psdossier.ajouterbien(add_ville, bien_surfacetotal, bien_mandat_date, cuisine, sdb, toilette, chambre1, chambre2, chambre3, garage, piscine, salon, terrasse, grenier, prix_vente, adresse.getAdd_id());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnenvoieform.setBounds(302, 463, 115, 29);
		contentPane.add(btnenvoieform);
		
		JButton btnquitter = new JButton("Quitter");
		btnquitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnquitter.setBounds(509, 463, 85, 29);
		contentPane.add(btnquitter);
		

	}
}
