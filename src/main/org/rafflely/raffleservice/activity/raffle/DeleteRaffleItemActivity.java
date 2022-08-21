package org.rafflely.raffleservice.activity.raffle;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.rafflely.raffleservice.dao.RaffleDao;
import org.rafflely.raffleservice.dao.RaffleItemDao;

import javax.inject.Inject;

public class DeleteRaffleItemActivity implements RequestHandler<String, String> {
    private final RaffleDao raffleDao;
    private final RaffleItemDao raffleItemDao;

    @Inject
    public DeleteRaffleItemActivity(RaffleDao raffleDao, RaffleItemDao raffleItemDao) {
        this.raffleDao = raffleDao;
        this.raffleItemDao = raffleItemDao;
    }

    @Override
    public String handleRequest(String input, Context context) {
        // TODO: implement method
        return null;
    }
}
