package features.walkthrough.store.findOrder;

import com.intuit.karate.junit5.Karate;

public class FindOrderByIdWalkthroughRunner {
    @Karate.Test
    Karate testFindOrderById(){
        return Karate.run("findOrderByIdWalkthrough").relativeTo(getClass());
    }
}
