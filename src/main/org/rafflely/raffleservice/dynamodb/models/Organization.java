package org.rafflely.raffleservice.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConvertedEnum;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTyped;
import org.rafflely.raffleservice.enums.OrganizationType;

import java.util.List;
import java.util.Objects;

@DynamoDBTable(tableName = "organizations")
public class Organization {
    private String organizationId;
    private String adminOrganizerId;
    private String nameOfOrg;
    private OrganizationType typeOfOrg;
    private String email;
    private String phoneNumber;
    private Address address;
    private String classALicenseNumber;
    private String classBLicenseNumber;
    private String hashedPassword;
    private String salt;
    private String dateAccountCreated;
    private String classADateObtained;
    private String classBDateObtained;
    private Boolean isEmailVerified;
    private Boolean isPhoneVerified;
    private Boolean isEmailSubscribed;
    private Boolean isPhoneSubscribed;
    private List<String> eventIds;
    private List<String> organizerIds;
    private String organizationPicURL;
    private Boolean isActive;

    @DynamoDBHashKey(attributeName = "organization_id")
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    @DynamoDBAttribute(attributeName = "admin_organizer_id")
    public String getAdminOrganizerId() {
        return adminOrganizerId;
    }

    public void setAdminOrganizerId(String adminOrganizerId) {
        this.adminOrganizerId = adminOrganizerId;
    }

    @DynamoDBAttribute(attributeName = "name_of_org")
    public String getNameOfOrg() {
        return nameOfOrg;
    }

    public void setNameOfOrg(String nameOfOrg) {
        this.nameOfOrg = nameOfOrg;
    }

    @DynamoDBTypeConvertedEnum
    @DynamoDBAttribute(attributeName = "type_of_org")
    public OrganizationType getTypeOfOrg() {
        return typeOfOrg;
    }

    public void setTypeOfOrg(OrganizationType typeOfOrg) {
        this.typeOfOrg = typeOfOrg;
    }

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

    @DynamoDBAttribute(attributeName = "address")
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @DynamoDBAttribute(attributeName = "class_a_license_number")
    public String getClassALicenseNumber() {
        return classALicenseNumber;
    }

    public void setClassALicenseNumber(String classALicenseNumber) {
        this.classALicenseNumber = classALicenseNumber;
    }

    @DynamoDBAttribute(attributeName = "class_b_license_number")
    public String getClassBLicenseNumber() {
        return classBLicenseNumber;
    }

    public void setClassBLicenseNumber(String classBLicenseNumber) {
        this.classBLicenseNumber = classBLicenseNumber;
    }

    @DynamoDBAttribute(attributeName = "hashed_password")
    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
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

    @DynamoDBAttribute(attributeName = "class_a_date_obtained")
    public String getClassADateObtained() {
        return classADateObtained;
    }

    public void setClassADateObtained(String classADateObtained) {
        this.classADateObtained = classADateObtained;
    }

    @DynamoDBAttribute(attributeName = "class_b_date_obtained")
    public String getClassBDateObtained() {
        return classBDateObtained;
    }

    public void setClassBDateObtained(String classBDateObtained) {
        this.classBDateObtained = classBDateObtained;
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

    @DynamoDBAttribute(attributeName = "event_ids")
    public List<String> getEventIds() {
        return eventIds;
    }

    public void setEventIds(List<String> eventIds) {
        this.eventIds = eventIds;
    }

    @DynamoDBAttribute(attributeName = "organizer_ids")
    public List<String> getOrganizerIds() {
        return organizerIds;
    }

    public void setOrganizerIds(List<String> organizerIds) {
        this.organizerIds = organizerIds;
    }

    @DynamoDBAttribute(attributeName = "organization_pic_url")
    public String getOrganizationPicURL() {
        return organizationPicURL;
    }

    public void setOrganizationPicURL(String organizationPicURL) {
        this.organizationPicURL = organizationPicURL;
    }

    @DynamoDBAttribute(attributeName = "is_active")
    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return organizationId.equals(that.organizationId) && nameOfOrg.equals(that.nameOfOrg) && email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationId, nameOfOrg, email);
    }

    @Override
    public String toString() {
        return "Organization{" +
                "organizationId='" + organizationId + '\'' +
                ", adminOrganizerId='" + adminOrganizerId + '\'' +
                ", nameOfOrg='" + nameOfOrg + '\'' +
                ", typeOfOrg=" + typeOfOrg +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", classALicenseNumber='" + classALicenseNumber + '\'' +
                ", classBLicenseNumber='" + classBLicenseNumber + '\'' +
                ", hashedPassword='" + hashedPassword + '\'' +
                ", salt='" + salt + '\'' +
                ", dateAccountCreated='" + dateAccountCreated + '\'' +
                ", classADateObtained='" + classADateObtained + '\'' +
                ", classBDateObtained='" + classBDateObtained + '\'' +
                ", isEmailVerified=" + isEmailVerified +
                ", isPhoneVerified=" + isPhoneVerified +
                ", isEmailSubscribed=" + isEmailSubscribed +
                ", isPhoneSubscribed=" + isPhoneSubscribed +
                ", eventIds=" + eventIds +
                ", organizerIds=" + organizerIds +
                ", organizationPicURL='" + organizationPicURL + '\'' +
                '}';
    }
}
