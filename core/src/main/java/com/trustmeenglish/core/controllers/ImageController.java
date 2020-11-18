package com.trustmeenglish.core.controllers;

import com.trustmeenglish.core.dto.ImageDTO;
import com.trustmeenglish.core.mappers.ImageMapper;
import com.trustmeenglish.core.model.Image;
import com.trustmeenglish.core.services.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class ImageController {

    private final ImageService imageService;
    private final ImageMapper imageMapper;

    @GetMapping("/images/{id}")
    public ResponseEntity<?> getImage(@PathVariable Long id) throws IOException {
        Image image = imageService.getImage(id);
        return ResponseEntity.ok()
                             .header("fileName",image.getOriginalFilename())
                             .contentType(MediaType.valueOf(image.getContentType()))
                             .contentLength(image.getSize())
                             .body(image.getBytes());
    }
    @PostMapping("/images")
    public ResponseEntity<?> saveImage(@RequestParam("file") MultipartFile file)  throws IOException {
        Image image = imageMapper.toEntity(file);
        image = imageService.saveImage(image);
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("fileName",image.getOriginalFilename())
                .contentType(MediaType.valueOf(image.getContentType()))
                .contentLength(image.getSize())
                .body(image.getBytes());
    }
}
