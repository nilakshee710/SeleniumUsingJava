package selenium;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverTest {
	WebDriver driver;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        String title = driver.getTitle();
        System.out.println(title);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.manage().window().fullscreen();
       // WebElement links = driver.findElement(By.xpath("/html/body/div[1]/main/section[2]/div/div/div[2]/div/div[2]/div/a"));
        WebElement links = driver.findElement(By.linkText("Shifting Content"));
      
        links.click();
     
        WebElement link2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]"));
        
        link2.click();
        List<WebElement> links3 = driver.findElements(By.tagName("li"));
        System.out.println(links3.size());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    void chromeDriverCreatedTest() {
    	assertTrue(driver != null);
    	// wait here...
    }
}
