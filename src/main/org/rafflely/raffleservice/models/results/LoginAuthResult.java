package org.rafflely.raffleservice.models.results;



public class LoginAuthResult extends AbstractResult {
    private String token;

    private void setToken(String token) {
        this.token = token;
    }

    public static Builder builder() { return new Builder();}

    public static class Builder extends AbstractBuilder<LoginAuthResult, Builder> {

        public Builder token(String token) {
            actualClass.setToken(token);
            return this;
        }

        @Override
        protected LoginAuthResult getActual() {
            return new LoginAuthResult();
        }

        @Override
        protected Builder getActualBuilder() {
            return this;
        }
    }
}
