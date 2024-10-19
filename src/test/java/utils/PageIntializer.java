package utils;

import org.checkerframework.checker.units.qual.A;
import pages.AddEmployeePage;
import pages.LoginPage;

public class PageIntializer {

    public static LoginPage loginPage;
    public static AddEmployeePage addEmployeePage;


    public static void initializePageObject(){
        loginPage = new LoginPage();
        addEmployeePage = new AddEmployeePage();
    }
}
