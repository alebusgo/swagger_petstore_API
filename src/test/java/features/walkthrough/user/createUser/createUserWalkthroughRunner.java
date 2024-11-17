package features.walkthrough.user.createUser;

import com.intuit.karate.junit5.Karate;

public class createUserWalkthroughRunner {
    @Karate.Test
    Karate testAddNewPet(){
        return Karate.run("createUserWalkthrough").relativeTo(getClass());
    }
}
