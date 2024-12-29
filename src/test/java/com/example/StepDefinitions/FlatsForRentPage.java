package com.example.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pageObjects.f_rentPage;
import resource.Utility;
import resource.base;


import java.util.concurrent.TimeUnit;

public class FlatsForRentPage extends base {
    base bs= new base();

    @Given("^User is able to select the preferred locations$")
    public void user_is_able_to_select_a_preferred_location() throws Throwable {
        //throw new PendingException();
        driver = bs.initializeDriver();
        String url= bs.url;
        driver.get(url);
        f_rentPage FRP = new f_rentPage(driver);
        Thread.sleep(4000);
        driver.manage().window().maximize();

        FRP.getDropDown().click();
        //driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/a")).click();
        Thread.sleep(4000);
        FRP.getlocation_from_dropdown().click();
        //   driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div/div[1]/ul[2]/li[7]/a")).click();
        Thread.sleep(4000);
    }

    @When("^User clicks on flat for rent option$")
    public void user_clicks_on_property_for_rent() throws Throwable {
        //throw new PendingException();
        f_rentPage FRP = new f_rentPage(driver);
        FRP.getrentMenu().click();
        // driver.findElement(By.xpath("//*[@id=\"rentheading\"]")).click();
        Thread.sleep(3000);
        FRP.getslider().click();



        // driver.findElement(By.xpath("//*[@id=\"rentDrop\"]/div[3]")).click();
        Thread.sleep(4000);
        FRP.getflatsForRentButton().click();
        //driver.findElement(By.xpath("/html/body/header/section[2]/div/ul/li[2]/div/div[1]/div/div[2]/div[1]/ul/li[1]/a/span")).click();
        //*[@id="body"]/div[4]/div/div/div[1]/div[3]/h1

    }

    @Then("^User should see the available flats for rent$")
    public void user_see_available_estates() throws Throwable {
        //throw new PendingException();

        String actUrl=bs.FlatsUrl;
        String curntUrl=driver.getCurrentUrl();
        Assert.assertEquals(curntUrl,actUrl);
        System.out.println("Flats available for rest are displayed to the user");
        Thread.sleep(4000);
        driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD));
        driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD));
        driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD));
        Utility.captureScreenshot(driver,"flatsForRentt");
        driver.close();



    }



}
