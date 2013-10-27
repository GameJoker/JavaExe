package com.gsi.tp_android;

import java.util.ArrayList;
import java.util.List;

public class JEEsujet {
	private List<sujet> Jsujet;
public JEEsujet(){
	Jsujet = new ArrayList<sujet>();
	sujet s1 = new sujet("J2EE a ¨¦t¨¦ lanc¨¦ par","Sun");
	s1.setChoose("Microsoft");
	s1.setChoose("Sun");
	s1.setChoose("Apple");
	s1.setChoose("Android");
	sujet s2 = new sujet("J2EE destine aux","applications d¡¯entreprise");
	s2.setChoose("applications du jeu");
	s2.setChoose("applications personnelles");
	s2.setChoose("applications bureautiques");
	s2.setChoose("applications d¡¯entreprise");
	sujet s3 = new sujet("La premi¨¨re version des sp¨¦cifications de J2EE fut publi¨¦e en","1999");
	s3.setChoose("1997");
	s3.setChoose("2001");
	s3.setChoose("1999");
	s3.setChoose("2007");
	sujet s4 = new sujet("Quel n'est pas une ¨¦dition du java","JSP");
	s4.setChoose("J2EE");
	s4.setChoose("JSE");
	s4.setChoose("JME");
	s4.setChoose("JSP");
	Jsujet.add(s1);
	Jsujet.add(s2);
	Jsujet.add(s3);
	Jsujet.add(s4);
}
public List<sujet> getJsujet() {
	return Jsujet;
}

}
