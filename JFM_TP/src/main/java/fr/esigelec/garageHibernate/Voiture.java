package fr.esigelec.garageHibernate;

public class Voiture {
	private int id;
	private String immatriculation;
	private String modele;
	private String proprietaire;
	private int anneeConstruction;
	private int km;
	public Voiture(){}
	public Voiture(int id,String immatriculation,String modele,String proprietaire,int anneeConstruction,int km){
		this.id = id;
		this.immatriculation =immatriculation;
		 this.modele = modele;
		 this.proprietaire =proprietaire;
		 this.anneeConstruction =anneeConstruction;
		 this.km = km;
	}
	public String toString()
	{
		String afficher ="Id:" + Integer.toString(id) +" Immatriculation:"+immatriculation+" modele:"+modele+" proprietaire:"+proprietaire;
		afficher += " anneeConstruction:"+Integer.toString(anneeConstruction)+" km:"+Integer.toString(km);
		return afficher;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}
	public int getAnneeConstruction() {
		return anneeConstruction;
	}
	public void setAnneeConstruction(int anneeConstruction) {
		this.anneeConstruction = anneeConstruction;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	
}
