package com.gsi.tp_android;

import java.util.ArrayList;

import Base.sujet;

public class Quiz {
	ArrayList<sujet> quiz =new ArrayList<sujet>();
	public Quiz()
	{	
		sujet S1 =new sujet("","");
		S1.setChoose("  ");
		S1.setChoose("  ");
		S1.setChoose("  ");
		S1.setChoose("  ");
		quiz.add(S1);
	}
	public ArrayList<sujet> getQuiz() {
		return quiz;
	}
	public void setQuiz(ArrayList<sujet> quiz) {
		this.quiz = quiz;
	}
}
