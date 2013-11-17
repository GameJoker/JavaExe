package Base;

import java.util.ArrayList;
import java.util.List;

public class sujet {
	String titre;
	List<String> choose;
	String repondre;
	public sujet(String titre, String repondre){
		this.titre = titre;
		this.repondre = repondre;
		choose = new ArrayList<String>();
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public List<String> getChoose() {
		return choose;
	}
	public void setChoose(String choose) {
		this.choose.add(choose);
		
	}
	public String getRepondre() {
		return repondre;
	}
	public void setRepondre(String repondre) {
		this.repondre = repondre;
	}
	
}
