package cFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/cucumber_html_report.html" , "pretty"},
                 tags="@Smoke")
public class TestRunner {

}
