package features.walkthrough.user.deleteUser;

import com.intuit.karate.junit5.Karate;

public class DeleteUserWalkthroughRunner {
    @Karate.Test
    Karate testFindOrderById(){
        return Karate.run("deleteUserWalkthrough").relativeTo(getClass());
    }
}
