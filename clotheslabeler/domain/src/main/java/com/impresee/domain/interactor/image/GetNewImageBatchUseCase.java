package com.impresee.domain.interactor.image;

import com.impresee.domain.interactor.type.SingleUseCase;
import com.impresee.domain.model.Image;
import com.impresee.domain.repository.ImageRepository;

import java.util.List;

import rx.Single;

/**
 * Created by calvarez on 04-01-18.
 */

public class GetNewImageBatchUseCase implements SingleUseCase<List<Image>> {
    private ImageRepository imageRepository;

    public GetNewImageBatchUseCase(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public Single<List<Image>> execute() {
        return imageRepository.getNewImageBatch();
    }
}
