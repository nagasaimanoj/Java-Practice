package runner;

@org.junit.runner.RunWith(cucumber.api.junit.Cucumber.class)
@cucumber.api.CucumberOptions(features = "..\\bdd\\src\\test\\java\\Features", glue = "definitions", dryRun = false, strict = true, tags = {
        "@calc1" }, plugin = { "pretty", "html:target/html", "json:target/cucumber.json" })
public class RunCukesTest {

}