package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {
    private final WebDriver driver;

    public WindowManager(WebDriver driver){
        this.driver = driver;
    }

    public void goBack(){
        driver.navigate().back();
    }

    public void goForward(){
        driver.navigate().forward();
    }

    public void refreshPage(){
        driver.navigate().refresh();
    }

    public void gotTo(String url){
        driver.navigate().to(url);
    }

    public void switchToTab(String tabTitle){
        Set<String> windows = driver.getWindowHandles();
        windows.forEach(System.out::println);
        for(String window: windows){
            driver.switchTo().window(window);
            if(driver.getTitle().contains(tabTitle)){
                break;
            }
        }
    }
}
