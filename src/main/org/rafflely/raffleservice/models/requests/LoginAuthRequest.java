package org.rafflely.raffleservice.models.requests;

import java.util.Objects;

public class LoginAuthRequest {
    private String email;
    private String password;

    public LoginAuthRequest() {
    }

    public LoginAuthRequest(Builder builder) {
        this.email = builder.email;
        this.password = builder.password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginAuthRequest that = (LoginAuthRequest) o;
        return email.equals(that.email) && password.equals(that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password);
    }

    @Override
    public String toString() {
        return "LoginAuthRequest{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static Builder builder() {return new Builder();}

    public static final class Builder {
        private String email;
        private String password;

        private Builder() {}

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        public LoginAuthRequest build() { return new LoginAuthRequest(this);}
    }
}
