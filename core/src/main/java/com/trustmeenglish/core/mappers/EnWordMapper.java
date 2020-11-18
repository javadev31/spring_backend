package com.trustmeenglish.core.mappers;

import com.trustmeenglish.core.dto.EnWordDTO;
import com.trustmeenglish.core.model.EnWord;
import org.mapstruct.Mapper;



@Mapper
public interface EnWordMapper {
    EnWordDTO toDTO(EnWord enWord);
}
