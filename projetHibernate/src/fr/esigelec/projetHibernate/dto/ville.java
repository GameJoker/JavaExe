package fr.esigelec.projetHibernate.dto;

public class ville {
	int id;
	String nom;
	String nb_habitants;
	int id_pays;
	public ville (){}
	public ville (int id,String nom,String nb_habitants,int id_pays){
		this.id = id;
		this.nom = nom;
		this.nb_habitants = nb_habitants;
		this.id_pays = id_pays;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNb_habitants() {
		return nb_habitants;
	}
	public void setNb_habitants(String nb_habitants) {
		this.nb_habitants = nb_habitants;
	}
	public int getId_pays() {
		return id_pays;
	}
	public void setId_pays(int id_pays) {
		this.id_pays = id_pays;
	}
	@Override
	public String toString() {
		return "ville [id=" + id + ", nom=" + nom + ", nb_habitants="
				+ nb_habitants + ", id_pays=" + id_pays + "]";
	}
	
}
