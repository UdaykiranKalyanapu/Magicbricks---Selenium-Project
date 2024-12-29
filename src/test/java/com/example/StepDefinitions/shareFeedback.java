package com.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.feedback;
import pageObjects.rentPage;
import resource.Utility;
import resource.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class shareFeedback extends base {
base bs=new base();
    @Given("^User is on property for rent page$")
    public void user_is_on_property_for_rentPage() throws Throwable {
        //throw new PendingException();
        driver = bs.initializeDriver();
        String url= bs.estateForRent;
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }

    @And("^User clicks on share Feedback button$")
    public void clicking_on_share_feedback_button() throws Throwable {
        //throw new PendingException();
        feedback f = new feedback(driver);
        Thread.sleep(2000);
        f.getshareFeedbackButton().click();
        Thread.sleep(2000);
      //  driver.findElement(By.xpath("/html/body/fmt:parsenumber/div/div[1]/div/div[2]/div[4]/div/div/div[1]/div[6]/div/div[2]/div[2]/a[3]")).click();

    }

    @And("^User selects a option displayed$")
    public void completing_feedback() throws Throwable {
        //throw new PendingException();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        feedback f = new feedback(driver);
        Thread.sleep(3000);
        f.getyesOption().click();
       //new yes button //*[@id="body"]/div[4]/div/div/div[4]/div/div/div/div/div[2]/span[1]
       // driver.findElement(By.xpath("//*[@id=\"body\"]/div[4]/div/div/div[3]/div/div/div/div/div[2]/span[1]")).click();
       // driver.findElement(By.name("userMobile")).click();
        f.getusernMobileLable().sendKeys("9848022338");
      //  driver.findElement(By.name("userMobile")).sendKeys("9848022338");
        Thread.sleep(2000);
        f.getuserEmailLable().sendKeys("abc@gmail.com");
        //driver.findElement(By.name("userEmail")).sendKeys("abc@gmail.com");
        Thread.sleep(2000);
    }



    @And("^clicks on submit button$")
    public void clicking_on_submitbutton() throws Throwable {
        //throw new PendingException();
        feedback f = new feedback(driver);
        // driver.findElement(By.xpath("//*[@id=\"body\"]/div[4]/div/div/div[3]/div/div/div/div/div[2]/span[1]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        f.getsubmitButton().click();
        //driver.findElement(By.xpath("//*[@id=\"shareFeedback-yes\"]/div[3]/div[3]/span")).click();
    }

    @Then("^displays the ThankYou message to User$")
    public void checking_of_thankyou_page() throws Throwable {
        //throw new PendingException();
        String thankyou_msg = "Thank You msg";
        List<WebElement> l= driver.findElements(By.xpath("//*[contains(text(),'We appreciate')]"));
        // verify list size
        if ( l.size() > 0){
            System.out.println("Text: " + thankyou_msg + " is present. ");
        } else {
            System.out.println("Text: " + thankyou_msg + " is not present. ");
        }
        Utility.captureScreenshot(driver,"share feedback");
driver.close();
    }


}
