/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quiz.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.quiz.entity.UserEntity;

public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long> {
    
	UserEntity findByUsername(String username);
	
    UserEntity findByUsernameAndPassword(String username, String password);
}
