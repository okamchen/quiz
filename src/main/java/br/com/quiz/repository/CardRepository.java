package br.com.quiz.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.quiz.entity.CardEntity;

public interface CardRepository extends PagingAndSortingRepository<CardEntity, Long> {

}
