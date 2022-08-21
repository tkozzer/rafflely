package org.rafflely.raffleservice.activity.participant;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.rafflely.raffleservice.dao.OrganizationDao;
import org.rafflely.raffleservice.dao.ParticipantDao;

import javax.inject.Inject;

public class UpdateParticipantAccountActivity implements RequestHandler<String, String> {
    private final ParticipantDao participantDao;
    private final OrganizationDao organizationDao;

    @Inject
    public UpdateParticipantAccountActivity(ParticipantDao participantDao, OrganizationDao organizationDao) {
        this.participantDao = participantDao;
        this.organizationDao = organizationDao;
    }

    @Override
    public String handleRequest(String input, Context context) {
        // TODO: Implement method
        return null;
    }
}
