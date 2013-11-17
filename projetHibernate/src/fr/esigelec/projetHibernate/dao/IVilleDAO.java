package fr.esigelec.projetHibernate.dao;

import java.util.List;

import fr.esigelec.projetHibernate.dto.ville;

public interface IVilleDAO {
	public void ajouter(ville v);
	public ville getVille(int id);
	public List<ville> getVilles();
	public void update(ville v);
	public void delete(ville v);
	public void refresh(ville v);
}
