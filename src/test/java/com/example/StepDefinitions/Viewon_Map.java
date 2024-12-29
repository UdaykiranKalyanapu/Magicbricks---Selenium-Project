package com.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import resource.base;

import java.util.concurrent.TimeUnit;

public class Viewon_Map extends base {
    public base bs=new base();
    @Given("^User selects a preferred location$")
    public void user_selects_a_location() throws Throwable {
        //throw new PendingException();
        driver = bs.initializeDriver();
        String url= bs.url;
        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div/div[1]/ul[2]/li[7]/a")).click();

    }

    @When("^User clicks on flats for rent$")
    public void verify_that_user_is_able_to_search_items_by_name_and_access_them() throws Throwable {

        driver.findElement(By.xpath("//*[@id=\"rentheading\"]")).click();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"rentDrop\"]/div[3]")).click();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/header/section[2]/div/ul/li[2]/div/div[1]/div/div[2]/div[1]/ul/li[2]/a/span")).click();
          Thread.sleep(2000);
          driver.close();

    }

    @And("^User clicks on View on map button$")
    public void verify_that_user_is_redirected_to_respective_item_page() throws Throwable {
        Thread.sleep(25000);
        driver.get("https://www.magicbricks.com/flats-for-rent-in-hyderabad-pppfr");
        driver.findElement(By.xpath("//*[@id=\"cardid59904197\"]/div/div[3]/div/span")).click();
//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[3]")).click();
//driver.findElement(By.tagName("span")).click();
  //    driver.findElement(By.cssSelector("div.container-fluid div.container div.mb-srp div.mb-srp__left div.mb-srp__list:nth-child(6) div.mb-srp__card div.mb-srp__card__kilometre:nth-child(3) div.mb-srp__card__kilometre__container > span.mb-srp__card__kilometre--viewmap")).click();

    }

    @Then("^User Should navigated to map locating the estate$")
    public void verifthat_user_is_redirected_to_respective_item_page() throws Throwable {
        //throw new PendingException();
    }

}

