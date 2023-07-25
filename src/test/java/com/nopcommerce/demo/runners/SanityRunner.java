package com.nopcommerce.demo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",
        glue = "com/nopcommerce/demo",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"},
        tags = "@sanity"
)
public class SanityRunner {
}
