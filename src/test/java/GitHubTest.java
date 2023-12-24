import org.testng.Assert;
import org.testng.annotations.*;

public class GitHubTest extends BaseTest {

    @Test
    public void verifyUserCanOpenLabelPage() {
        HomePage home = new HomePage(driver);
        home.goToLoginPage().loginSuccessful("irynantnn@gmail.com", "Yellow&Blue-eyedcat2");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToRepoPage();
        RepoPage repoPage = new RepoPage(driver);
        repoPage.goToIssuesPage();
        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.goToLabelsPage();
        LabelsPage labelsPage = new LabelsPage(driver);
        Assert.assertTrue(labelsPage.getSearchFieldLocator().isDisplayed());
    }

    @Test
    public void verifyUserCanCreateNewIssue() {
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
        Assert.assertTrue(createdIssuePage.getEditButtonLocator().isDisplayed());
    }

    @Test
    public void verifyUserCanOpenMilestonesPage() {
        HomePage home = new HomePage(driver);
        home.goToLoginPage().loginSuccessful("irynantnn@gmail.com", "Yellow&Blue-eyedcat2");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToRepoPage();
        RepoPage repoPage = new RepoPage(driver);
        repoPage.goToIssuesPage();
        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.goToMilestonesPage();
        MilestonesPage milestonesPage = new MilestonesPage(driver);
        Assert.assertTrue(milestonesPage.getCreateMilestoneButtonLocator().isDisplayed());
    }

    @DataProvider()
    public Object[][] labelData() {
        return new Object[][]{
                {"Info", "General details"},
                {"Spec", "Customer specific"},
                {"Warn", "Warning"}
        };
    }

    @Test(dataProvider = "labelData")
    public void verifyUserCanCreateNewLabel(String labelTitle, String labelDescription) {
        HomePage home = new HomePage(driver);
        home.goToLoginPage().loginSuccessful("irynantnn@gmail.com", "Yellow&Blue-eyedcat2");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToRepoPage();
        RepoPage repoPage = new RepoPage(driver);
        repoPage.goToIssuesPage();
        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.goToLabelsPage();
        LabelsPage labelsPage = new LabelsPage(driver);
        labelsPage.openNewLabelForm();
        NewLabelForm newLabelForm = new NewLabelForm(driver);
        newLabelForm.createNewLabel(labelTitle, labelDescription);
        Assert.assertTrue(labelsPage.getSearchFieldLocator().isDisplayed());
    }
}