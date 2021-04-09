package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlashSalePage {
    private WebDriver driver;
    private By label = By.xpath(".//span[text()='Flash Sale Hotel']");

    public FlashSalePage(WebDriver driver){
        this.driver = driver;
    }

    public String getLabelText(){
        return driver.findElement(label).getText();
    }
}
