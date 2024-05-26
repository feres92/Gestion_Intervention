package controleur;

public class Technicien {
	private int idtechnicien; 
	private String nom, prenom, email, mdp, tel, qualification ; 
	
	public Technicien(int idtechnicien, String nom, String prenom, String email, String mdp, String tel,
			String qualification) {
		 
		this.idtechnicien = idtechnicien;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mdp = mdp;
		this.tel = tel;
		this.qualification = qualification;
	}
	
	public Technicien( String nom, String prenom, String email, String mdp, String tel,
			String qualification) {
		 
		this.idtechnicien = 0;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mdp = mdp;
		this.tel = tel;
		this.qualification = qualification;
	}
	public Technicien( ) {
		 
		this.idtechnicien = 0;
		this.nom = "";
		this.prenom = "";
		this.email = "";
		this.mdp = "";
		this.tel = "";
		this.qualification = "";
	}

	public int getIdtechnicien() {
		return idtechnicien;
	}

	public void setIdtechnicien(int idtechnicien) {
		this.idtechnicien = idtechnicien;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	
}





