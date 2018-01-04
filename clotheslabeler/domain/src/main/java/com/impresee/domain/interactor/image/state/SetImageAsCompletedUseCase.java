package com.impresee.domain.interactor.image.state;

import com.impresee.domain.interactor.type.CompletableUseCaseWithParameter;
import com.impresee.domain.repository.ImageRepository;

import rx.Completable;

/**
 * Created by calvarez on 04-01-18.
 */

public class SetImageAsCompletedUseCase implements CompletableUseCaseWithParameter<Integer> {
    private ImageRepository imageRepository;

    public SetImageAsCompletedUseCase(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public Completable execute(Integer imageId) {
        return imageRepository.markImageAsCompleted(imageId);
    }
}
