import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.json.JsonOutput;

public class WebDriverManagerPOC {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        options.addArguments("--disable-gup");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1400,600");
        WebDriverManager.chromedriver().linux().setup();
        System.out.println(System.getProperty("webdriver.chrome.driver"));
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        driver.quit();
    }
}
