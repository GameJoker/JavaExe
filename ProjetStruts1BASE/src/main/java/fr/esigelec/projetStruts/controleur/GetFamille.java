package fr.esigelec.projetStruts.controleur;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import fr.esigelec.projetStruts.dao.IPersonneDAO;
import fr.esigelec.projetStruts.dao.PersonneDAOFactory;

public class GetFamille extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String nom=new String(request.getParameter("nom"));
		
		IPersonneDAO personneDAO=PersonneDAOFactory.getPersonneDAO();
		request.setAttribute("liste",personneDAO.getFamille(nom));

		return mapping.findForward("succes");
	}
}
