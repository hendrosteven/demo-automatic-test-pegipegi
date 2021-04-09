package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sun.font.Script;

public class PromoPage {
    private final WebDriver driver;

    private By hargaSpesialTitle = By.xpath(".//h2[text()='Harga Spesial']");
    private By imageLink = By.xpath(".//img[@alt='Akomodasi Favorit']");

    public PromoPage(WebDriver driver){
        this.driver = driver;
    }

    public void scrollToHargaSpesialTitle(){
        WebElement hargaSpesial = driver.findElement(hargaSpesialTitle);
        JavascriptExecutor executor =  (JavascriptExecutor) driver;
        String script = "arguments[0].scrollIntoView()";
        executor.executeScript(script, hargaSpesial);
    }

    public void clickImage(){
        driver.findElements(imageLink).get(0).click();
    }
}
