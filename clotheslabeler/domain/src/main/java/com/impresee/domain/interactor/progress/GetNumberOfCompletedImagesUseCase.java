package com.impresee.domain.interactor.progress;

import com.impresee.domain.interactor.type.SingleUseCase;
import com.impresee.domain.repository.ImageRepository;

import rx.Single;

/**
 * Created by calvarez on 04-01-18.
 */

public class GetNumberOfCompletedImagesUseCase implements SingleUseCase<Integer> {
    private ImageRepository imageRepository;

    public GetNumberOfCompletedImagesUseCase(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public Single<Integer> execute() {
        return imageRepository.getNumberOfCompletedImages();
    }
}
