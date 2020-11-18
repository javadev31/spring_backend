package com.trustmeenglish.core.services;

import com.trustmeenglish.core.model.Card;

public interface CardService {
    Card getCard(Long id);
    Card addCard(Card card);
}
