package org.rafflely.raffleservice.activity.raffle;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.rafflely.raffleservice.dao.EventDao;
import org.rafflely.raffleservice.dao.RaffleDao;

import javax.inject.Inject;

public class CreateRaffleActivity implements RequestHandler<String, String> {
    private final RaffleDao raffleDao;
    private final EventDao eventDao;

    @Inject
    public CreateRaffleActivity(RaffleDao raffleDao, EventDao eventDao) {
        this.raffleDao = raffleDao;
        this.eventDao = eventDao;
    }

    @Override
    public String handleRequest(String input, Context context) {
        // TODO: Implement method
        return null;
    }
}
