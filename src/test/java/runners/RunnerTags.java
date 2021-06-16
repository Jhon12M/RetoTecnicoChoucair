package user.creation.utest.com.reto.tecnico.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/userCreationUtest.feature",
            tags = "@scenario1",
            glue = "user.creation.utest.com.reto.tecnico.stepdefinitions",
            snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
