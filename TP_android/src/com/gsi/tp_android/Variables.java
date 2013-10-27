package com.gsi.tp_android;

import android.app.Application;

public class Variables extends Application{
	private int fois = 0; //To count times of the text
	private float Mnote = 0; //overall score
	private float Meva = 0; //overall evaluation
	private int efois = 0; // times of evaluation
	private int titre = 0; // number of problem
	private float note = 0; // score of once
	public float getNote() {
		return note;
	}
	public void setNote() {
		this.note = this.note + 5;
	}
	public void resetNote()
	{
		this.note = 0;
	}
	public int getTitre() {
		return titre;
	}
	public void setTitre() {
		this.titre ++;
	}
	public void resetTitre()
	{
		this.titre = 0;
	}
	public int getEfois() {
		return efois;
	}
	public void setEfois() {
		this.efois++;
	}
	public int getFois() {
		return fois;
	}
	public void setFois() {
		this.fois ++;
	}
	public float getMnote() {
		return Mnote;
	}
	public void setMnote(float mnote) {
		this.Mnote = this.Mnote + mnote;
	}
	public float getMeva() {
		return Meva;
	}
	public void setMeva(float meva) {
		this.Meva = this.Meva +meva;
	}
	
}
