package fr.esigelec.projetStruts.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class PersonneForm extends ActionForm {
String nom;
String prenom;
String age;
public String getNom() {
	
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String toString(){
	return nom+" "+prenom+" "+age;
}
@Override
public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
	
	ActionErrors errors=new ActionErrors();
	int a = Integer.valueOf(age);
	
	if("".equals(nom))
			errors.add("erreur.nom",new ActionMessage("erreur.nom.vide"));
	if("".equals(prenom))
			errors.add("erreur.prenom",new ActionMessage("erreur.prenom.vide"));
	if(nom.length()>10)
			errors.add("erreur.nom",new ActionMessage("erreur.nom.length"));
	if(prenom.length()>10)
			errors.add("erreur.prenom",new ActionMessage("erreur.prenom.length"));
	if(a>=100||a<=10)
			errors.add("erreur.age",new ActionMessage("erreur.age.correct"));
	
	return errors;
}


}
