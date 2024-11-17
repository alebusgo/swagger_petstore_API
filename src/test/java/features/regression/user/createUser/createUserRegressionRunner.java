package features.regression.user.createUser;

import com.intuit.karate.junit5.Karate;

public class createUserRegressionRunner {
    @Karate.Test
    Karate testAddNewPet(){
        return Karate.run("createUserRegression").relativeTo(getClass());
    }
}
