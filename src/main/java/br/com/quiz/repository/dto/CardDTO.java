package br.com.quiz.repository.dto;

import java.util.List;

public class CardDTO {
	
	private Long id;
	private String name;
	private List<QuestionDTO> questions;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<QuestionDTO> getQuestions() {
		return questions;
	}
	
	public void setQuestions(List<QuestionDTO> questions) {
		this.questions = questions;
	}
	
}
