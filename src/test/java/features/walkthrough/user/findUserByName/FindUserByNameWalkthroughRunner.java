package features.walkthrough.user.findUserByName;

import com.intuit.karate.junit5.Karate;

public class FindUserByNameWalkthroughRunner {
    @Karate.Test
    Karate testFindUserByName(){
        return Karate.run("findUserByNameWalkthrough").relativeTo(getClass());
    }
}
