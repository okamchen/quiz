package br.com.quiz.repository.dto;

import java.util.HashMap;

public class DesafioDTO {
	
	private HashMap<UsuarioDTO, Integer> desafianteAcertos;
	private HashMap<UsuarioDTO, Integer> desafiadoAcertos;
	private CardDTO card;
	
	public HashMap<UsuarioDTO, Integer> getDesafianteAcertos() {
		return desafianteAcertos;
	}
	
	public void setDesafianteAcertos(HashMap<UsuarioDTO, Integer> desafianteAcertos) {
		this.desafianteAcertos = desafianteAcertos;
	}
	
	public HashMap<UsuarioDTO, Integer> getDesafiadoAcertos() {
		return desafiadoAcertos;
	}
	
	public void setDesafiadoAcertos(HashMap<UsuarioDTO, Integer> desafiadoAcertos) {
		this.desafiadoAcertos = desafiadoAcertos;
	}
	
	public CardDTO getCard() {
		return card;
	}
	
	public void setCard(CardDTO card) {
		this.card = card;
	}
	
}
