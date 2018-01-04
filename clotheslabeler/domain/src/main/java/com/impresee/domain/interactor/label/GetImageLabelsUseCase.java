package com.impresee.domain.interactor.label;

import com.impresee.domain.interactor.type.SingleUseCaseWithParameter;
import com.impresee.domain.model.Label;
import com.impresee.domain.repository.ImageRepository;
import com.impresee.domain.repository.LabelRepository;

import java.util.List;

import rx.Single;

/**
 * Created by calvarez on 04-01-18.
 */

public class GetImageLabelsUseCase implements SingleUseCaseWithParameter<List<Label>, Integer> {
    private LabelRepository labelRepository;
    private ImageRepository imageRepository;

    public GetImageLabelsUseCase(LabelRepository labelRepository, ImageRepository imageRepository) {
        this.labelRepository = labelRepository;
        this.imageRepository = imageRepository;
    }

    @Override
    public Single<List<Label>> execute(Integer imageId) {
        return imageRepository.getImage(imageId)
                .flatMap(image -> labelRepository.getImageLabels(image));

    }
}
