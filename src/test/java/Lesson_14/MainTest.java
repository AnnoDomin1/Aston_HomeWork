package Lesson_14;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

import static Lesson_14.Main.checkBlockName;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
     static WebDriver driver = new ChromeDriver();
    private static WebDriverWait wait;
    @BeforeAll
    public static void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AnnoDomini\\IdeaProjects\\Aston\\src\\main\\resources\\ChromeDriver\\chromedriver.exe");
        driver.get("https://www.mts.by/");
    }
    @Test
    @DisplayName("Проверка названия блока")
    void checkBlockNameTest() {
        String actualTitle = checkBlockName();
        String expectedTitle = "Онлайн пополнение\n" + "без комиссии";
        assertEquals(expectedTitle, actualTitle);
    }
    @Test
    @DisplayName("Проверка работоспособности ссылки \"Подробнее о сервисе\"")
    void linkOperationTest() {
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
String actualUrl = Main.linkOperation();
        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    @DisplayName("Проверка наличия логотипов")
    void checkLogoName() {
        ArrayList<String> expectedNameLogo = new ArrayList<>();
        expectedNameLogo.add("Visa");
        expectedNameLogo.add("Verified By Visa");
        expectedNameLogo.add("MasterCard");
        expectedNameLogo.add("MasterCard Secure Code");
        expectedNameLogo.add("Белкарт");
        ArrayList<String> actualNameLogo = Main.checkingLogo();
        assertEquals(expectedNameLogo, actualNameLogo);
    }
    @Test
    @DisplayName("Проверка наличия логотипов")
    void checkingContinueButtonTest() {
        Main.checkingContinueButton();
        WebElement amountInput = driver.findElement(By.xpath("//input[@class=\"total_rub\"]"));
        assertTrue(amountInput.isDisplayed());
    }


    @AfterAll
    public static void close() {
         wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        if (driver != null) {
            driver.quit();
        }
    }
}