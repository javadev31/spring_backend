package com.trustmeenglish.core.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "images")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String originalFilename;
    private String contentType;
    private Long size;
    @Lob
    private byte[] bytes;
}
