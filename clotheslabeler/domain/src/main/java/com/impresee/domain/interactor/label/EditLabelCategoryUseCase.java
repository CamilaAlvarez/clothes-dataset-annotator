package com.impresee.domain.interactor.label;

import com.impresee.domain.interactor.type.CompletableUseCaseWithVariousParameters;
import com.impresee.domain.model.Category;
import com.impresee.domain.repository.LabelRepository;

import rx.Completable;

/**
 * Created by calvarez on 04-01-18.
 */

public class EditLabelCategoryUseCase implements
        CompletableUseCaseWithVariousParameters<Category,Integer> {
    private LabelRepository labelRepository;

    public EditLabelCategoryUseCase(LabelRepository labelRepository) {
        this.labelRepository = labelRepository;
    }

    @Override
    public Completable execute(Category category, Integer labelId) {
        return labelRepository.editLabelCategory(labelId, category);
    }
}
