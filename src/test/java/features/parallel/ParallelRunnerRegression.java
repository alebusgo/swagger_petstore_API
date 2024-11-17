package features.parallel;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParallelRunnerRegression {

    @Test
    void testParallelR() {
        Results results = Runner.path("classpath:features").tags("~@walkthrough").parallel(5);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

}