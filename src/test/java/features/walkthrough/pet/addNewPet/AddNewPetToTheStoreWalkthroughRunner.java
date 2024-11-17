package features.walkthrough.pet.addNewPet;

import com.intuit.karate.junit5.Karate;

public class AddNewPetToTheStoreWalkthroughRunner {
    @Karate.Test
    Karate testAddNewPet(){
        return Karate.run("addNewPetToTheStoreWalkthrough").relativeTo(getClass());
    }
}
