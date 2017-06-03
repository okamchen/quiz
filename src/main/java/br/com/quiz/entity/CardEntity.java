package br.com.quiz.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "card")
public class CardEntity {
	
	private Long id;
	private String nome;
	private List<PerguntaEntity> perguntas;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
	public List<PerguntaEntity> getPerguntas() {
		return perguntas;
	}
	public void setPerguntas(List<PerguntaEntity> perguntas) {
		this.perguntas = perguntas;
	}

}
