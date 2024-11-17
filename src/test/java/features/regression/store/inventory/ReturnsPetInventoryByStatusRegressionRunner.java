package features.regression.store.inventory;

import com.intuit.karate.junit5.Karate;

public class ReturnsPetInventoryByStatusRegressionRunner {

    @Karate.Test
    Karate testInventory(){
        return Karate.run("returnsPetInventoryByStatusRegression").relativeTo(getClass());
    }

}
