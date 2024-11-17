package features.regression.pet.findById;

import com.intuit.karate.junit5.Karate;

public class FindPetByIdRegressionRunner {
    @Karate.Test
    Karate testFindPetById(){
        return Karate.run("findPetByIdRegression").relativeTo(getClass());
    }
}
