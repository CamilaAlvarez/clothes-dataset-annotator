package com.impresee.domain.repository;

import com.impresee.domain.model.Image;

import java.util.List;

import rx.Completable;
import rx.Single;

/**
 * Created by calvarez on 04-01-18.
 */

public interface ImageRepository {
    Single<Image> getImage(int imageId);
    Single<List<Image>> getCurrentImageBatch();
    Single<List<Image>> getNewImageBatch();
    Completable markImageAsCompleted(int imageId);
    Completable markImageAsInvalid(int imageId);
    Completable markImageAsInProgress(int imageId);
    Single<Integer> getNumberOfCompletedImages();
}
