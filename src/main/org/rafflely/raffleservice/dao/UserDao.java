package org.rafflely.raffleservice.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import org.rafflely.raffleservice.dynamodb.models.Organizer;
import org.rafflely.raffleservice.dynamodb.models.Participant;
import org.rafflely.raffleservice.dynamodb.models.User;
import org.rafflely.raffleservice.enums.UserType;
import org.rafflely.raffleservice.exceptions.UserNotFoundException;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private DynamoDBMapper mapper;

    @Inject
    public UserDao(DynamoDBMapper mapper) {
        this.mapper = mapper;
    }

    public User getUserByEmail(String email, UserType typeOfUser) {

        User user = null;
        switch(typeOfUser) {
            case ORGANIZER:
                user = new Organizer();
                user.setEmail(email);
                break;
            case PARTICIPANT:
                user = new Participant();
                user.setEmail(email);
                break;
        }

        DynamoDBQueryExpression<User> queryExpression = new DynamoDBQueryExpression<User>()
                .withHashKeyValues(user)
                .withConsistentRead(false)
                .withIndexName(User.USER_BY_EMAIL_INDEX);

        List<User> list = new ArrayList<>(mapper.query(User.class, queryExpression));

        if (list.isEmpty()) throw new UserNotFoundException();

        return list.get(0);
    }
}
