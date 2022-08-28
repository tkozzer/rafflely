package org.rafflely.raffleservice.auth;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.rafflely.raffleservice.dao.OrganizerDao;
import org.rafflely.raffleservice.dao.ParticipantDao;
import org.rafflely.raffleservice.models.requests.LoginAuthRequest;
import org.rafflely.raffleservice.models.results.AbstractResult;
import org.rafflely.raffleservice.models.results.ErrorResult;
import org.rafflely.raffleservice.models.results.LoginAuthResult;

import javax.inject.Inject;

public class LoginOrganizerAuth implements RequestHandler<LoginAuthRequest, AbstractResult> {
    private OrganizerDao organizerDao;

    @Inject
    public LoginOrganizerAuth(OrganizerDao organizerDao) {
        this.organizerDao = organizerDao;
    }

    @Override
    public AbstractResult handleRequest(LoginAuthRequest input, Context context) {
        // TODO this is the beginning of authenticated a user. A user will try to log in with an email and password
        // Either an LoginAuthResult will be returned or if their is an error an ErrorResult will be thrown.



        input.getEmail();
        input.getPassword();


        if (false) {
            return ErrorResult.builder().status(null).exception(null).build();
        }



        return LoginAuthResult.builder()
                .token(null)
                .status(null)
                .build();
    }
}
