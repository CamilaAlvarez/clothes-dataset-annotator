package com.impresee.domain.interactor.label;

import com.impresee.domain.interactor.type.SingleUseCaseWithVariousParameters;
import com.impresee.domain.model.Category;
import com.impresee.domain.model.Label;
import com.impresee.domain.repository.LabelRepository;

import java.util.List;

import rx.Single;

/**
 * Created by calvarez on 04-01-18.
 */

public class CreateLabelUseCase implements SingleUseCaseWithVariousParameters<Label,
        List<Integer>, Category> {
    private LabelRepository labelRepository;

    public CreateLabelUseCase(LabelRepository labelRepository) {
        this.labelRepository = labelRepository;
    }

    @Override
    public Single<Label> execute(List<Integer> boundingBox, Category category) {
        return labelRepository.createLabel(boundingBox.get(0), boundingBox.get(1),
                boundingBox.get(2),boundingBox.get(3), category);
    }
}
