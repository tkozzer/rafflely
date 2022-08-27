package org.rafflely.raffleservice.models.results;

import org.rafflely.raffleservice.models.util.Status;

public abstract class AbstractResult {
    private Status status;

    protected void setStatus(Status status) {
        this.status = status;
    }

    protected static abstract class AbstractBuilder<T extends AbstractResult, B extends AbstractBuilder> {
        protected T actualClass;
        protected B actualClassBuilder;

        protected abstract T getActual();
        protected abstract B getActualBuilder();

        protected AbstractBuilder() {
            actualClass = getActual();
            actualClassBuilder = getActualBuilder();
        }
        public B status(Status status) {
            actualClass.setStatus(status);
            return actualClassBuilder;
        }
        public T build() {
            return actualClass;
        }


    }

}
