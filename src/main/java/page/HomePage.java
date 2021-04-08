package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    private final WebDriver driver;
    private final By hotelNameKey = By.id("hotelNameKey");
    private final By checkInDate = By.id("checkInDate");
    private final By checkOutDate = By.id("checkOutDate");
    private final By peopleCount = By.xpath(".//select[@name='peopleCount']");
    private final By roomCount = By.xpath(".//select[@name='roomCount']");
    private final By formButton = By.xpath(".//button[text()=' Cari']");
    private final By resultLeft = By.className("resultLeft");

    private final By title = By.xpath(".//h1[@class='title']");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void setHotelName(String name) throws InterruptedException {
        driver.findElement(hotelNameKey).sendKeys(name);
        Thread.sleep(3000);
        driver.findElements(resultLeft).get(0).click();
    }

    public void clickTitle(){
        driver.findElement(title).click();
    }

    public void setCheckInDate(String checkInDateInput){
        driver.findElement(checkInDate).clear();
        driver.findElement(checkInDate).sendKeys(checkInDateInput);
        clickTitle();
    }

    public void setCheckOutDate(String checkOutDateInput){
        driver.findElement(checkOutDate).clear();
        driver.findElement(checkOutDate).sendKeys(checkOutDateInput);
        clickTitle();
    }

    public void setPeopleCount(int count){
        findDropdownElement(peopleCount).selectByVisibleText(count + " Tamu");
    }

    public void setRoomCount(int count){
        findDropdownElement(roomCount).selectByVisibleText(count + " Kamar");
    }

    private Select findDropdownElement(By dropdown){
        return new Select(driver.findElement(dropdown));
    }

    public SearchResultPage clickFormButton(){
        driver.findElement(formButton).click();
        return new SearchResultPage(driver);
    }
}
