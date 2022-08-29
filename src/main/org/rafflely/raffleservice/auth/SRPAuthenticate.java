package org.rafflely.raffleservice.auth;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.nimbusds.srp6.SRP6ServerSession;
import org.rafflely.raffleservice.dao.UserDao;
import org.rafflely.raffleservice.dynamodb.models.User;
import org.rafflely.raffleservice.enums.StatusMessage;
import org.rafflely.raffleservice.exceptions.InvalidRequestException;
import org.rafflely.raffleservice.exceptions.UserNotFoundException;
import org.rafflely.raffleservice.models.requests.SRPRequest;
import org.rafflely.raffleservice.models.results.AbstractResult;
import org.rafflely.raffleservice.models.results.ErrorResult;
import org.rafflely.raffleservice.models.results.SRPResult;
import org.rafflely.raffleservice.models.util.Status;

import javax.inject.Inject;

import static org.rafflely.raffleservice.enums.SRPState.INIT;
import static org.rafflely.raffleservice.enums.SRPState.STEP_1;

public class SRPAuthenticate implements RequestHandler<SRPRequest, AbstractResult> {
    private UserDao userDao;

    @Inject
    public SRPAuthenticate(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * This method will handle all the of the activity assciated with authenticating a user through
     * the SRP protocol. Inside the request object will contain {@code String state} which will be used to determine
     * what part of the protocol is being executed.
     * @param request an object to the server
     * @param context
     * @return returns an {@code <? extends AbstractResult>} back.
     */
    @Override
    public AbstractResult handleRequest(SRPRequest request, Context context) {
        if (request.getState() == null) return error(null, null);

        if (request.getState().equals(INIT)) {
            User user = null;
            try {
                return stepOne(init(request, context), request, context);
            } catch (UserNotFoundException | InvalidRequestException e) {
                return error(new Status(StatusMessage.ERROR, "**Replace with Code**"), e);
            }
        } else {
            return stepTwo(request, context);
        }
    }

    private User init(final SRPRequest request, Context context) {
        if(request.getEmail() == null || request.getEmail().length() == 0) throw new InvalidRequestException();
        return userDao.getUserByEmail(request.getEmail(), request.getUserType());
    }

    private AbstractResult stepOne(User user, final SRPRequest request, Context context) {
        // create a SRP6 server session
//        SRP6ServerSession session = new SRP6ServerSession()

        try {


            return SRPResult.builder()
                    .withState(STEP_1)
                    .withSalt(user.getSalt())
                    .withPublicKeyB(null)
                    .build();
        } catch (UserNotFoundException e) {
            return error(null, null);
        }
    }

    private AbstractResult stepTwo(SRPRequest request, Context context) {

        return null;
    }

    private ErrorResult error(Status status, Throwable exception) {
        return ErrorResult.builder().status(status).exception(exception).build();
    }
}
