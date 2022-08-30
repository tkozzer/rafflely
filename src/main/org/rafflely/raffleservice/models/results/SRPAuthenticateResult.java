package org.rafflely.raffleservice.models.results;

import org.rafflely.raffleservice.enums.SRPState;

import java.math.BigInteger;

public class SRPAuthenticateResult extends AbstractResult {
    private SRPState state;
    private String salt;
    private BigInteger publicKeyB;

    private void setState(SRPState state) {
        this.state = state;
    }

    private void setSalt(String salt) {
        this.salt = salt;
    }

    private void setPublicKeyB(BigInteger publicKeyB) {
        this.publicKeyB = publicKeyB;
    }

    public static Builder builder() {return new Builder();}

    public static class Builder extends AbstractBuilder<SRPAuthenticateResult, Builder> {

        public Builder withState(SRPState state) {
            actualClass.setState(state);
            return this;
        }

        public Builder withSalt(String salt) {
            actualClass.setSalt(salt);
            return this;
        }

        public Builder withPublicKeyB(BigInteger publicKeyB) {
            actualClass.setPublicKeyB(publicKeyB);
            return this;
        }

        @Override
        protected SRPAuthenticateResult getActual() {
            return new SRPAuthenticateResult();
        }

        @Override
        protected Builder getActualBuilder() {
            return this;
        }
    }
}
