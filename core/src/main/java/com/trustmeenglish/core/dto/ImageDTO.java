package com.trustmeenglish.core.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ImageDTO {
    private Long id;
    private String name;
    private String original_filename;
    private String content_type;
    private Long size;
    private byte[] bytes;
}
