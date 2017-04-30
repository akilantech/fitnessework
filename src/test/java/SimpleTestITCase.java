
import fitnesse.junit.FitNesseRunner;
import org.junit.runner.RunWith;


@RunWith(FitNesseRunner.class)
@FitNesseRunner.Suite("FitNesse.SimpleSuitePass")
@FitNesseRunner.FitnesseDir("src/test/resources")
@FitNesseRunner.OutputDir("target/failsafe-reports")
public class SimpleTestITCase {
}

