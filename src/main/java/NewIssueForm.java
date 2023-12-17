import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class NewIssueForm extends BasePage {
    public NewIssueForm(WebDriver driver) {
        super(driver);
    }

    private By titleFieldLocator = By.xpath("//input[@placeholder=\"Title\"]");
    private By descriptionFieldLocator = By.xpath("//textarea[@name=\"issue[body]\"]");
    private By submitButtonLocator = By.xpath("//*[@id=\"new_issue\"]/div/div/div[1]/div/div[1]/div/div[3]/button");

    public CreatedIssuePage newIssueCreation(String title, String description) {
        driver.findElement(titleFieldLocator).sendKeys(title);
        driver.findElement(descriptionFieldLocator).sendKeys(description);
        webDriverWait.until(elementToBeClickable(driver.findElement(submitButtonLocator)));
        driver.findElement(submitButtonLocator).click();
        return new CreatedIssuePage(driver);
    }
}
