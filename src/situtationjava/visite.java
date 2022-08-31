package situtationjava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import PSrequete.psdossier;
import PSrequete.psvisite;
import classebdd.acquereur;
import classebdd.adresse;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Date;
import java.awt.event.ActionEvent;

public class visite extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textnom;
	private JTextField textprenom;
	private JTextField textprix;
	private JTextField textdate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					visite frame = new visite(null);
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
	public visite(final adresse adresse) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("renseigner une visite pour " + adresse.getAdd_rue());
		lblNewLabel.setBounds(235, 20, 207, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Informations visiteur :");
		lblNewLabel_1.setBounds(37, 66, 207, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nom :");
		lblNewLabel_2.setBounds(37, 124, 59, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Pr\u00E8nom :");
		lblNewLabel_3.setBounds(37, 181, 78, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Prix Propos\u00E9e : ");
		lblNewLabel_4.setBounds(36, 229, 103, 19);
		contentPane.add(lblNewLabel_4);

		textnom = new JTextField();
		textnom.setBounds(135, 123, 96, 19);
		contentPane.add(textnom);
		textnom.setColumns(10);
		
		textprenom = new JTextField();
		textprenom.setBounds(135, 177, 96, 19);
		contentPane.add(textprenom);
		textprenom.setColumns(10);
		
		textprix = new JTextField();
		textprix.setBounds(135, 228, 96, 19);
		contentPane.add(textprix);
		textprix.setColumns(10);
		
		JButton btnenregistrer = new JButton("enregistrer");
		btnenregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String acq_nom = textnom.getText();
				String acq_prenom = textprenom.getText();
				int acq_prix = Integer.parseInt(textprix.getText());
				
				psvisite psvisite = new psvisite();
				try {
					psvisite.ajouteracquereur(acq_nom, acq_prenom, acq_prix);
				}catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Date date_visite = (Date) Date.valueOf(textdate.getText());
				acquereur acquereur;
				try {
					acquereur = psvisite.trouveracq(acq_nom, acq_prenom, acq_prix);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					acquereur = null;
				}
				psdossier.ajoutervisite(date_visite, acquereur.getAcq_id(), adresse.getAdd_id());
				
			}
		});
		
		btnenregistrer.setBounds(275, 373, 161, 41);
		contentPane.add(btnenregistrer);
		
		JButton btnquitter = new JButton("Quitter");
		btnquitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnquitter.setBounds(488, 373, 161, 41);
		contentPane.add(btnquitter);
		
		
		JLabel lblNewLabel_5 = new JLabel("Date de visite : ");
		lblNewLabel_5.setBounds(37, 300, 114, 25);
		contentPane.add(lblNewLabel_5);
		
		textdate = new JTextField();
		textdate.setBounds(135, 300, 96, 25);
		contentPane.add(textdate);
		textdate.setColumns(10);
		
	}
}
