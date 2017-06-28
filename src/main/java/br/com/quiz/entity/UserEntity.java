package br.com.quiz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@SequenceGenerator(name="user_seq", sequenceName="user_seq", initialValue=0, allocationSize=1)
public class UserEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@Column(name="username")
    private String username;
	
	@Column(name="password")
    private String password;
	
	public UserEntity() {
	}
	
	public UserEntity(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="user_seq")
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

}
