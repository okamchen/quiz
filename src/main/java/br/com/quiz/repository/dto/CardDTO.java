package br.com.quiz.repository.dto;

import java.util.List;

public class CardDTO {

	private Long id;
	private String nome;
	private List<PerguntaDTO> perguntas;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<PerguntaDTO> getPerguntas() {
		return perguntas;
	}
	
	public void setPerguntas(List<PerguntaDTO> perguntas) {
		this.perguntas = perguntas;
	}
	
}
