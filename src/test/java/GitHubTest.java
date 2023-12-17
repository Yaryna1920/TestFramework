import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class GitHubTest extends BaseTest {

    @Test
    public void checkLogoOnTheLoginPage() {
        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.goToLoginPage().getLogo().isDisplayed(), "Logo is not displayed");
    }

    @Test
    public void checkLoginIsSuccessful() {
        HomePage home = new HomePage(driver);
        home.goToLoginPage().loginSuccessful("irynantnn@gmail.com", "Yellow&Blue-eyedcat2");
        MainPage mainPage = new MainPage(driver);
        mainPage.getLogoOnTheMainPage();
        Assertions.assertTrue(mainPage.getLogoOnTheMainPage().isDisplayed());
    }

    @Test
    public void checkFailedLogin() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFailed("irynantnn@gmail1.com", "Yellow&Blue-eyedcat2");
        loginPage.validateErrorMessage("Incorrect username or password.");
    }

    @Test
    public void openLabelPage() {
        HomePage home = new HomePage(driver);
        home.goToLoginPage().loginSuccessful("irynantnn@gmail.com", "Yellow&Blue-eyedcat2");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToRepoPage();
        RepoPage repoPage = new RepoPage(driver);
        repoPage.goToIssuesPage();
        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.goToLabelsPage();
        LabelsPage labelsPage = new LabelsPage(driver);
        Assertions.assertTrue(labelsPage.getSearchFieldLocator().isDisplayed());
    }

    @Test
    public void createNewIssue() {
        HomePage home = new HomePage(driver);
        home.goToLoginPage().loginSuccessful("irynantnn@gmail.com", "Yellow&Blue-eyedcat2");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToRepoPage();
        RepoPage repoPage = new RepoPage(driver);
        repoPage.goToIssuesPage();
        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.goToNewIssueForm();
        NewIssueForm newIssueForm = new NewIssueForm(driver);
        newIssueForm.newIssueCreation("Test title", "Test description");
        CreatedIssuePage createdIssuePage = new CreatedIssuePage(driver);
        Assertions.assertTrue(createdIssuePage.getEditButtonLocator().isDisplayed());
    }

    @Test
    public void openMilestonesPage() {
        HomePage home = new HomePage(driver);
        home.goToLoginPage().loginSuccessful("irynantnn@gmail.com", "Yellow&Blue-eyedcat2");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToRepoPage();
        RepoPage repoPage = new RepoPage(driver);
        repoPage.goToIssuesPage();
        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.goToMilestonesPage();
        MilestonesPage milestonesPage = new MilestonesPage(driver);
        Assertions.assertTrue(milestonesPage.getCreateMilestoneButtonLocator().isDisplayed());
    }
}
