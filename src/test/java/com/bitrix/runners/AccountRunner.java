package com.bitrix.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/bitrix/step_definitions",
        dryRun = false,
        tags = "@AccountSummary"

)


@RunWith(Cucumber.class)
public class AccountRunner {

}
