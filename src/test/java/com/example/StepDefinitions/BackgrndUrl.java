package com.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import resource.base;

public class BackgrndUrl extends base{
    WebDriver driver;
    public base bs=new base();
    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
        //throw new PendingException();
        /*base bs=new base();
        driver = bs.initializeDriver();*/

    }

    @And("^Navigate to \"([^\"]*)\" Site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
        //throw new PendingException();
        /*String url= bs.url;
        driver.get(url);*/
    }

}
