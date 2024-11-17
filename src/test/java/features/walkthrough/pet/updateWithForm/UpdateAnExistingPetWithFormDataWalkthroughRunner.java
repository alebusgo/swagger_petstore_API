package features.walkthrough.pet.updateWithForm;

import com.intuit.karate.junit5.Karate;

public class UpdateAnExistingPetWithFormDataWalkthroughRunner {
    @Karate.Test
    Karate testUpdateAnExistingPetWithFormData(){
        return Karate.run("updateAnExistingPetWithFormDataWalkthrough").relativeTo(getClass());
    }
}
