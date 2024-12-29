package com.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import resource.Utility;
import resource.base;
import pageObjects.*;

public class locationSelection extends base {
    //WebDriver driver;
    public base bs=new base();
    @Given("^User is able to login to access Homepage$")
    public void user_is_able_to_login_to_access_homepage() throws Throwable {
        /*throw new PendingException();
        //BackgrndUrl bb=new BackgrndUrl();
        //driver = bb.driver;*/
        driver = bs.initializeDriver();
        String url= bs.url;

        driver.get(url);
        LocationSel ls = new LocationSel(driver);
        driver.manage().window().maximize();
        ls.gethead_Menu().click();
    }

    @When("^User is on the homePage$")
    public void user_is_on_home_page() throws Throwable {
        //throw new PendingException();
        String curntUrl=driver.getCurrentUrl();
        String actUrl=bs.url2;
        Assert.assertEquals(curntUrl,actUrl);
        System.out.println("User is on homepage");
        driver.close();

    }
    @Then("^User clicks on dropdown menu on locations$")
    public void user_clicks_on_dropdown_menu_on_location() throws Throwable {
        //throw new PendingException();
        driver = bs.initializeDriver();
        String url= bs.url;
        driver.get(url);
        Thread.sleep(3000);
        LocationSel ls = new LocationSel(driver);
        Thread.sleep(3000);
        driver.manage().window().maximize();
        ls.getDropDown().click();
       // driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/a")).click();


    }
    @And("^User selects a location$")
    public void User_selects_a_location() throws Throwable {
        //throw new PendingException();
        LocationSel ls = new LocationSel(driver);
        Thread.sleep(3000);
        ls.getlocation_from_dropdown().click();

       // driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div/div[1]/ul[2]/li[7]/a")).click();
        Utility.captureScreenshot(driver,"Location selection");
        driver.close();

    }




}
