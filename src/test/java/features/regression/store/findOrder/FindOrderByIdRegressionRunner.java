package features.regression.store.findOrder;

import com.intuit.karate.junit5.Karate;

public class FindOrderByIdRegressionRunner {
    @Karate.Test
    Karate testFindOrderById(){
        return Karate.run("findOrderByIdRegression").relativeTo(getClass());
    }
}
