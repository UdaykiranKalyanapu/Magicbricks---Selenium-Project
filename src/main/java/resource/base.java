package resource;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.chrome.ChromeOptions;
        import org.openqa.selenium.firefox.FirefoxDriver;

        import java.io.FileInputStream;
        import java.io.IOException;
        import java.util.Properties;
        import java.util.concurrent.TimeUnit;

public class base {
    public static WebDriver driver;
    public String url;
    public String url2;
    public String estateForRent;
    public String PropertyUrl;
    public String FlatsUrl;
    public String directLoginPage;
    public String primeurl;


    public Properties prop;

    public WebDriver initializeDriver() throws IOException
    {

        prop= new Properties();
        FileInputStream fis=new FileInputStream("src/main/java/resource/data.properties");
        prop.load(fis);
        //All data of url and assert url
        String browserName=prop.getProperty("browser");
        url=prop.getProperty("url");
        url2=prop.getProperty("url2");
        primeurl=prop.getProperty("primeurl");
        estateForRent=prop.getProperty("estateForRent");
        PropertyUrl=prop.getProperty("PropertyUrl");
        FlatsUrl=prop.getProperty("FlatsUrl");
        directLoginPage=prop.getProperty("directLoginPage");

        System.out.println(browserName);
        if(browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver1.exe");
            driver= new ChromeDriver();
            //execute in chrome driver
            //webdriver.chrome.driver
        }

        else if (browserName.equals("firefox"))
        {
            driver= new FirefoxDriver();
            //firefox code
        }
        else if (browserName.equals("IE"))
        {
//	IE code
        }

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;


    }



    public static void openHome(){


       // driver= new ChromeDriver();

        driver.get("https://www.magicbricks.com");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/header/section[1]/div/div[4]/a")).click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[4]/div/div[2]/a")).click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        WebElement loginfield = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div[1]/label"));
        driver.findElement(By.xpath("//input[@id='emailOrMobile']")).sendKeys("kalyanapuudaykiran32@gmail.com");
        driver.findElement(By.id("btnStep1")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("aezakmi18@K");
        driver.findElement(By.id("btnLogin")).click();//loginfield.click();



    }

}