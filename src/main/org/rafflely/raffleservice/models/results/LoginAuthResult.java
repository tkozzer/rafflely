package org.rafflely.raffleservice.models.results;

import com.auth0.jwt.JWT;

public class LoginAuthResult  extends AbstractResult {
    private JWT token;

    private void setToken(JWT token) {
        this.token = token;
    }

    public static Builder builder() { return new Builder();}

    public static class Builder extends AbstractBuilder<LoginAuthResult, Builder> {

        public Builder token(JWT token) {
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
