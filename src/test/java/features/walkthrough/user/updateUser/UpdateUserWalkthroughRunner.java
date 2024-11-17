package features.walkthrough.user.updateUser;

import com.intuit.karate.junit5.Karate;

public class UpdateUserWalkthroughRunner {
    @Karate.Test
    Karate testFindUserByName(){
        return Karate.run("updateUserWalkthrough").relativeTo(getClass());
    }
}
