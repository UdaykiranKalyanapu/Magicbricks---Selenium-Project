package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class feedback {

    public WebDriver driver;

    /*By email=By.cssSelector("[id='user-name']");
    By password=By.id("password");
    By login=By.id("login-button");*/


    By shareFeedbackButton=By.className("mb-srp__action--link");

    //By yesOption=By.xpath("//*[@id=\"body\"]/div[4]/div/div/div[3]/div/div/div/div/div[2]/span[1]");
    By yesOption=By.xpath("//*[@id=\"body\"]/div[4]/div/div/div[4]/div/div/div/div/div[2]/span[1]");

    By usernMobileLable=By.name("userMobile");
    By userEmailLable=By.name("userEmail");
    By submitButton=By.xpath("//*[@id=\"shareFeedback-yes\"]/div[3]/div[3]/span");


    public feedback(WebDriver driver) {

        this.driver=driver;
    }

    public WebElement getshareFeedbackButton() {

        return driver.findElement(shareFeedbackButton);
    }

    public WebElement getyesOption() {

        return driver.findElement(yesOption);
    }
    public WebElement getusernMobileLable() {


        return driver.findElement(usernMobileLable);
    }
    public WebElement getsubmitButton() {

        return driver.findElement(submitButton);
    }
    public WebElement getuserEmailLable() {

        return driver.findElement(userEmailLable);
    }

    }


