package br.com.quiz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pergunta")
public class PerguntaEntity {
	
	private Long id;
	private String descricao;
	private boolean resposta;
	private int pontuacao;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }
	
    public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isResposta() {
		return resposta;
	}

	public void setResposta(boolean resposta) {
		this.resposta = resposta;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public void setId(Long id) {
        this.id = id;
    }

}
