package com.trustmeenglish.core.mappers;

import com.trustmeenglish.core.dto.RuWordDTO;
import com.trustmeenglish.core.model.RuWord;
import org.mapstruct.Mapper;


@Mapper
public interface RuWordMapper {
    RuWordDTO toDTO(RuWord ruWord);
}
