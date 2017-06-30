package br.com.quiz.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@SequenceGenerator(name="user_seq", sequenceName="user_seq", initialValue=0, allocationSize=1)
public class UserEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="user_seq")
	private Long id;
	
	@Column(name="username")
    private String username;
	
	@Column(name="password")
    private String password;
	
	@OneToMany(mappedBy="challenged", fetch = FetchType.LAZY)
	private List<ChallengeEntity> challengesChallenged;
	
	@OneToMany(mappedBy="challenger", fetch = FetchType.LAZY)
	private List<ChallengeEntity> challengesChallenger;

	public UserEntity() {}
	
	public UserEntity(Long id) {
		this.id = id;
	}
	
	public UserEntity(String username, String password) {
		this.username = username;
		this.password = password;
	}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public List<ChallengeEntity> getChallengesChallenged() {
		return challengesChallenged;
	}

	public void setChallengesChallenged(List<ChallengeEntity> challengesChallenged) {
		this.challengesChallenged = challengesChallenged;
	}

	public List<ChallengeEntity> getChallengesChallenger() {
		return challengesChallenger;
	}

	public void setChallengesChallenger(List<ChallengeEntity> challengesChallenger) {
		this.challengesChallenger = challengesChallenger;
	}
	
}
