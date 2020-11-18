package com.trustmeenglish.core.mappers;

import com.trustmeenglish.core.dto.ImageDTO;
import com.trustmeenglish.core.model.Image;
import org.mapstruct.Mapper;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@Mapper
public interface ImageMapper {
    ImageDTO toDTO(Image image) throws IOException;
    Image toEntity(MultipartFile file) throws IOException;
}
