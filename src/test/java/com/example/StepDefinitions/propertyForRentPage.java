package com.example.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import resource.Utility;
import resource.base;
import pageObjects.rentPage;

import java.util.concurrent.TimeUnit;

public class propertyForRentPage extends base {
base bs= new base();
    rentPage rp = new rentPage(driver);
    @Given("^User is able to select a preferred location$")
    public void user_is_able_to_select_a_preferred_location() throws Throwable {
        //throw new PendingException();
        driver = bs.initializeDriver();
        String url= bs.url;
        driver.get(url);
        rentPage rp = new rentPage(driver);
        Thread.sleep(6000);
        driver.manage().window().maximize();
        Thread.sleep(6000);
        rp.getDropDown().click();
        //driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/a")).click();
        Thread.sleep(4000);
        rp.getlocation_from_dropdown().click();
     //   driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div/div[1]/ul[2]/li[7]/a")).click();
    Thread.sleep(4000);
    }

    @When("^User clicks on property for rent$")
    public void user_clicks_on_property_for_rent() throws Throwable {
        //throw new PendingException();
        rentPage rp = new rentPage(driver);
       rp.getrentMenu().click();
      // driver.findElement(By.xpath("//*[@id=\"rentheading\"]")).click();
        Thread.sleep(3000);
       rp.getslider().click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(4000);

       // driver.findElement(By.xpath("//*[@id=\"rentDrop\"]/div[3]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(4000);
        rp.getpropertyForRentMenu().click();
        //driver.findElement(By.xpath("/html/body/header/section[2]/div/ul/li[2]/div/div[1]/div/div[2]/div[1]/ul/li[1]/a/span")).click();
        //*[@id="body"]/div[4]/div/div/div[1]/div[3]/h1

    }

    @Then("^User should see available estates$")
    public void user_see_available_estates() throws Throwable {
        //throw new PendingException();

        String actUrl=bs.PropertyUrl;
        String curntUrl=driver.getCurrentUrl();
        Assert.assertEquals(curntUrl,actUrl);
        System.out.println("properties available for rest are displayed to the user");
        Thread.sleep(4000);
        driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD));
        driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD));
        driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD));

        Utility.captureScreenshot(driver,"PropertyForrentPage");
        driver.close();



    }



}
