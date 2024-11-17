package features.walkthrough.pet.findById;

import com.intuit.karate.junit5.Karate;

public class FindPetByIdWalkthroughRunner {
    @Karate.Test
    Karate testFindPetById(){
        return Karate.run("findPetByIdWalkthrough").relativeTo(getClass());
    }
}
