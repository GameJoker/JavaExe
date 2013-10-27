package fr.esigelec.garageHibernate;

public class Tester {
	public static void main(String[] args) {
		//on instancie le DAO
		VoitureDAO dao=new VoitureDAO();
		//cr¨¦ation d'une voiture
		Voiture v=new Voiture(0,"07893AD","S","S",7,25000);
		//ajout de la personne dans la base
		//dao.ajouter(v);
		//affichage de la personne ajout¨¦e (son id sera celui qui a ¨¦t¨¦ fix¨¦ par la base)
		System.out.println(v);
		//affichage de toute la table personne
		System.out.println(dao.getVoitures());
		//affichage des personnes dont le salaire est compris entre 20000 et 30000 euros
		System.out.println(dao.get(4));
		}
}
