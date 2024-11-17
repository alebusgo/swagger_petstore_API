package features.walkthrough.user.loginUser;

import com.intuit.karate.junit5.Karate;

public class LoginUserWalkthroughRunner {
    @Karate.Test
    Karate testLoginUser(){
        return Karate.run("logoutUserRegression.feature").relativeTo(getClass());
    }
}
