package features.walkthrough.pet.findByStatus;

import com.intuit.karate.junit5.Karate;

public class FindsPetsByStatusWalkthroughRunner {

    @Karate.Test
    Karate testFindsPetsByStatus(){
        return Karate.run("findsPetdByStatusWalkthrough").relativeTo(getClass());
    }

}
