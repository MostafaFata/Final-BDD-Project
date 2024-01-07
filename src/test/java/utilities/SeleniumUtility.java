package utilities;

import base.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Page;

import java.time.Duration;

public class SeleniumUtility extends Setup {

        public String getElementText(By locator){
            WebElement element = getDriver().findElement(locator);
            return element.getText();
        }

        public void clickElement(By locator){
            WebElement element = getDriver().findElement(locator);
            element.click();
        }

        public String getElementTextWait(By locator, int duration){
            WebDriverWait driverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(duration));
            return driverWait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
        }


}
