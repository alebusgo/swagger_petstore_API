package features.walkthrough.store.deleteOrder;

import com.intuit.karate.junit5.Karate;

public class DeleteOrderByIdWalkthroughRunner {
    @Karate.Test
    Karate testFindOrderById(){
        return Karate.run("deleteOrderByIdWalkthrough").relativeTo(getClass());
    }
}
