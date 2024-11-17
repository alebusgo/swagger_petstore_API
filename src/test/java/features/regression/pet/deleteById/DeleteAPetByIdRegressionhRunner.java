package features.regression.pet.deleteById;

import com.intuit.karate.junit5.Karate;

public class DeleteAPetByIdRegressionhRunner {
    @Karate.Test
    Karate testDeleteAPetById(){
        return Karate.run("deleteAPetByIdRegression").relativeTo(getClass());
    }
}
