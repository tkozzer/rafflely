package org.rafflely.raffleservice.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class OrganizerDao {
    private DynamoDBMapper mapper;

    @Inject
    public OrganizerDao(DynamoDBMapper mapper) {
        this.mapper = mapper;
    }
}
