package controleur;

import java.util.ArrayList;

import modele.ModeleClient;


public class C_Client {
	public static void insertClient (Client unClient)
	{
		ModeleClient.insertClient(unClient);
	}
	
	public static ArrayList<Client> listerClients ()
	{
		return  ModeleClient.selectAllClients();
	}
	
	public static void supprimerClient (int idclient)
	{
		ModeleClient.deleteClient(idclient);
	}
	
	public static void modifierClient (Client unClient)
	{
		ModeleClient.updateClient(unClient); 
	}
}
