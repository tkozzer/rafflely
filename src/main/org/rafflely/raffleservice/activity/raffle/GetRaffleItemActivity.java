package org.rafflely.raffleservice.activity.raffle;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.rafflely.raffleservice.dao.RaffleDao;
import org.rafflely.raffleservice.dao.RaffleItemDao;

import javax.inject.Inject;

public class GetRaffleItemActivity implements RequestHandler<String, String> {
    private final RaffleItemDao raffleItemDao;
    private final RaffleDao raffleDao;

    @Inject
    public GetRaffleItemActivity(RaffleItemDao raffleItemDao, RaffleDao raffleDao) {
        this.raffleItemDao = raffleItemDao;
        this.raffleDao = raffleDao;
    }

    @Override
    public String handleRequest(String input, Context context) {
        // TODO: Implement method
        return null;
    }
}
