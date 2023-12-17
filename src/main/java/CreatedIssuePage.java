import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatedIssuePage extends BasePage {
    public CreatedIssuePage(WebDriver driver) {
        super(driver);
    }

    private By editButtonLocator = By.xpath("//span[text()=\"Edit\"]");

    public WebElement getEditButtonLocator() {
        return driver.findElement(editButtonLocator);
    }
}
