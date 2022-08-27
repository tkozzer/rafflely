package org.rafflely.raffleservice.models.results;

import com.auth0.jwt.JWT;

public class ErrorResult extends AbstractResult {
    private Throwable exception;

    public Throwable getException() {
        return exception;
    }

    public void setException(Throwable exception) {
        this.exception = exception;
    }

    public static Builder builder() {return new Builder();}

    public static class Builder extends AbstractBuilder<ErrorResult, Builder> {

        public Builder exception(Throwable exception) {
            actualClass.setException(exception);
            return this;
        }

        @Override
        protected ErrorResult getActual() {
            return new ErrorResult();
        }

        @Override
        protected Builder getActualBuilder() {
            return this;
        }
    }
}
