import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWaits {
    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement address = driver.findElement(By.id("autocomplete"));
        address.sendKeys("1555 Park Blvd Palo Alto, CA");

        WebDriverWait wait = new WebDriverWait(driver,10);


        WebElement autocompleteResult = wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.className("pac-item")));

        autocompleteResult.click();

        driver.quit();
    }
}
