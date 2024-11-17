package features.regression.user.loginUser;

import com.intuit.karate.junit5.Karate;

public class LoginUserRegressionRunner {
    @Karate.Test
    Karate testLoginUser(){
        return Karate.run("loginUserRegression").relativeTo(getClass());
    }
}
