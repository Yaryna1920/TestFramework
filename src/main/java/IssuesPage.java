import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IssuesPage extends BasePage {
    public IssuesPage(WebDriver driver) {
        super(driver);
    }

    private By newIssueButtonLocator = By.xpath("//span[text()=\"New issue\"]");
    private By linkLabelsLocator = By.xpath("//*[@id=\"repo-content-turbo-frame\"]/div/div[1]/div[1]/div/nav/a[1]");
    private By linkMilestonesLocator = By.xpath("//*[@id=\"repo-content-turbo-frame\"]/div/div[1]/div[1]/div/nav/a[2]");

    public WebElement getButtonLocator() {
        return driver.findElement(newIssueButtonLocator);
    }

    public NewIssueForm goToNewIssueForm() {
        driver.findElement(newIssueButtonLocator).click();
        return new NewIssueForm(driver);
    }

    public LabelsPage goToLabelsPage() {
        driver.findElement(linkLabelsLocator).click();
        return new LabelsPage(driver);
    }

    public MilestonesPage goToMilestonesPage() {
        driver.findElement(linkMilestonesLocator).click();
        return new MilestonesPage(driver);
    }
}