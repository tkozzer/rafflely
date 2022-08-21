package org.rafflely.raffleservice.activity.organizer;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.rafflely.raffleservice.dao.OrganizationDao;
import org.rafflely.raffleservice.dao.OrganizerDao;

import javax.inject.Inject;

public class DeleteOrganizerAccountActivity implements RequestHandler<String, String> {
    private final OrganizationDao organizationDao;
    private final OrganizerDao organizerDao;

    @Inject
    public DeleteOrganizerAccountActivity(OrganizationDao organizationDao, OrganizerDao organizerDao) {
        this.organizationDao = organizationDao;
        this.organizerDao = organizerDao;
    }

    @Override
    public String handleRequest(String input, Context context) {
        // TODO: Implement method
        return null;
    }
}
