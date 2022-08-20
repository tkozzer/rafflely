package org.rafflely.raffleservice.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

import java.util.Objects;

@DynamoDBDocument
public class RaffleTicket {
    private String raffleTicketNumber;
    private String userId;
    private String raffleId;

    @DynamoDBAttribute(attributeName = "raffle_ticket_number")
    public String getRaffleTicketNumber() {
        return raffleTicketNumber;
    }

    public void setRaffleTicketNumber(String raffleTicketNumber) {
        this.raffleTicketNumber = raffleTicketNumber;
    }

    @DynamoDBAttribute(attributeName = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @DynamoDBAttribute(attributeName = "raffle_id")
    public String getRaffleId() {
        return raffleId;
    }

    public void setRaffleId(String raffleId) {
        this.raffleId = raffleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RaffleTicket that = (RaffleTicket) o;
        return raffleTicketNumber.equals(that.raffleTicketNumber) && userId.equals(that.userId) && raffleId.equals(that.raffleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raffleTicketNumber, userId, raffleId);
    }

    @Override
    public String toString() {
        return "RaffleTicket{" +
                "raffleTicketNumber='" + raffleTicketNumber + '\'' +
                ", userId='" + userId + '\'' +
                ", raffleId='" + raffleId + '\'' +
                '}';
    }
}
