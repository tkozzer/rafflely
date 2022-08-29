package org.rafflely.raffleservice.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.List;

@DynamoDBTable(tableName = "users")
public class Participant extends User {
    private List<RaffleTicket> raffleParticipation;

    @DynamoDBAttribute(attributeName = "raffle_participation")
    public List<RaffleTicket> getRaffleParticipation() {
        return raffleParticipation;
    }

    public void setRaffleParticipation(List<RaffleTicket> raffleParticipation) {
        this.raffleParticipation = raffleParticipation;
    }

    @Override
    public String toString() {
        return "Participant{" +
                super.toString() +
                ", raffleParticipation=" + raffleParticipation +
                '}';
    }
}
