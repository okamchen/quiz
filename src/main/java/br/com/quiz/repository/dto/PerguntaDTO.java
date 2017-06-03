package br.com.quiz.repository.dto;

public class PerguntaDTO {
	
	private Long id;
	private String descricao;
	private boolean resposta;
	private int pontuacao;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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

}
