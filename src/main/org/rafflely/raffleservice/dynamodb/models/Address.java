package org.rafflely.raffleservice.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

import java.util.Objects;

@DynamoDBDocument
public class Address {
    private String line1;
    private String line2;
    private String aptNumber;
    private String city;
    private String state;
    private String zipcode;

    @DynamoDBAttribute(attributeName = "line_1")
    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    @DynamoDBAttribute(attributeName = "line_2")
    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    @DynamoDBAttribute(attributeName = "apt_number")
    public String getAptNumber() {
        return aptNumber;
    }

    public void setAptNumber(String aptNumber) {
        this.aptNumber = aptNumber;
    }

    @DynamoDBAttribute(attributeName = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @DynamoDBAttribute(attributeName = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @DynamoDBAttribute(attributeName = "zipcode")
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return line1.equals(address.line1) && line2.equals(address.line2) && Objects.equals(aptNumber, address.aptNumber) && city.equals(address.city) && state.equals(address.state) && zipcode.equals(address.zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(line1, line2, aptNumber, city, state, zipcode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", aptNumber='" + aptNumber + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
