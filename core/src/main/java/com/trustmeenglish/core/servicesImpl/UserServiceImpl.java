package com.trustmeenglish.core.servicesImpl;

import com.trustmeenglish.core.model.User;
import com.trustmeenglish.core.repositories.UserRepository;
import com.trustmeenglish.core.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

   private final UserRepository userRepository;

    @Override
    public User getUser(Long id) {
                return userRepository.getById(id);
    }
}
