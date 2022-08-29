package org.rafflely.raffleservice.models.results;

import org.rafflely.raffleservice.enums.SRPState;

public class SRPResult extends AbstractResult {
    private SRPState state;
    private String salt;
    private String publicKeyB;

    private void setState(SRPState state) {
        this.state = state;
    }

    private void setSalt(String salt) {
        this.salt = salt;
    }

    private void setPublicKeyB(String publicKeyB) {
        this.publicKeyB = publicKeyB;
    }

    public static Builder builder() {return new Builder();}

    public static class Builder extends AbstractBuilder<SRPResult, Builder> {

        public Builder withState(SRPState state) {
            actualClass.setState(state);
            return this;
        }

        public Builder withSalt(String salt) {
            actualClass.setSalt(salt);
            return this;
        }

        public Builder withPublicKeyB(String publicKeyB) {
            actualClass.setPublicKeyB(publicKeyB);
            return this;
        }

        @Override
        protected SRPResult getActual() {
            return new SRPResult();
        }

        @Override
        protected Builder getActualBuilder() {
            return this;
        }
    }
}
