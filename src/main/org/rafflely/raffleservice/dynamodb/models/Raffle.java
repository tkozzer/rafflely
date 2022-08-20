package org.rafflely.raffleservice.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConvertedEnum;
import org.rafflely.raffleservice.enums.RaffleClass;
import org.rafflely.raffleservice.enums.RaffleType;

import java.util.List;
import java.util.Objects;

@DynamoDBTable(tableName = "raffles")
public class Raffle {
    private String raffleId;
    private String eventId;
    private List<String> raffleItemIds;
    private String dateOfRaffle;
    private RaffleClass raffleClass;
    private RaffleType raffleType;
    private String timeOfDrawing;
    private String description;

    @DynamoDBHashKey(attributeName = "raffle_id")
    public String getRaffleId() {
        return raffleId;
    }

    public void setRaffleId(String raffleId) {
        this.raffleId = raffleId;
    }

    @DynamoDBAttribute(attributeName = "event_id")
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @DynamoDBAttribute(attributeName = "raffle_item_ids")
    public List<String> getRaffleItemIds() {
        return raffleItemIds;
    }

    public void setRaffleItemIds(List<String> raffleItemIds) {
        this.raffleItemIds = raffleItemIds;
    }

    @DynamoDBAttribute(attributeName = "date_of_raffle")
    public String getDateOfRaffle() {
        return dateOfRaffle;
    }

    public void setDateOfRaffle(String dateOfRaffle) {
        this.dateOfRaffle = dateOfRaffle;
    }

    @DynamoDBTypeConvertedEnum
    @DynamoDBAttribute(attributeName = "raffle_class")
    public RaffleClass getRaffleClass() {
        return raffleClass;
    }

    public void setRaffleClass(RaffleClass raffleClass) {
        this.raffleClass = raffleClass;
    }

    @DynamoDBTypeConvertedEnum
    @DynamoDBAttribute(attributeName = "raffle_type")
    public RaffleType getRaffleType() {
        return raffleType;
    }

    public void setRaffleType(RaffleType raffleType) {
        this.raffleType = raffleType;
    }

    @DynamoDBAttribute(attributeName = "time_of_drawing")
    public String getTimeOfDrawing() {
        return timeOfDrawing;
    }

    public void setTimeOfDrawing(String timeOfDrawing) {
        this.timeOfDrawing = timeOfDrawing;
    }

    @DynamoDBAttribute(attributeName = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Raffle raffle = (Raffle) o;
        return raffleId.equals(raffle.raffleId) && Objects.equals(eventId, raffle.eventId) &&
                Objects.equals(raffleItemIds, raffle.raffleItemIds) && Objects.equals(dateOfRaffle, raffle.dateOfRaffle)
                && raffleClass.equals(raffle.raffleClass) && Objects.equals(raffleType, raffle.raffleType) &&
                Objects.equals(timeOfDrawing, raffle.timeOfDrawing) && Objects.equals(description, raffle.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raffleId, eventId, raffleItemIds, dateOfRaffle, raffleClass, raffleType, timeOfDrawing, description);
    }

    @Override
    public String toString() {
        return "Raffle{" +
                "raffleId='" + raffleId + '\'' +
                ", eventId='" + eventId + '\'' +
                ", raffleItemIds=" + raffleItemIds +
                ", dateOfRaffle='" + dateOfRaffle + '\'' +
                ", raffleClass=" + raffleClass +
                ", raffleType=" + raffleType +
                ", timeOfDrawing='" + timeOfDrawing + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
