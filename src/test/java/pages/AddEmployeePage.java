package pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {

    @FindBy(id="firstName")
    public WebElement firstName1;

    @FindBy(id="middleName")
    public WebElement middleName2;

    @FindBy(id="lastName")
    public WebElement lastName3;

    @FindBy(id="btnSave")
    public WebElement SaveButton;

    @FindBy(id="menu_pim_addEmployee")
    public WebElement AddEmployee;
    //we create constructor:

    public AddEmployeePage(){
        PageFactory.initElements(driver, this);
    }
}
