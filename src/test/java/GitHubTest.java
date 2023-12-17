import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GitHubTest extends BaseTest {

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
