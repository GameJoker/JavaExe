package fr.esigelec.projetHibernate.dao;

import java.util.List;

import fr.esigelec.projetHibernate.dto.pays;

public interface IPaysDAO {
	public void ajouter(pays p);
	public pays getPays(int id);
	public List<pays> getPays();
	public pays getPays(String nomPays);
	public void update(pays p);
	public void delete(pays p);
	public void refresh(pays p);
}
