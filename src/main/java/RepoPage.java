import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepoPage extends BasePage {
    private By tablocator = By.xpath("//a[@data-tab-item=\"i1issues-tab\"]");
    private final static String TITLE = "Issues page";

    public RepoPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public IssuesPage goToIssuesPage() {
        driver.findElement(tablocator).click();
        return new IssuesPage(driver);
    }
}
