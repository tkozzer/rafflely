package org.rafflely.raffleservice.activity.organization;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.rafflely.raffleservice.dao.OrganizationDao;
import org.rafflely.raffleservice.dao.OrganizerDao;

import javax.inject.Inject;

public class CreateOrganizationAccountActivity implements RequestHandler<String, String> {
    private final OrganizationDao organizationDao;
    private final OrganizerDao organizerDao;

    @Inject
    public CreateOrganizationAccountActivity(OrganizationDao organizationDao, OrganizerDao organizerDao) {
        this.organizationDao = organizationDao;
        this.organizerDao = organizerDao;
    }

    @Override
    public String handleRequest(String input, Context context) {
        // TODO: Implements method
        return null;
    }
}
