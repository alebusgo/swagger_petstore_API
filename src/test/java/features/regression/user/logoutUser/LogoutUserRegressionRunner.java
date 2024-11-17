package features.regression.user.logoutUser;

import com.intuit.karate.junit5.Karate;

public class LogoutUserRegressionRunner {
    @Karate.Test
    Karate testUpdateUser(){
        return Karate.run("logoutUserRegression").relativeTo(getClass());
    }
}
