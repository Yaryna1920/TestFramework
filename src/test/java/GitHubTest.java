import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class GitHubTest {
    private WebDriver driver;

   @Test
   public void gitHubTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\iryna.antonian\\IdeaProjects\\TestFramework\\src\\main\\resources\\Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://github.com");
        driver.quit();
    }

    public static void main(String[] args) {
        GitHubTest gitHubTest = new GitHubTest();
        gitHubTest.gitHubTest();
    }
}
