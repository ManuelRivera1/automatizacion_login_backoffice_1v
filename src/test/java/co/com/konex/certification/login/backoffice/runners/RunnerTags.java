package co.com.konex.certification.login.backoffice.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/login_backoffice.feature",
        tags = "@Caso2",
        glue = "co.com.konex.certification.login.backoffice.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
