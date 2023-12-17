import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepoPage extends BasePage {
    private By tablocator = By.xpath("//a[@data-tab-item=\"i1issues-tab\"]");

    public RepoPage(WebDriver driver) {
        super(driver);
    }

    public IssuesPage goToIssuesPage() {
        driver.findElement(tablocator).click();
        return new IssuesPage(driver);
    }
}
