package features.walkthrough.pet.updateExistingPet;

import com.intuit.karate.junit5.Karate;

public class UpdateAnExistingPetWalkthroughRunner {
    @Karate.Test
    Karate testAddNewPet(){
        return Karate.run("updateAnExistingPetWalkthrough").relativeTo(getClass());
    }
}
