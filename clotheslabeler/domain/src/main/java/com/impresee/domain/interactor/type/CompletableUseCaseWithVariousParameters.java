package com.impresee.domain.interactor.type;

import rx.Completable;

/**
 * Created by calvarez on 04-01-18.
 */

public interface CompletableUseCaseWithVariousParameters<P1,P2> {
    Completable execute(P1 parameter1, P2 parameter2);
}
