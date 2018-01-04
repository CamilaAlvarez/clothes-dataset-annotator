package com.impresee.domain.interactor.label;

import com.impresee.domain.interactor.type.CompletableUseCaseWithVariousParameters;
import com.impresee.domain.model.Label;
import com.impresee.domain.repository.ImageRepository;
import com.impresee.domain.repository.LabelRepository;

import rx.Completable;

/**
 * Created by calvarez on 04-01-18.
 */

public class RemoveLabelFromImage implements CompletableUseCaseWithVariousParameters<Integer, Integer> {
    private ImageRepository imageRepository;
    private LabelRepository labelRepository;

    public RemoveLabelFromImage(ImageRepository imageRepository, LabelRepository labelRepository) {
        this.imageRepository = imageRepository;
        this.labelRepository = labelRepository;
    }

    @Override
    public Completable execute(Integer imageId, Integer labelId) {
        return imageRepository.getImage(imageId)
                .flatMapCompletable(image -> labelRepository.removeLabelFromImage(image, labelId));
    }
}
