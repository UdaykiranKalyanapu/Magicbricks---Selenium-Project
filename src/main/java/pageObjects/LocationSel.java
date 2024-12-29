package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocationSel {

    public WebDriver driver;

    /*By email=By.cssSelector("[id='user-name']");
    By password=By.id("password");
    By login=By.id("login-button");*/


    By head_Menu=By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/a");
   //
   By dropdown=By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/a");
    //*[@id="commercialIndex"]/header/section[1]/div/div[2]
    By location_from_dropdown=By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div/div[1]/ul[2]/li[7]/a");

    public LocationSel(WebDriver driver) {
        this.driver=driver;
    }


    public WebElement gethead_Menu() {

        return driver.findElement(head_Menu);
    }
    public WebElement getDropDown() {
        return driver.findElement(dropdown);
    }
    public WebElement getlocation_from_dropdown() {

        return driver.findElement(location_from_dropdown);
    }

}
