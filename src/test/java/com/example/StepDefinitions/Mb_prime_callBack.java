package com.example.StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.PrimePage;
import pageObjects.f_rentPage;
import resource.Utility;
import resource.base;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class Mb_prime_callBack extends base {
    base bs=new base();
    @Given("^User is logged in$")
    public void user_is_logged_in() throws Throwable {
        driver = bs.initializeDriver();
        JavascriptExecutor jj = (JavascriptExecutor) driver;
        String directLoginPage= bs.directLoginPage;
        PrimePage pp = new PrimePage(driver);


       driver.get(directLoginPage);
        driver.manage().window().maximize();
        pp.getemailLabel().clear();
        pp.getemailLabel().sendKeys("kalyanapuudaykiran32@gmail.com");
      //  driver.findElement(By.xpath("//input[@id='emailOrMobile']")).clear();
       // driver.findElement(By.xpath("//input[@id='emailOrMobile']")).sendKeys("kalyanapuudaykiran32@gmail.com");
       pp.getemailSubmitButton().click();
        // driver.findElement(By.id("btnStep1")).click();
       pp.getpassLabel().sendKeys("aezakmi18@K");
        // driver.findElement(By.xpath("//input[@id='password']")).sendKeys("aezakmi18@K");
       pp.getpassSubmitButton().click();
        // driver.findElement(By.id("btnLogin")).click();
       pp.getheader().click();
        // driver.findElement(By.xpath(" //*[@id=\"header\"]/header/div/div[1]/a")).click();

}

    @When("^User selects MBPrime option from header tab$")
    public void verify_that_shop_page_title_with_cutle() throws Throwable {
        PrimePage pp = new PrimePage(driver);
        Thread.sleep(3000);
        pp.getprimeMenu().click();
        Thread.sleep(3000);
        // driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[3]/a")).click();
       pp.getjoinNow().click();
        // driver.findElement((By.xpath(("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[3]/div/div[2]/a")))).click();
    }
    @Then("^User should be displayed with prime packs$")
    public void verify_that_shop_page_title_withrent_title() throws Throwable {
        //throw new PendingException();
        String curntUrl=driver.getCurrentUrl();
        String actUrl=bs.primeurl;
        Assert.assertEquals(curntUrl,actUrl);
        System.out.println("User is on prime page");
        Utility.captureScreenshot(driver,"MbPrime");
        driver.close();



       // button = new Button();
       // screen.wheel(RegionForScroll, button.WHEEL_UP, 5);


       // driver.findElement(By.cssSelector(".mb-header__sub__tabs__link js-menu-link")).click();
       // element.click();
        //driver.findElement(By.name("Request a Callback")).click();
       // JavascriptExecutor jj = (JavascriptExecutor) driver;
        //WebElement callbackbutton = driver.findElement(By.linkText(("Request")));


        //jj.executeScript("arguments[0].scrollIntoView();",callbackbutton);
        //Thread.sleep(3000);
       // driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[3]/a")).click();
       // WebDriverWait(driver, 20).until(EC.element_to_be_clickable((By.CSS_SELECTOR, "a[onclick^='toIndexHtml']"))).click();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //driver.findElement(By.ClassName("prime-pack__contact__colm3")).click();

      //driver.findElement(new By.ByClassName("prime-pack__contact__chat")).click();
       // iframe = driver.find_element_by_xpath("/html/body/div/div/div/iframe")
        //driver.switch_to.frame(iframe);
       // driver.findElement(By.className("mb-header__main__postproperty")).click();
    }



}
