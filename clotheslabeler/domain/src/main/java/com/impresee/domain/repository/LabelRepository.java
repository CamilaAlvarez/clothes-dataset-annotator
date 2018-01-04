package com.impresee.domain.repository;

import com.impresee.domain.model.Category;
import com.impresee.domain.model.Image;
import com.impresee.domain.model.Label;

import java.util.List;

import rx.Completable;
import rx.Single;

/**
 * Created by calvarez on 04-01-18.
 */

public interface LabelRepository {
    Single<Label> createLabel(int x1, int y1, int x2, int y2, Category category);
    Completable editLabelCategory(int labelId, Category category);
    Completable addLabelToImage(Image image, int labelId);
    Completable removeLabelFromImage(Image image, int labelId);
    Single<List<Label>> getImageLabels(Image image);
    Single<Integer> getNumberOfLabels();
}
