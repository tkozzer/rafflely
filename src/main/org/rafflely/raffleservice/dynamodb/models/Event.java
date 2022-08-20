package org.rafflely.raffleservice.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.List;
import java.util.Objects;

@DynamoDBTable(tableName = "events")
public class Event {
    private String eventId;
    private String organizationId;
    private List<String> raffleIds;
    private String nameOfEvent;
    private Address eventAddress;
    private String description;
    private String dateOfEvent;
    private String startOfEvent;
    private String endOfEvent;

    @DynamoDBHashKey(attributeName = "event_id")
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @DynamoDBAttribute(attributeName = "organization_id")
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    @DynamoDBAttribute(attributeName = "raffle_ids")
    public List<String> getRaffleIds() {
        return raffleIds;
    }

    public void setRaffleIds(List<String> raffleIds) {
        this.raffleIds = raffleIds;
    }

    @DynamoDBAttribute(attributeName = "name_of_event")
    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    @DynamoDBAttribute(attributeName = "event_address")
    public Address getEventAddress() {
        return eventAddress;
    }

    public void setEventAddress(Address eventAddress) {
        this.eventAddress = eventAddress;
    }

    @DynamoDBAttribute(attributeName = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @DynamoDBAttribute(attributeName = "date_of_event")
    public String getDateOfEvent() {
        return dateOfEvent;
    }

    public void setDateOfEvent(String dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }

    @DynamoDBAttribute(attributeName = "start_of_event")
    public String getStartOfEvent() {
        return startOfEvent;
    }

    public void setStartOfEvent(String startOfEvent) {
        this.startOfEvent = startOfEvent;
    }

    @DynamoDBAttribute(attributeName = "end_of_event")
    public String getEndOfEvent() {
        return endOfEvent;
    }

    public void setEndOfEvent(String endOfEvent) {
        this.endOfEvent = endOfEvent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return eventId.equals(event.eventId) && organizationId.equals(event.organizationId) && Objects.equals(raffleIds, event.raffleIds) && Objects.equals(nameOfEvent, event.nameOfEvent) && Objects.equals(eventAddress, event.eventAddress) && Objects.equals(description, event.description) && Objects.equals(dateOfEvent, event.dateOfEvent) && Objects.equals(startOfEvent, event.startOfEvent) && Objects.equals(endOfEvent, event.endOfEvent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, organizationId, raffleIds, nameOfEvent, eventAddress, description, dateOfEvent, startOfEvent, endOfEvent);
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId='" + eventId + '\'' +
                ", organizationId='" + organizationId + '\'' +
                ", raffleIds=" + raffleIds +
                ", nameOfEvent='" + nameOfEvent + '\'' +
                ", eventAddress=" + eventAddress +
                ", description='" + description + '\'' +
                ", dateOfEvent='" + dateOfEvent + '\'' +
                ", startOfEvent='" + startOfEvent + '\'' +
                ", endOfEvent='" + endOfEvent + '\'' +
                '}';
    }
}
