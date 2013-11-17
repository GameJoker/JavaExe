package fr.esigelec.projetHibernate.dao.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import fr.esigelec.projetHibernate.dao.IPaysDAO;
import fr.esigelec.projetHibernate.dto.pays;
import fr.esigelec.projetHibernate.dto.ville;

public class PaysDAOImpl implements IPaysDAO{

	@Override
	public void ajouter(pays p) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		
	}

	@Override
	public pays getPays(int id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		pays p = (pays) session.get(pays.class, id);
		session.getTransaction().commit();
		return p;
	}

	@Override
	public List<pays> getPays() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q=session.createQuery("from pays"); 
		List<pays> retour=q.list();
		session.getTransaction().commit();
		return retour;
	}

	@Override
	public pays getPays(String nomPays) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q=session.createQuery("from pays where nom like " + nomPays );
		pays p = (pays) q.uniqueResult();
		session.getTransaction().commit();
		return p;
	}

	@Override
	public void update(pays p) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(p);
		session.getTransaction().commit();
		
	}

	@Override
	public void delete(pays p) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(p);
		session.getTransaction().commit();
		
	}

	@Override
	public void refresh(pays p) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.refresh(p);
		session.getTransaction().commit();
		
	}

}
