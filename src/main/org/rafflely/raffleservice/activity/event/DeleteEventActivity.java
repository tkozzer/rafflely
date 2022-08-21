package org.rafflely.raffleservice.activity.event;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.rafflely.raffleservice.dao.EventDao;
import org.rafflely.raffleservice.dao.OrganizationDao;
import org.rafflely.raffleservice.dao.RaffleDao;

import javax.inject.Inject;

public class DeleteEventActivity implements RequestHandler<String, String> {
    private final EventDao eventDao;
    private final OrganizationDao organizationDao;
    private final RaffleDao raffleDao;

    @Inject
    public DeleteEventActivity(EventDao eventDao, OrganizationDao organizationDao, RaffleDao raffleDao) {
        this.eventDao = eventDao;
        this.organizationDao = organizationDao;
        this.raffleDao = raffleDao;
    }

    @Override
    public String handleRequest(String input, Context context) {
        // TODO: implement method
        return null;
    }
}
