package fr.esigelec.projetHibernate.dto;

public class pays {
	int id;
	String nom;
	String superficie;
	public pays(){}
	public pays(int id, String nom,String superficie){
		this.id = id;
		this.nom= nom;
		this.superficie = superficie;
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
	public String getSuperficie() {
		return superficie;
	}
	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}
	@Override
	public String toString() {
		return "pays [id=" + id + ", nom=" + nom + ", superficie=" + superficie
				+ "]";
	}
	
}
