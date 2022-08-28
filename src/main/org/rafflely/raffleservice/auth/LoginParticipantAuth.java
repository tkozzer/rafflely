package org.rafflely.raffleservice.auth;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.rafflely.raffleservice.dao.ParticipantDao;
import org.rafflely.raffleservice.models.requests.LoginAuthRequest;
import org.rafflely.raffleservice.models.results.AbstractResult;

import javax.inject.Inject;

public class LoginParticipantAuth implements RequestHandler<LoginAuthRequest, AbstractResult> {
    private ParticipantDao participantDao;

    @Inject
    public LoginParticipantAuth(ParticipantDao participantDao) {
        this.participantDao = participantDao;
    }

    @Override
    public AbstractResult handleRequest(LoginAuthRequest input, Context context) {
        return null;
    }
}
