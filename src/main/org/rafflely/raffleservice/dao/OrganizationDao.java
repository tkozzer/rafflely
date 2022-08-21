package org.rafflely.raffleservice.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class OrganizationDao {

    private DynamoDBMapper mapper;

    @Inject
    public OrganizationDao(DynamoDBMapper mapper) {
        this.mapper = mapper;
    }
}
