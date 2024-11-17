package features.walkthrough.pet.deleteById;

import com.intuit.karate.junit5.Karate;

public class DeleteAPetByIdWalkthroughRunner {
    @Karate.Test
    Karate testDeleteAPetById(){
        return Karate.run("deleteAPetByIdWalkthrough").relativeTo(getClass());
    }
}
