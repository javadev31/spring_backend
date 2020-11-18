package com.trustmeenglish.core.controllers;

import com.trustmeenglish.core.dto.CardDTO;
import com.trustmeenglish.core.dto.EnWordDTO;
import com.trustmeenglish.core.dto.RuWordDTO;
import com.trustmeenglish.core.mappers.CardMapper;
import com.trustmeenglish.core.mappers.EnWordMapper;
import com.trustmeenglish.core.model.Card;
import com.trustmeenglish.core.model.EnWord;
import com.trustmeenglish.core.model.RuWord;
import com.trustmeenglish.core.services.CardService;
import com.trustmeenglish.core.services.EnWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;
    private final CardMapper cardMapper;

    @GetMapping("/cards/{id}")
    public ResponseEntity sayHello(@PathVariable Long id) throws IOException {

        Card card = cardService.getCard(id);
        CardDTO cardDTO = cardMapper.toDTO(card);
        return new ResponseEntity(cardDTO, HttpStatus.OK);
    }
    @PostMapping("/cards")
    public ResponseEntity saveCard(@RequestBody CardDTO cardDTO) throws IOException {

        Card card = cardMapper.toEntity(cardDTO);
        card = cardService.addCard(card);
        cardDTO = cardMapper.toDTO(card);
        return new ResponseEntity<>(cardDTO, HttpStatus.CREATED);
    }
}
