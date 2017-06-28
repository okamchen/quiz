package br.com.quiz.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.quiz.entity.CardEntity;

public interface CardRepository extends PagingAndSortingRepository<CardEntity, Long> {

//    public List<CardEntity> findByNome(String nome);
//
//    @Query("select p from PessoaEntity p where nome like %:nome%")
//    public List<PessoaEntity> findByNomeLike(@Param("nome") String nome);

}
