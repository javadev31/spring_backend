package com.trustmeenglish.core.repositories;

import com.trustmeenglish.core.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
   User getById(Long id);
}
