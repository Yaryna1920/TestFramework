import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

    By imgLocator = By.xpath("//span[@class=\"Button-label\"]/img[@class=\"avatar circle\"]");
    By linkLocator = By.linkText("Yaryna1920/HW_IA");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogoOnTheMainPage() {
        return driver.findElement(imgLocator);
    }

    public RepoPage goToRepoPage() {
        driver.findElement(linkLocator).click();
        return new RepoPage(driver);
    }
}
