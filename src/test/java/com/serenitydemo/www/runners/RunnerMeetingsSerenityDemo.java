package com.serenitydemo.www.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.serenitydemo.www.stepdefinitions",
        features = "src/test/resources/features/meetings_serenity_demo.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerMeetingsSerenityDemo {
}
