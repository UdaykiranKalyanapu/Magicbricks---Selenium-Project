package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrimePage {

    public WebDriver driver;

    /*By email=By.cssSelector("[id='user-name']");
    By password=By.id("password");
    By login=By.id("login-button");*/


    By emailLabel=By.xpath("//input[@id='emailOrMobile']");
    By passLabel=By.xpath("//input[@id='password']");

    By emailSubmitButton=By.id("btnStep1");
    By passSubmitButton=By.id("btnLogin");
    By header=By.xpath(" //*[@id=\"header\"]/header/div/div[1]/a");
    By primeMenu=By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[3]/a");
    By joinNow=By.xpath(("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[3]/div/div[2]/a"));
    public PrimePage(WebDriver driver) {
        this.driver=driver;
    }


    public WebElement getemailLabel() {

        return driver.findElement(emailLabel);
    }
    public WebElement getpassLabel() {
        return driver.findElement(passLabel);
    }
    public WebElement getemailSubmitButton() {

        return driver.findElement(emailSubmitButton);
    }

    public WebElement getpassSubmitButton() {

        return driver.findElement(passSubmitButton);
    }
    public WebElement getjoinNow() {

        return driver.findElement(joinNow);
    }

    public WebElement getprimeMenu() {

        return driver.findElement(primeMenu);
    }

    public WebElement getheader() {

        return driver.findElement(header);
    }



}
