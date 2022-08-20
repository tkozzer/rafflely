package org.rafflely.raffleservice.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.List;
import java.util.Objects;

@DynamoDBTable(tableName = "raffle_items")
public class RaffleItem {
    private String raffleItemId;
    private String raffleId;
    private String nameOfItem;
    private String description;
    private List<String> listOfContents;
    private Double estimatedValue;
    private String winnerUserId;
    private String imageURL;

    @DynamoDBHashKey(attributeName = "raffle_item_id")
    public String getRaffleItemId() {
        return raffleItemId;
    }

    public void setRaffleItemId(String raffleItemId) {
        this.raffleItemId = raffleItemId;
    }

    @DynamoDBAttribute(attributeName = "raffle_id")
    public String getRaffleId() {
        return raffleId;
    }

    public void setRaffleId(String raffleId) {
        this.raffleId = raffleId;
    }

    @DynamoDBAttribute(attributeName = "name_of_item")
    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    @DynamoDBAttribute(attributeName = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @DynamoDBAttribute(attributeName = "list_of_contents")
    public List<String> getListOfContents() {
        return listOfContents;
    }

    public void setListOfContents(List<String> listOfContents) {
        this.listOfContents = listOfContents;
    }

    @DynamoDBAttribute(attributeName = "estimated_value")
    public Double getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(Double estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    @DynamoDBAttribute(attributeName = "winner_user_id")
    public String getWinnerUserId() {
        return winnerUserId;
    }

    public void setWinnerUserId(String winnerUserId) {
        this.winnerUserId = winnerUserId;
    }

    @DynamoDBAttribute(attributeName = "image_url")
    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RaffleItem that = (RaffleItem) o;
        return raffleItemId.equals(that.raffleItemId) && raffleId.equals(that.raffleId) && Objects.equals(nameOfItem, that.nameOfItem) && Objects.equals(description, that.description) && Objects.equals(listOfContents, that.listOfContents) && Objects.equals(estimatedValue, that.estimatedValue) && Objects.equals(winnerUserId, that.winnerUserId) && Objects.equals(imageURL, that.imageURL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raffleItemId, raffleId, nameOfItem, description, listOfContents, estimatedValue, winnerUserId, imageURL);
    }

    @Override
    public String toString() {
        return "RaffleItem{" +
                "raffleItemId='" + raffleItemId + '\'' +
                ", raffleId='" + raffleId + '\'' +
                ", nameOfItem='" + nameOfItem + '\'' +
                ", description='" + description + '\'' +
                ", listOfContents=" + listOfContents +
                ", estimatedValue=" + estimatedValue +
                ", winnerUserId='" + winnerUserId + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
