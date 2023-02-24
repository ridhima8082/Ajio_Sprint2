package steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.plugin.event.Node;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.BrowserManager;
import utils.QAprops;
import utils.TestDataReader;

import java.io.IOException;
import java.util.HashMap;

public class StepDefinitions {
    HomePage homePage;
    String url;
    HashMap<String, String> data;
    Scenario scenario;
    private WebDriver driver;

    public StepDefinitions(BrowserManager browserManager) {
        this.driver = browserManager.getDriver();
    }

    @Before(order = 1)
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Test(priority = 0)
    @Given("the user navigates to the homepage")
    public void the_user_navigates_to_the_homepage() throws IOException {
        url = QAprops.getValue("Homepage_url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }

    @When("the user click on the option to display categories in Men's section")
    public void the_user_click_in_the_option_to_display_categories_in_men_s_section() throws IOException {
        homePage = new HomePage(driver);
        homePage.MenCat().click();
    }

    @Then("the brands and offers under men's section to be displayed.")
    public void theBrandsAndOffersUnderMenSSectionToBeDisplayed() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, data.get("url"));
    }

    @Test(priority = 1)
    @Given("the user navigates to the ajio_homepage")
    public void theUserNavigatesToTheAjio_homepage() throws IOException {
        url = QAprops.getValue("Homepage_url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }

    @When("the user click on the option to display categories in Women's section")
    public void theUserClickOnTheOptionToDisplayCategoriesInWomenSSection() throws IOException {
        homePage = new HomePage(driver);
        homePage.WomenCat().click();
    }

    @Then("the brands and offers under women's section to be displayed.")
    public void theBrandsAndOffersUnderWomenSSectionToBeDisplayed() throws IOException {
        homePage.WomenCat().click();
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, data.get("url"));
    }

    @Test(priority = 2)
    @Given("the user navigates to the men's category page")
    public void theUserNavigatesToTheMenSCategoryPage() throws IOException {
        url = QAprops.getValue("MenSection_ajio");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }

    @When("the user selects particular brand from men's category")
    public void theUserSelectsParticularBrandFromMenSCategory() {
        homePage = new HomePage(driver);
        homePage.B_Superdry().click();
    }

    @Then("the products from men's section of the particular brand gets displayed")
    public void theProductsFromMenSSectionOfTheParticularBrandGetsDisplayed() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, data.get("url"));
    }

    @Test(priority = 3)
    @Given("the user navigates to the women's category page")
    public void theUserNavigatesToTheWomenSCategoryPage() throws IOException {
        url = QAprops.getValue("WomenSection_ajio");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }

    @When("the user selects particular brand from women's category")
    public void theUserSelectsParticularBrandFromWomenSCategory() {
        homePage = new HomePage(driver);
        homePage.B_Levis().click();
    }

    @Then("the products from women's section of the particular brand gets displayed")
    public void theProductsFromWomenSSectionOfTheParticularBrandGetsDisplayed() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, data.get("url"));
    }

    @Test(priority = 4)
    @Given("the user navigates to the page of men's category")
    public void theUserNavigatesToThePageOfMenSCategory() throws IOException {
        url = QAprops.getValue("MenSection_ajio");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }

    @When("the user selects particular brand from men's section")
    public void theUserSelectsParticularBrandFromMenSSection() {
        homePage = new HomePage(driver);
        homePage.B_Superdry().click();

    }

    @And("the user selects particular product from the brand in men's section")
    public void theUserSelectsParticularProductFromTheBrandInMenSSection() {

        homePage.Product_Superdry().click();
    }

    @Then("the product page gets displayed")
    public void theProductPageGetsDisplayed() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, data.get("url"));
    }

    @Test(priority = 5)
    @Given("the user navigates to the page of women's category")
    public void theUserNavigatesToThePageOfWomenSCategory() throws IOException {
        url = QAprops.getValue("WomenSection_ajio");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());

    }

    @When("the user selects particular brand from women's section")
    public void theUserSelectsParticularBrandFromWomenSSection() {
        homePage = new HomePage(driver);
        homePage.B_Levis().click();
    }

    @And("the user selects particular product from the brand in women's section")
    public void theUserSelectsParticularProductFromTheBrandInWomenSSection() throws InterruptedException {
        Thread.sleep(5000);
        homePage.Product_Levis().click();

    }

    @Then("the product page gets displayed to user")
    public void theProductPageGetsDisplayedToUser() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, data.get("url"));
    }

    @Test(priority = 6)
    @Given("the user navigates to the ajio homepage")
    public void theUserNavigatesToTheAjioHomepage() throws IOException {
        url = QAprops.getValue("Homepage_url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }

    @When("the user click on the option to display categories in Kidss section")
    public void theUserClickOnTheOptionToDisplayCategoriesInKidssSection() {
        homePage = new HomePage(driver);
        homePage.Kids().click();
    }

    @Then("the brands and offers under Kids section to be displayed.")
    public void theBrandsAndOffersUnderKidsSectionToBeDisplayed() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, data.get("url"));
    }
    @Test
    @Given("the user navigates to the homepage of ajio")
    public void theUserNavigatesToTheHomepageOfAjio() throws IOException {
        url = QAprops.getValue("Homepage_url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }
    @When("the user clicks on searchbar and enters {string}")
    public void theUserClicksOnSearchbarAndEnters(String product1) throws InterruptedException {
        homePage = new HomePage(driver);
        WebDriverWait wait=new WebDriverWait(driver,3); //explicit wait
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name=\"searchVal\"]"))));
        homePage.searchbox().click();
        Thread.sleep(3000);
        homePage.searchbox().sendKeys(product1);
        Thread.sleep(4000);
        homePage.SearchButton().click();
    }

        @Then("Products gets displayed")
    public void productsGetsDisplayed() {
            WebElement text = homePage.Outcome();
            Assert.assertTrue(text.isDisplayed());
    }

}

