package com.trustmeenglish.core.mappers;

import com.trustmeenglish.core.dto.UserDTO;
import com.trustmeenglish.core.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO toDTO(User user);
}
