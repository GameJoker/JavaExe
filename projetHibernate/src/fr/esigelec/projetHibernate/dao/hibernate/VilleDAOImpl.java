package fr.esigelec.projetHibernate.dao.hibernate;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import fr.esigelec.projetHibernate.dao.IVilleDAO;
import fr.esigelec.projetHibernate.dto.ville;

public class VilleDAOImpl implements IVilleDAO{

	@Override
	public void ajouter(ville v) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(v);
		session.getTransaction().commit();
	}

	@Override
	public ville getVille(int id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		ville v = (ville) session.get(ville.class, id);
		session.getTransaction().commit();
		return v;
	}

	@Override
	public List<ville> getVilles() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q=session.createQuery("from ville"); 
		List<ville> retour=q.list();
		session.getTransaction().commit();
		return retour;
	}

	@Override
	public void update(ville v) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(v);
		session.getTransaction().commit();
		
	}

	@Override
	public void delete(ville v) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(v);
		session.getTransaction().commit();
	}

	@Override
	public void refresh(ville v) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.refresh(v);
		session.getTransaction().commit();
	}

}
