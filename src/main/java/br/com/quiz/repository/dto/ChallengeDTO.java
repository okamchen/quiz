package br.com.quiz.repository.dto;

import java.io.Serializable;
import java.util.Date;

public class ChallengeDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private UserDTO challenged;
	private UserDTO challenger;
	private CardDTO card;
	private Integer pointsChallenger;
	private Integer pointsChallenged;
	private Date dateChallenge;
	
	public ChallengeDTO() {}
	
	public ChallengeDTO(Long id, UserDTO challenged, UserDTO challenger, CardDTO card, Integer pointsChallenger,
			Integer pointsChallenged, Date dateChallenge) {
	
		this.id = id;
		this.challenged = challenged;
		this.challenger = challenger;
		this.card = card;
		this.pointsChallenger = pointsChallenger;
		this.pointsChallenged = pointsChallenged;
		this.dateChallenge = dateChallenge;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserDTO getChallenged() {
		return challenged;
	}

	public void setChallenged(UserDTO challenged) {
		this.challenged = challenged;
	}

	public UserDTO getChallenger() {
		return challenger;
	}

	public void setChallenger(UserDTO challenger) {
		this.challenger = challenger;
	}

	public CardDTO getCard() {
		return card;
	}

	public void setCard(CardDTO card) {
		this.card = card;
	}

	public Integer getPointsChallenger() {
		return pointsChallenger;
	}

	public void setPointsChallenger(Integer pointsChallenger) {
		this.pointsChallenger = pointsChallenger;
	}

	public Integer getPointsChallenged() {
		return pointsChallenged;
	}

	public void setPointsChallenged(Integer pointsChallenged) {
		this.pointsChallenged = pointsChallenged;
	}

	public Date getDateChallenge() {
		return dateChallenge;
	}

	public void setDateChallenge(Date dateChallenge) {
		this.dateChallenge = dateChallenge;
	}
	
}
