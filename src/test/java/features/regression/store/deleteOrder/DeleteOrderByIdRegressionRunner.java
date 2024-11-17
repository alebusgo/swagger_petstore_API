package features.regression.store.deleteOrder;

import com.intuit.karate.junit5.Karate;

public class DeleteOrderByIdRegressionRunner {
    @Karate.Test
    Karate testFindOrderById(){
        return Karate.run("deleteOrderByIdRegression").relativeTo(getClass());
    }
}
