package features.walkthrough.user.logoutUser;

import com.intuit.karate.junit5.Karate;

public class LogoutUserWalkthroughRunner {
    @Karate.Test
    Karate testUpdateUser(){
        return Karate.run("logoutUserRegression.feature").relativeTo(getClass());
    }
}
