package com.impresee.domain.interactor.progress;

import com.impresee.domain.interactor.type.SingleUseCase;
import com.impresee.domain.repository.LabelRepository;

import rx.Single;

/**
 * Created by calvarez on 04-01-18.
 */

public class GetNumberOfLabelsUseCase implements SingleUseCase<Integer> {
    private LabelRepository labelRepository;

    public GetNumberOfLabelsUseCase(LabelRepository labelRepository) {
        this.labelRepository = labelRepository;
    }

    @Override
    public Single<Integer> execute() {
        return labelRepository.getNumberOfLabels();
    }
}
