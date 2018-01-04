package com.impresee.domain.interactor.type;

import rx.Completable;

/**
 * Created by calvarez on 04-01-18.
 */

public interface CompletableUseCase {
    Completable execute();
}
