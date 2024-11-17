package features.walkthrough.store.inventory;

import com.intuit.karate.junit5.Karate;

public class ReturnsPetInventoryByStatusWalkthroughRunner {

    @Karate.Test
    Karate testInventory(){
        return Karate.run("returnsPetInventoryByStatusWalkthrough").relativeTo(getClass());
    }

}
