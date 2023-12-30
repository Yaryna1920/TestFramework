import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LabelsPage extends BasePage {
    public LabelsPage(WebDriver driver) {
        super(driver, TITLE);
    }

    private By searchFieldLocator = By.xpath("//input[@placeholder=\"Search all labels\"]");
    private final static String TITLE = "Labels page";

    public WebElement getSearchFieldLocator() {
        return driver.findElement(searchFieldLocator);
    }
}
