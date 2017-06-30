package br.com.quiz.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "challenge")
@SequenceGenerator(name="challenge_seq", sequenceName="challenge_seq", initialValue=0, allocationSize=1)
public class ChallengeEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id  
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="challenge_seq")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY, optional=true)
	@JoinColumn(name="id_challenged", referencedColumnName="id")
	private UserEntity challenged;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_challenger", referencedColumnName="id")
	private UserEntity challenger;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_card", referencedColumnName="id")
	private CardEntity card;
	
	@Column(name="points_challenger")
	private Integer pointsChallenger;
	
	@Column(name="points_challenged")
	private Integer pointsChallenged;

	@Column(name="date_challenge")
	private Date dateChallenge;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserEntity getChallenged() {
		return challenged;
	}

	public void setChallenged(UserEntity challenged) {
		this.challenged = challenged;
	}

	public UserEntity getChallenger() {
		return challenger;
	}

	public void setChallenger(UserEntity challenger) {
		this.challenger = challenger;
	}

	public CardEntity getCard() {
		return card;
	}

	public void setCard(CardEntity card) {
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
