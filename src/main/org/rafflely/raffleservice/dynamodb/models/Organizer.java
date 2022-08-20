package org.rafflely.raffleservice.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTyped;

import java.util.Objects;

@DynamoDBTyped(DynamoDBAttributeType.BOOL)

@DynamoDBTable(tableName = "organizers")
public class Organizer extends User {
    private Boolean isAdmin;

    @DynamoDBTyped(DynamoDBAttributeType.BOOL)
    @DynamoDBAttribute(attributeName = "is_admin")
    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "Organizer{" +
                super.toString() +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
