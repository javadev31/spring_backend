package com.trustmeenglish.core.repositories;

import com.trustmeenglish.core.model.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends CrudRepository<Card, Long> {
    Card getById(Long id);
}

