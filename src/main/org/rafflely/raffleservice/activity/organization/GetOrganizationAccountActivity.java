package org.rafflely.raffleservice.activity.organization;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.rafflely.raffleservice.dao.EventDao;
import org.rafflely.raffleservice.dao.OrganizationDao;
import org.rafflely.raffleservice.dao.OrganizerDao;

import javax.inject.Inject;

public class GetOrganizationAccountActivity implements RequestHandler<String, String> {
    private final OrganizationDao organizationDao;
    private final OrganizerDao organizerDao;
    private final EventDao eventDao;

    @Inject
    public GetOrganizationAccountActivity(OrganizationDao organizationDao, OrganizerDao organizerDao, EventDao eventDao) {
        this.organizationDao = organizationDao;
        this.organizerDao = organizerDao;
        this.eventDao = eventDao;
    }

    @Override
    public String handleRequest(String input, Context context) {
        // TODO: Implement method
        return null;
    }
}
