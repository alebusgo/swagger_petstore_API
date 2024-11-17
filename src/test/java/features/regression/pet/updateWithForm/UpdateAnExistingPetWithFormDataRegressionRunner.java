package features.regression.pet.updateWithForm;

import com.intuit.karate.junit5.Karate;

public class UpdateAnExistingPetWithFormDataRegressionRunner {
    @Karate.Test
    Karate testUpdateAnExistingPetWithFormData(){
        return Karate.run("updateAnExistingPetWithFormDataRegression").relativeTo(getClass());
    }
}
