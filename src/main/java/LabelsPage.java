import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class LabelsPage extends BasePage {
    public LabelsPage(WebDriver driver) {
        super(driver);
    }

    private By searchFieldLocator = By.xpath("//input[@placeholder=\"Search all labels\"]");
    private By newLabelButtonLocator = By.xpath("//*[@id=\"repo-content-pjax-container\"]/div/div/div[1]/div[3]/button");

    public WebElement getSearchFieldLocator() {
        return driver.findElement(searchFieldLocator);
    }

    public NewLabelForm openNewLabelForm() {
        driver.findElement(newLabelButtonLocator).click();
        return new NewLabelForm(driver);
    }
}
