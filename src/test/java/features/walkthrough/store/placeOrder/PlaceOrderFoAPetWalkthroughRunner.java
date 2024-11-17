package features.walkthrough.store.placeOrder;

import com.intuit.karate.junit5.Karate;

public class PlaceOrderFoAPetWalkthroughRunner {
    @Karate.Test
    Karate testAddNewPet(){
        return Karate.run("placeOrderFoAPetWalkthrough").relativeTo(getClass());
    }
}
