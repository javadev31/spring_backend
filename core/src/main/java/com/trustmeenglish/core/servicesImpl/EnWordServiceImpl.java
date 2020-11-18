package com.trustmeenglish.core.servicesImpl;

import com.trustmeenglish.core.model.EnWord;
import com.trustmeenglish.core.repositories.EnWordRepository;
import com.trustmeenglish.core.services.EnWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnWordServiceImpl implements EnWordService {

   private final EnWordRepository enWordRepository;

    @Override
    public EnWord getEnWord(Long id) {
                return enWordRepository.getById(id);
    }
}
