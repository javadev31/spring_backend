package com.trustmeenglish.core.services;

import com.trustmeenglish.core.model.Image;

public interface ImageService {
    Image getImage(Long id);
    Image saveImage(Image image);
}
