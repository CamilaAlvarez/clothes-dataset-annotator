package com.impresee.domain.interactor.label;

import com.impresee.domain.interactor.type.CompletableUseCaseWithParameter;
import com.impresee.domain.interactor.type.CompletableUseCaseWithVariousParameters;
import com.impresee.domain.model.Label;
import com.impresee.domain.repository.ImageRepository;
import com.impresee.domain.repository.LabelRepository;

import rx.Completable;

/**
 * Created by calvarez on 04-01-18.
 */

public class AddLabelToImageUseCase implements
        CompletableUseCaseWithVariousParameters<Integer, Label> {
    private ImageRepository imageRepository;
    private LabelRepository labelRepository;

    public AddLabelToImageUseCase(ImageRepository imageRepository, LabelRepository labelRepository) {
        this.imageRepository = imageRepository;
        this.labelRepository = labelRepository;
    }

    @Override
    public Completable execute(Integer imageId, Label label) {
        return imageRepository.getImage(imageId)
                .flatMapCompletable(image -> labelRepository
                        .addLabelToImage(image, label.getLabelId()));
    }
}
