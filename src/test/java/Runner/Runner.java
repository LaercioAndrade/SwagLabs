package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

	
@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/test/resources/features/",
			glue = "Steps",
			tags = {"@TesteCT01"},
			plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
			monochrome = true,
			snippets = CucumberOptions.SnippetType.CAMELCASE,
			dryRun = false,
			strict = false,
			stepNotifications = true
			)
	
public class Runner {	



}
