import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WebPageTest {

    WebDriver driver;

    @BeforeEach
    void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        driver = new ChromeDriver(options);
        driver.get("https://github.com/marynamln");
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    public void testSpecificRepositoryExists() {
        WebElement repository = driver.findElement(By.linkText("Java_HW_2"));
        Assert.assertNotNull("Repository not found.", repository);
    }

    @Test
    public void testFullNameElement() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement fullNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='p-name vcard-fullname d-block overflow-hidden' and @itemprop='name']")));
        String expectedText = "Maryna Melnyk";
        String actualText = fullNameElement.getText().trim();
        assertEquals(expectedText, actualText, "Full name element text does not match expected text.");
    }

    @Test
    public void testCountPinnedItems() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pinned-item-list-item")));
        List<WebElement> pinnedItems = driver.findElements(By.xpath("//div[contains(@class, 'Box pinned-item-list-item d-flex p-3 width-full public source')]"));
        int expectedCount = 6;
        assertEquals(expectedCount, pinnedItems.size(), "The number of pinned items does not match expected.");
    }
}
