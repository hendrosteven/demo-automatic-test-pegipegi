package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
    private final WebDriver driver;

    private final By titlePage = By.className("titlePage");

    public SearchResultPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitlePage(){
        return driver.findElement(titlePage).getText();
    }
}
