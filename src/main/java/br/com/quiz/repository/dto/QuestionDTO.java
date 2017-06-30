package br.com.quiz.repository.dto;

import java.io.Serializable;

public class QuestionDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String description;
	private boolean awser;
	private int punctuation;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isAwser() {
		return awser;
	}
	
	public void setAwser(boolean awser) {
		this.awser = awser;
	}

	public int getPunctuation() {
		return punctuation;
	}

	public void setPunctuation(int punctuation) {
		this.punctuation = punctuation;
	}
	
}
