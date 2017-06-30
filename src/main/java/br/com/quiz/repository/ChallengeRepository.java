package br.com.quiz.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.quiz.entity.ChallengeEntity;

public interface ChallengeRepository extends PagingAndSortingRepository<ChallengeEntity, Long> {

}
