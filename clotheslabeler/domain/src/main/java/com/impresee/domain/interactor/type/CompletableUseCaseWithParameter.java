package com.impresee.domain.interactor.type;

import rx.Completable;

/**
 * Created by calvarez on 04-01-18.
 */

public interface CompletableUseCaseWithParameter<P> {
    Completable execute(P parameter);
}
