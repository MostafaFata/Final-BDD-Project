package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Setup {

      String configFilePath =  System.getProperty("user.dir") + "\\src\\test\\resources\\configs\\env.properties";
      Properties properties = new Properties();

      {
        FileInputStream configFile;
        try {
            configFile = new FileInputStream(configFilePath);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        try {
            properties.load(configFile);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
      }


    private static WebDriver driver;
    private String url = properties.getProperty("ui.url");
    private String browser = properties.getProperty("ui.browser");
    private boolean headless = Boolean.parseBoolean(properties.getProperty("ui.headless"));

    public void openBrowser() {

        if(browser.equals("Chrome")){
            if(headless){
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                driver = new ChromeDriver(options);
            }else{
                driver = new ChromeDriver();
            }
        }else if(browser.equals("Firefox")){
            if(headless){
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("--headless");
                driver = new FirefoxDriver(options);
            }else{
                driver = new FirefoxDriver();
            }
        }else if(browser.equals("Edge")){
            if(headless){
                EdgeOptions options = new EdgeOptions();
                options.addArguments("--headless");
                driver = new EdgeDriver(options);
            }else{
                driver = new EdgeDriver();
            }
        }else{
            System.out.println("Invalid Browser");
        }

    }

    public void navigateURL(){
        driver.get(url);
    }

    public void closeBrowser(){
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }




}
