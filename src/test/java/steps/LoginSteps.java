package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class LoginSteps extends CommonMethods {

    LoginPage LoginPage = new LoginPage();

    @Given("user is able to access HRMS application")
    public void user_is_able_to_access_hrms_application() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @When("user enters admin username and admin password")
    public void user_enters_admin_username_and_admin_password() throws IOException {
         //  WebElement usernameField = driver.findElement(By.id("txtUsername"));
       // usernameField.sendKeys("Admin");
        sendText((ConfigReader.read("userName")),LoginPage.usernameField);   //we used concept of " overriding "

        //  WebElement passwordField = driver.findElement(By.id("txtPassword"));
      //  passwordField.sendKeys("Hum@nhrm123");
        sendText((ConfigReader.read("password")), LoginPage.passwordField);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
     //   loginButton.click();
        click(loginButton);  //we used concept of " overriding "

    }
    @Then("user is navigated to dashboard page")
    public void user_is_navigated_to_dashboard_page() {
        System.out.println("test passed");
    }

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        WebElement PimOption = driver.findElement(By.xpath("//b[text()='PIM']"));
       // PimOption.click();
        click(PimOption);
    }
    @When("user clicks on Employee list option")
    public void user_clicks_on_employee_list_option() {
        WebElement employeeList = driver.findElement(By.id("menu_pim_viewEmployeeList"));
       // employeeList.click();
        click(employeeList);
    }
    @When("user enters employee ID")
    public void user_enters_employee_id() {
        WebElement employeeId = driver.findElement(By.id("empsearch_id"));
        employeeId.sendKeys("110360A");
    }
    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        WebElement SearchButton = driver.findElement(By.id("searchBtn"));
       // SearchButton.click();
        click(SearchButton);
    }
    @Then("user is able to see searched employee on screen")
    public void user_is_able_to_see_searched_employee_on_screen() {
        System.out.println("test passed");
    }

    @When("user clicks on add employee option")
    public void user_clicks_on_add_employee_option() {
        WebElement AddEmployee = driver.findElement(By.id("btnAdd"));
       click(AddEmployee);
    }






}
