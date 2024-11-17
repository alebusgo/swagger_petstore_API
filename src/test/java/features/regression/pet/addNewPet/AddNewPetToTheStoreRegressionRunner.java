package features.regression.pet.addNewPet;

import com.intuit.karate.junit5.Karate;

public class AddNewPetToTheStoreRegressionRunner {
    @Karate.Test
    Karate testAddNewPet(){
        return Karate.run("addNewPetToTheStoreRegression").relativeTo(getClass());
    }
}
