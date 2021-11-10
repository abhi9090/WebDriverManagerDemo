import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.json.JsonOutput;

public class WebDriverManagerPOC {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        System.out.println(System.getProperty("webdriver.chrome.driver"));
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }
}
