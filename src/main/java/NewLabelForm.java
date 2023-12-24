import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class NewLabelForm extends BasePage {
    public NewLabelForm(WebDriver driver) {
        super(driver);
    }

    private By labelNameFieldLocator = By.xpath("//*[@id=\"label-name-\"]");
    private By labelDescriptionFieldLocator = By.xpath("//*[@id=\"label-description-\"]");
    private By createLabelButtonLocator = By.xpath("//*[@id=\"new_label\"]/div[2]/div/button[2]");

    public LabelsPage createNewLabel(String name, String description) {
        driver.findElement(labelNameFieldLocator).sendKeys(name);
        driver.findElement(labelDescriptionFieldLocator).sendKeys(description);
        webDriverWait.until(elementToBeClickable(driver.findElement(createLabelButtonLocator)));
        driver.findElement(createLabelButtonLocator).click();
        return new LabelsPage(driver);
    }
}