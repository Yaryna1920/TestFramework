import helpers.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static helpers.ColorPrinter.printColorMessage;

public class GitHubTest extends BaseTest {

    @Test
    public void verifyUserCanOpenLabelPage() {
        Logger logger = LogManager.getLogger();
        logger.info("verifyUserCanOpenLabelPage starts");
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
        logger.info("verifyUserCanOpenLabelPage is finished");
    }

    @Test
    public void verifyUserCanCreateNewIssue() {
        Logger logger = LogManager.getLogger();
        logger.info("verifyUserCanCreateNewIssue starts");
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
        logger.info("verifyUserCanCreateNewIssue is finished");
    }

    @Test
    public void verifyUserCanOpenMilestonesPage() {
        Logger logger = LogManager.getLogger();
        logger.info("verifyUserCanOpenMilestonesPage starts");
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
        logger.info("verifyUserCanOpenMilestonesPage is finished");

    }
}
