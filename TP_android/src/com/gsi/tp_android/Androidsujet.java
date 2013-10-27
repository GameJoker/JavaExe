package com.gsi.tp_android;

import java.util.ArrayList;
import java.util.List;

public class Androidsujet {
	private List<sujet> Asujet;
public List<sujet> getAsujet() {
		return Asujet;
	}
public Androidsujet(){
	Asujet = new ArrayList<sujet>();
	sujet s1 = new sujet("Android est un syst¨¨me d'exploitation pour:","Smartphones");
	s1.setChoose("PC");
	s1.setChoose("Smartphones");
	s1.setChoose("IOS");
	s1.setChoose("PSP");
	sujet s2 = new sujet("Android est un syst¨¨me:","open source");
	s2.setChoose("cher");
	s2.setChoose("sp¨¦cial");
	s2.setChoose("open source");
	s2.setChoose("priv¨¦");
	sujet s3 = new sujet("Android a ¨¦t¨¦ lanc¨¦ en:","novembre 2007");
	s3.setChoose("septembre 2008");
	s3.setChoose("septembre 2007");
	s3.setChoose("novembre 2008");
	s3.setChoose("novembre 2007");
	sujet s4 = new sujet("Android a ¨¦t¨¦ lanc¨¦ par:","Android");
	s4.setChoose("Apple");
	s4.setChoose("Microsoft");
	s4.setChoose("Android");
	s4.setChoose("Sun");
	Asujet.add(s1);
	Asujet.add(s2);
	Asujet.add(s3);
	Asujet.add(s4);
}
}
