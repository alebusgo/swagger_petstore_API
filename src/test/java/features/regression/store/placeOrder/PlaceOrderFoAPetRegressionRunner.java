package features.regression.store.placeOrder;

import com.intuit.karate.junit5.Karate;

public class PlaceOrderFoAPetRegressionRunner {
    @Karate.Test
    Karate testAddNewPet(){
        return Karate.run("placeOrderFoAPetRegression").relativeTo(getClass());
    }
}
