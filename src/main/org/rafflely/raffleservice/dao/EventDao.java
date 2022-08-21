package org.rafflely.raffleservice.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class EventDao {
    private DynamoDBMapper mapper;

    @Inject
    public EventDao(DynamoDBMapper mapper) {
        this.mapper = mapper;
    }
}
