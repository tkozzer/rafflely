package org.rafflely.raffleservice.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class RaffleDao {
    private DynamoDBMapper mapper;

    @Inject
    public RaffleDao(DynamoDBMapper mapper) {
        this.mapper = mapper;
    }
}
