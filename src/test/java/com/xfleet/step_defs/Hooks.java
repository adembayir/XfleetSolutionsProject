package com.xfleet.step_defs;

/*
In the class we will be able to pass pre & post - conditions to
each scenario and each step
 */

import com.xfleet.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

//    @Before
    public void setupScenario(){
        System.out.println("=====Setting up browser using cucumber @Before");
    }

//    @Before ("@login")
    public void setupScenarioForLogins(){
        System.out.println("=====Setting up browser using cucumber @Before");
    }

    @After
    public void tearDownScenario(Scenario scenario){

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();
    }

//    @BeforeStep
    public void setupStep() {
        System.out.println("-----------> applying step using @BeforeStep");
    }

//    @AfterStep
    public void afterStep() {
        System.out.println("-----------> applying tearDown using @AfterStep");
    }
}
