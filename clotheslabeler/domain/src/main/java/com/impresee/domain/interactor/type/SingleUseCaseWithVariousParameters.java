package com.impresee.domain.interactor.type;

import rx.Single;

/**
 * Created by calvarez on 04-01-18.
 */

public interface SingleUseCaseWithVariousParameters<T, P1, P2> {

    Single<T> execute(P1 parameter1, P2 parameter2);

}
