package fr.esigelec.garageHibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class VoitureDAO {
	public VoitureDAO(){}
	public void ajouter(Voiture v){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(v);
		session.getTransaction().commit();
	}
	public void supprimer(Voiture v){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(v);
		session.getTransaction().commit();
	}
	
	public void supprimer(int idVoiture){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Voiture retour=(Voiture)session.get(Voiture.class,idVoiture);
		session.delete(retour);
		session.getTransaction().commit();
	}
	
	public void rouler(Voiture v,int distance){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		distance = distance + v.getKm();
		v.setKm(distance);
		session.update(v);
		session.getTransaction().commit();
	}
	public Voiture get(int idVoiture){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Voiture retour=(Voiture)session.get(Voiture.class,idVoiture);
		session.getTransaction().commit();
		return retour;
	}
	public List<Voiture> getVoitures(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q=session.createQuery("from Voiture"); //requete HQL
		List<Voiture> retour=q.list();
		session.getTransaction().commit();
		return retour;
	}
}
