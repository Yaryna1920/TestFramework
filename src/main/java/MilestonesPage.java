import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MilestonesPage extends BasePage {
    public MilestonesPage(WebDriver driver) {
        super(driver, TITLE);
    }

    private By createMilestoneButtonLocator = By.xpath("//span[text()=\"Create a Milestone\"]");
    private final static String TITLE = "Milestones page";

    public WebElement getCreateMilestoneButtonLocator() {
        return driver.findElement(createMilestoneButtonLocator);
    }
}