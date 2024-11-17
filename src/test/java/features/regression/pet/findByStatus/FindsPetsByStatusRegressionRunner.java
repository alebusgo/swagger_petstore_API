package features.regression.pet.findByStatus;

import com.intuit.karate.junit5.Karate;

public class FindsPetsByStatusRegressionRunner {

    @Karate.Test
    Karate testFindsPetsByStatus(){
        return Karate.run("findsPetdByStatusRegression").relativeTo(getClass());
    }

}
