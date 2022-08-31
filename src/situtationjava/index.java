package situtationjava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import PSrequete.psdossier;
import classebdd.adresse;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class index extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index frame = new index();
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
	public index() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("recap des dossiers :");
		lblNewLabel.setBounds(262, 10, 137, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("adresse");
		lblNewLabel_1.setBounds(129, 75, 73, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("dossier");
		lblNewLabel_2.setBounds(432, 72, 91, 31);
		contentPane.add(lblNewLabel_2);
		
		JButton btnaccesdossier = new JButton("Cr\u00E9er un dossier");
		btnaccesdossier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formulairedossier form = new formulairedossier();
				form.setVisible(true);
				dispose();
			}
		});
		btnaccesdossier.setBounds(239, 329, 160, 54);
		contentPane.add(btnaccesdossier);
		
		JButton btnquitter = new JButton("Quitter");
		btnquitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnquitter.setBounds(484, 329, 115, 54);
		contentPane.add(btnquitter);
		
		psdossier psdossier = new psdossier();
		List<adresse> adresses = psdossier.touteAdresse();
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(129, 141, 242, 22);
		contentPane.add(comboBox);
		for (int i=0; i < adresses.size(); i++) {
			comboBox.addItem(Integer.toString(adresses.get(i).getAdd_id()) + " " + adresses.get(i).getAdd_rue().toString() + " " + adresses.get(i).getAdd_ville().toString());
		}
		
		JButton accesdossier = new JButton("Acc\u00E8der");
		accesdossier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String adresse = comboBox.getSelectedItem().toString();
				int idAdd = Integer.parseInt(adresse.substring(0,adresse.indexOf(' ')));
				dossier dossier;
				try {
					dossier = new dossier(idAdd);
					dossier.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		accesdossier.setBounds(434, 141, 89, 23);
		contentPane.add(accesdossier);
		
	}
}
