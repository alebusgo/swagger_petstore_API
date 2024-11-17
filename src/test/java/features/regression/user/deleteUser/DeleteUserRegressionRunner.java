package features.regression.user.deleteUser;

import com.intuit.karate.junit5.Karate;

public class DeleteUserRegressionRunner {
    @Karate.Test
    Karate testFindOrderById(){
        return Karate.run("deleteUserRegression").relativeTo(getClass());
    }
}
