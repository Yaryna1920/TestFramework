import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatedIssuePage extends BasePage {
    public CreatedIssuePage(WebDriver driver) {
        super(driver, TITLE);
    }

    private By editButtonLocator = By.xpath("//span[text()=\"Edit\"]");
    private final static String TITLE = "Created Issue page";

    public WebElement getEditButtonLocator() {
        return driver.findElement(editButtonLocator);
    }
}
