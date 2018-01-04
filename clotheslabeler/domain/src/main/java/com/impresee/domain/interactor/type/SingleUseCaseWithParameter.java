package com.impresee.domain.interactor.type;

import rx.Single;

/**
 * Created by calvarez on 04-01-18.
 */

public interface SingleUseCaseWithParameter<T,P> {
    Single<T> execute(P parameter);
}
