package features.regression.user.findUserByName;

import com.intuit.karate.junit5.Karate;

public class findUserByNameRegressionRunner {
    @Karate.Test
    Karate testFindUserByName(){
        return Karate.run("findUserByNameRegression").relativeTo(getClass());
    }
}
