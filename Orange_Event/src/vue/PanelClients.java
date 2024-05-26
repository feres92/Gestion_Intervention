package vue;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controleur.C_Client;
import controleur.Client;

import javax.swing.JPasswordField;

public class PanelClients extends PanelPrincipal implements ActionListener 
{
	
private JPanel panelForm = new JPanel();
private JButton btAnnuler = new JButton("Annuler");
private JButton btEnregistrer = new JButton("Enregistrer");

private JTextField txtNom = new JTextField();
private JTextField txtPrenom = new JTextField();
private JTextField txtAdresse = new JTextField();
private JTextField txtEmail = new JTextField();
private JTextField txtTel = new JTextField();


 public PanelClients()
 {
	 
	 super();
	 //construction du panelForm
	 this.panelForm.setBounds(20, 20,250,270);
	 this.panelForm.setBackground(new Color (246,172,34));

	 this.panelForm.setLayout(new GridLayout(7,2));
	 
	 this.panelForm.add(new JLabel("Nom :"));
	 this.panelForm.add(this.txtNom);
	 
	 this.panelForm.add(new JLabel("Prenom :"));
	 this.panelForm.add(this.txtPrenom);
	 
	 this.panelForm.add(new JLabel("Adresse :"));
	 this.panelForm.add(this.txtAdresse);
	 
	 this.panelForm.add(new JLabel("Email :"));
	 this.panelForm.add(this.txtEmail);

	 this.panelForm.add(new JLabel("Téléphone :"));
	 this.panelForm.add(this.txtTel);
	 
	 this.panelForm.add(this.btAnnuler);
	 this.panelForm.add(this.btEnregistrer);
	 this.add(this.panelForm);


//rendre les boutons executables
	 this.btAnnuler.addActionListener(this);
	 this.btEnregistrer.addActionListener(this);
 }
 public void viderChamps()
 {
	 this.txtNom.setText("");
	 this.txtPrenom.setText("");
	 this.txtAdresse.setText("");
	 this.txtTel.setText("");
	 this.txtEmail.setText("");

 }
 @Override
 public void actionPerformed(ActionEvent e) {
		if(e.getSource()== this.btAnnuler)
		{
			this.viderChamps();
		}
		else if (e.getSource()== this.btEnregistrer)
		{
			String nom = this.txtNom.getText();
			String prenom = this.txtPrenom.getText();
			String adresse = this.txtAdresse.getText();
			String email = this.txtEmail.getText();
			String tel = this.txtTel.getText();
			//  instanciation de la classe Client
			Client unClient = new Client(nom,prenom,email,adresse, tel);
			//insertion dans la base de données
			C_Client.insertClient(unClient);
			JOptionPane.showMessageDialog(this, "Client ajouter dans la BDD avec succès");

			this.viderChamps();

		}
	 

	 

	

 }
}
