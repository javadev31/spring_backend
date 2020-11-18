package com.trustmeenglish.core.controllers;

import com.trustmeenglish.core.dto.EnWordDTO;
import com.trustmeenglish.core.mappers.EnWordMapper;
import com.trustmeenglish.core.model.EnWord;
import com.trustmeenglish.core.services.EnWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EnWordController {

    private final EnWordService enWordService;
    private final EnWordMapper enWordMapper;

    @GetMapping("/en_words/{id}")
    public EnWordDTO sayHello(@PathVariable Long id){
        EnWord enWord = enWordService.getEnWord(id);
        return enWordMapper.toDTO(enWord);
    }
}
