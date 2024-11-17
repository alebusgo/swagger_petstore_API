package features.regression.pet.updateExistingPet;

import com.intuit.karate.junit5.Karate;

public class UpdateAnExistingPetRegressionRunner {
    @Karate.Test
    Karate testAddNewPet(){
        return Karate.run("updateAnExistingPetRegression").relativeTo(getClass());
    }
}
