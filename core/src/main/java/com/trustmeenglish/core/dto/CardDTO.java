package com.trustmeenglish.core.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class CardDTO {
    private Long id;
    private EnWordDTO enWordDTO;
    private RuWordDTO ruWordDTO;
    private ImageDTO image;
    private Long rating;
}
