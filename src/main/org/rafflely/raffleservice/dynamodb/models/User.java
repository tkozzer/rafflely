package org.rafflely.raffleservice.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;


import java.util.List;
import java.util.Objects;

@DynamoDBDocument
public abstract class User {
    public static final String USER_BY_EMAIL_INDEX = "UserByEmailIndex";
    private String userId;
    private List<String> organizationIds;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String email;
    private String phoneNumber;
    private String verifier;
    private String salt;
    private String dateAccountCreated;
    private Boolean isEmailVerified;
    private Boolean isPhoneVerified;
    private Boolean isEmailSubscribed;
    private Boolean isPhoneSubscribed;
    private String profilePicURL;
    private Boolean isActive;
    private String privateKeyB;
    private String token;

    @DynamoDBHashKey(attributeName = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @DynamoDBAttribute(attributeName = "organization_ids")
    public List<String> getOrganizationIds() {
        return organizationIds;
    }

    public void setOrganizationIds(List<String> organizationIds) {
        this.organizationIds = organizationIds;
    }

    @DynamoDBAttribute(attributeName = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @DynamoDBAttribute(attributeName = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @DynamoDBAttribute(attributeName = "birth_date")
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @DynamoDBIndexHashKey(attributeName = "email", globalSecondaryIndexName = USER_BY_EMAIL_INDEX)
    @DynamoDBAttribute(attributeName = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @DynamoDBAttribute(attributeName = "phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @DynamoDBAttribute(attributeName = "verifier")
    public String getVerifier() {
        return verifier;
    }

    public void setVerifier(String verifier) {
        this.verifier = verifier;
    }

    @DynamoDBAttribute(attributeName = "salt")
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @DynamoDBAttribute(attributeName = "date_account_created")
    public String getDateAccountCreated() {
        return dateAccountCreated;
    }

    public void setDateAccountCreated(String dateAccountCreated) {
        this.dateAccountCreated = dateAccountCreated;
    }

    @DynamoDBTyped(DynamoDBAttributeType.BOOL)
    @DynamoDBAttribute(attributeName = "is_email_verified")
    public Boolean getEmailVerified() {
        return isEmailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        isEmailVerified = emailVerified;
    }

    @DynamoDBTyped(DynamoDBAttributeType.BOOL)
    @DynamoDBAttribute(attributeName = "is_phone_verified")
    public Boolean getPhoneVerified() {
        return isPhoneVerified;
    }

    public void setPhoneVerified(Boolean phoneVerified) {
        isPhoneVerified = phoneVerified;
    }

    @DynamoDBTyped(DynamoDBAttributeType.BOOL)
    @DynamoDBAttribute(attributeName = "is_email_subscribed")
    public Boolean getEmailSubscribed() {
        return isEmailSubscribed;
    }

    public void setEmailSubscribed(Boolean emailSubscribed) {
        isEmailSubscribed = emailSubscribed;
    }

    @DynamoDBTyped(DynamoDBAttributeType.BOOL)
    @DynamoDBAttribute(attributeName = "is_phone_subscribed")
    public Boolean getPhoneSubscribed() {
        return isPhoneSubscribed;
    }

    public void setPhoneSubscribed(Boolean phoneSubscribed) {
        isPhoneSubscribed = phoneSubscribed;
    }

    @DynamoDBAttribute(attributeName = "profile_pic_url")
    public String getProfilePicURL() {
        return profilePicURL;
    }

    public void setProfilePicURL(String profilePicURL) {
        this.profilePicURL = profilePicURL;
    }

    @DynamoDBAttribute(attributeName = "is_active")
    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @DynamoDBAttribute(attributeName = "public_key_b")
    public String getPrivateKeyB() {
        return privateKeyB;
    }

    public void setPrivateKeyB(String privateKeyB) {
        this.privateKeyB = privateKeyB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId.equals(user.userId) && firstName.equals(user.firstName) && lastName.equals(user.lastName) && Objects.equals(birthDate, user.birthDate) && email.equals(user.email) && phoneNumber.equals(user.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, firstName, lastName, birthDate, email, phoneNumber);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", organizationIds=" + organizationIds +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", verifier='" + verifier + '\'' +
                ", salt='" + salt + '\'' +
                ", dateAccountCreated='" + dateAccountCreated + '\'' +
                ", isEmailVerified=" + isEmailVerified +
                ", isPhoneVerified=" + isPhoneVerified +
                ", isEmailSubscribed=" + isEmailSubscribed +
                ", isPhoneSubscribed=" + isPhoneSubscribed +
                ", profilePicURL='" + profilePicURL + '\'' +
                ", isActive=" + isActive +
                ", token='" + token + '\'' +
                '}';
    }
}
