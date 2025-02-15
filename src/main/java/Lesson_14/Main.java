package Lesson_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static private WebDriver driver = new ChromeDriver();
    private static WebDriverWait wait;
    public static void main(String[] args) {
      checkingContinueButton();
    }
    public static void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AnnoDomini\\IdeaProjects\\Aston\\src\\main\\resources\\ChromeDriver\\chromedriver.exe");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.mts.by/");
    }
public static String checkBlockName(){
        setup();
    WebElement inputBlockName = driver.findElement(By.xpath("//div [@class=\"pay__wrapper\"]/h2[text() =\"Онлайн пополнение \"]"));
    return inputBlockName.getText();
}

    public static String linkOperation(){
        setup();
        WebElement inputLinkUrl = driver.findElement(By.linkText("Подробнее о сервисе"));
        inputLinkUrl.click();
        String detailsLinkUrl = driver.getCurrentUrl();
        return detailsLinkUrl;
    }
   public static ArrayList<String> checkingLogo(){
        setup();
       ArrayList<String> nameLogo = new ArrayList<>();
        List<WebElement> logo = driver.findElements(By.xpath("//div[@class=\"pay__partners\"]//li//img"));
       for (WebElement getLogoName : logo) {
           nameLogo.add(getLogoName.getAttribute("alt"));
       }
       return nameLogo;
    }

    public static void checkingContinueButton(){
        setup();
        WebElement phoneInput = driver.findElement(By.xpath("//input[@class=\"phone\"]"));
        WebElement continueButton = driver.findElement(By.xpath("//button[@class=\"button button__default \"]"));
        phoneInput.sendKeys("297777777");
        continueButton.click();
    }
}