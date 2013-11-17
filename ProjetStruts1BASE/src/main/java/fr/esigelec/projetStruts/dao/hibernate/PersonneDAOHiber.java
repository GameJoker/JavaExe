package fr.esigelec.projetStruts.dao.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import fr.esigelec.projetStruts.dao.IPersonneDAO;
import fr.esigelec.projetStruts.dto.Personne;

public class PersonneDAOHiber implements IPersonneDAO {

	@Override
	public void ajouter(Personne p) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		
	}

	@Override
	public void supprimer(int id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Personne p=(Personne)session.get(Personne.class,id);
		session.delete(p);
		session.getTransaction().commit();
	}

	@Override
	public List<Personne> getListe() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q=session.createQuery("from Personne"); //requete HQL
		List<Personne> retour=q.list();
		session.getTransaction().commit();
		return retour;
	}

	@Override
	public List<Personne> getFamille(String nom) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q=session.createQuery("from Personne where nom like " + nom); //requete HQL
		List<Personne> retour=q.list();
		session.getTransaction().commit();
		return retour;
	}

}
