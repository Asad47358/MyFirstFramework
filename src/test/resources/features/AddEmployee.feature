
Feature: Add employee in HRMS

  Background:
    Given user is able to access HRMS application
    When user enters admin username and admin password
    And user clicks on login button
    Then user is navigated to dashboard page
    When user clicks on PIM option
    And user clicks on add employee option

@addEmployee1
  Scenario: Add employee
    When user enters first name and lastname in the name fields
    And user clicks on save button
    Then user added successfully


  @params
  Scenario: Adding employee using parameters
    And user enters "Asad" and "ullah" and "Ahmadzad" the application
    And user clicks on save button
    Then user added successfully

@DataDriven
  Scenario Outline: adding multiple empolyees
    And user add "<firstname>" , "<middlename>" and "<lastname>"
    And user clicks on save button
    Then user added successfully
    Examples:
      | firstname | middlename | lastname |
      | Asad      | ullah      | ahmadzad |
      |Hasib      | ullah      | ahmadzad |
      |ghezal     |As          |ashgari   |

  @Datatable
  Scenario: Adding multiple employee using data table
    When user adds multiple employees using data table and save them
    |firstName     | middleName |lastName   |
    | mark         | mop        | nicolee   |
    |adaim         | rob        | jessly    |
    |mike          | As         | jone      |

    @excel
    Scenario: adding employee using excel file
      When user adds multiple employee from excel file


