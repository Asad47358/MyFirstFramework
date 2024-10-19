package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {

   // AddEmployeePage addEmployeePage = new AddEmployeePage();

    @When("user enters first name and lastname in the name fields")
    public void user_enters_first_name_and_lastname_in_the_name_fields() {

    }

    @When("user enters {string} and {string} and {string} the application")
    public void user_enters_and_and_the_application
            (String firstName, String middleName, String lastName) {
      //  WebElement firstName1 = driver.findElement(By.id("firstName"));
      //  WebElement middleName2 = driver.findElement(By.id("middleName"));
      //  WebElement lastName3 = driver.findElement(By.id("lastName"));
       // firstName1.sendKeys(firstName);
        sendText(firstName, addEmployeePage.firstName1);
       // middleName2.sendKeys(middleName);
        sendText(middleName, addEmployeePage.middleName2);
       // lastName3.sendKeys(lastName);
        sendText(lastName, addEmployeePage.lastName3);

    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
      //  WebElement SaveButton = driver.findElement(By.id("btnSave"));
       // SaveButton.click();
        click(addEmployeePage.SaveButton);
    }
    @Then("user added successfully")
    public void user_added_successfully() {
        System.out.println("test passed");
    }

    @When("user add {string} , {string} and {string}")
    public void user_add_and(String fn, String mn, String ln) {
      //  WebElement firstName1 = driver.findElement(By.id("firstName"));
      //  WebElement middleName2 = driver.findElement(By.id("middleName"));
       // WebElement lastName3 = driver.findElement(By.id("lastName"));
      sendText("ahmad", addEmployeePage.firstName1);
      //  middleName2.sendKeys(mn);
        sendText("AH", addEmployeePage.middleName2);
      //  lastName3.sendKeys(ln);
        sendText("Popal", addEmployeePage.lastName3);
    }
    @When("user adds multiple employees using data table and save them")
    public void user_adds_multiple_employees_using_data_table_and_save_them
            (io.cucumber.datatable.DataTable dataTable) {

        List<Map<String, String>> employeeNames = dataTable.asMaps();

        for (Map<String, String> employee : employeeNames){
         // WebElement firstName1 = driver.findElement(By.id("firstName"));
        //  WebElement middleName2 = driver.findElement(By.id("middleName"));
         // WebElement lastName3 = driver.findElement(By.id("lastName"));

          addEmployeePage.firstName1.sendKeys(employee.get("firstName"));
          addEmployeePage.middleName2.sendKeys(employee.get("middleName"));
          addEmployeePage.lastName3.sendKeys(employee.get("lastName"));

            //  we use here the save button again to this loop work for all
          //  WebElement SaveButton = driver.findElement(By.id("btnSave"));
           // SaveButton.click();
            click(addEmployeePage.SaveButton);
            //  and after click on save button we want to click on add employee again, so we need add employe locator.
         //   WebElement AddEmployee = driver.findElement(By.id("menu_pim_addEmployee"));
          //  AddEmployee.click();
            click(addEmployeePage.AddEmployee);

        }

    }

    @When("user adds multiple employee from excel file")
    public void user_adds_multiple_employee_from_excel_file() throws IOException {
        List <Map<String, String>> newEmployees =  ExcelReader.read();
        for (Map<String, String> employee: newEmployees){
           // WebElement firstName1 = driver.findElement(By.id("firstName"));
          //  WebElement middleName2 = driver.findElement(By.id("middleName"));
           // WebElement lastName3 = driver.findElement(By.id("lastName"));

           addEmployeePage.firstName1.sendKeys(employee.get("firstName"));
           addEmployeePage.middleName2.sendKeys(employee.get("middleName"));
            addEmployeePage.lastName3.sendKeys(employee.get("lastName"));

            //  we use here the save button again to this loop work for all
          //  WebElement SaveButton = driver.findElement(By.id("btnSave"));
          //  SaveButton.click();
            click(addEmployeePage.SaveButton);
            //  and after click on save button we want to click on add employee again, so we need add employee locator.
            //WebElement AddEmployee = driver.findElement(By.id("menu_pim_addEmployee"));
           // AddEmployee.click();
            click(addEmployeePage.AddEmployee);
        }

    }
}
