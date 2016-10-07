package com.sfl.cronofy.api.client.exception;

import com.sfl.cronofy.api.model.common.AbstractCronofyRequest;

/**
 * User: Arthur Asatryan
 * Company: SFL LLC
 * Date: 10/7/16
 * Time: 9:23 PM
 */
public class UnknownStatusCodeException extends RuntimeException {
    private static final long serialVersionUID = 6484963847484081436L;

    private final AbstractCronofyRequest request;

    //region Constructors
    public UnknownStatusCodeException(final String message, final AbstractCronofyRequest request) {
        super(message);
        this.request = request;
    }
    //endregion

    //region Public methods
    public AbstractCronofyRequest getRequest() {
        return request;
    }
    //endregion
}
