package com.trustmeenglish.core.repositories;

import com.trustmeenglish.core.model.EnWord;
import com.trustmeenglish.core.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnWordRepository extends CrudRepository<EnWord, Long> {
    EnWord getById(Long id);
}
