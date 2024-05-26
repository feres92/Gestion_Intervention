package vue;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controleur.OrangeEvent;

public class VueGenerale extends JFrame implements ActionListener
{
	private JPanel panelMenu = new JPanel (); 
	
	private JButton btProfil = new JButton("Profil"); 
	private JButton btClients= new JButton("Clients"); 
	private JButton btTechniciens= new JButton("Techniciens"); 
	private JButton btInterventions = new JButton("Interventions"); 
	private JButton btStats= new JButton("Statistiques"); 
	private JButton btQuitter= new JButton("Quitter"); 
	
	//liste des panels d'administration
	private PanelClients unPanelClient = new PanelClients();
	private PanelTechniciens unPanelTechnicien = new PanelTechniciens();
	private PanelIntervention unPanelIntervention = new PanelIntervention(); 
	
	public VueGenerale (Technicien unTechnicien)
	{
		this.setTitle("Logiciel de gestion des interventions");
		this.setBounds(100, 100, 900, 450);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color (246, 172, 34));
		this.setLayout(null);
		
		//construction du Panel Menu 
		this.panelMenu.setBackground(new Color (246, 172, 34));
		this.panelMenu.setBounds(40,20, 800, 30);
		this.panelMenu.setLayout(new GridLayout(1, 6));
		this.panelMenu.add(this.btProfil); 
		this.panelMenu.add(this.btClients); 
		this.panelMenu.add(this.btTechniciens); 
		this.panelMenu.add(this.btInterventions); 
		this.panelMenu.add(this.btStats); 
		this.panelMenu.add(this.btQuitter); 
		this.add(this.panelMenu);
		
		
		
		
		
//rendre les boutons executables
		this.btQuitter.addActionListener(this);
		this.btProfil.addActionListener(this);
		this.btClients.addActionListener(this);
		this.btTechniciens.addActionListener(this);
		this.btInterventions.addActionListener(this);
		this.btStats.addActionListener(this);
		
		
		//ajout des panels dans la fenetre
		this.add(this.unPanelClient);
		this.add(this.unPanelTechnicien);
		this.add(this.unPanelIntervention);

		
		
this.setVisible(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== this.btQuitter)
		{
			int retour = JOptionPane.showConfirmDialog(this, "Voulez-vous quitter l'application ?", "Quitter l'application"
					, JOptionPane.YES_NO_OPTION);
			if (retour == 0) {
			OrangeEvent.rendreVisibleVueGenerale(false,null);
			OrangeEvent.rendreVisibleVueConnexion(true);
			}
		}
		else if (e.getSource()== this.btClients)
		{
			this.unPanelClient.setVisible(true);
			this.unPanelTechnicien.setVisible(false);
			this.unPanelIntervention.setVisible(false);

		}
		else if (e.getSource()== this.btTechniciens)
		{
			this.unPanelTechnicien.setVisible(true);
			this.unPanelClient.setVisible(false);
			this.unPanelIntervention.setVisible(false);
		}
		else if (e.getSource()== this.btInterventions)
		{
			this.unPanelTechnicien.setVisible(false);
			this.unPanelClient.setVisible(false);
			this.unPanelIntervention.setVisible(true);
		}

	} 
}









