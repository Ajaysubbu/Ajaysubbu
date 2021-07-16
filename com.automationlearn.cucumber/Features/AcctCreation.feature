#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@ExtentReport
Feature: Create Account for Auto Pract App

  
  Scenario Outline: Create Account for Auto Pract App
    Given Open the browser <url> and navigate to Create an acct
    When  Enter the Email <email> gender and FName <Fname> and LName <LName> and Pwd <pwd>
    And   Enter the Date<Days> and months<months> and yrs<years>
    And   Enter the Company<Comp> and Address1<Addr1> and Addr2<Addr2> 
    And   Enter City<city> and State<state> and Zip<zip>
    And   Enter AddlInfo <AddlInfo> and Home phone <Homephone> and Mobile Phone <Mob> and alais <alias>
    Then  Verify the acct Name as Fname<Fname> and Lname<LName> for loggedin Acct
   
    Examples: 
| url                                     | email      |  Fname | LName |pwd     | Days  | months    | years | Comp | Addr1     | Addr2          | city     | state    | zip   | AddlInfo | Homephone | Mob        | alias          | Title  |                
| http://automationpractice.com/index.php | pl12@jj.com |  Ajay  | Subbu |Coke    s|25     |12         |1980   | CEI  | Lake View | AJ Apartments | illinois |13        |60411  |Practice  |7848595521  |8759495112  |Home Address |My Store|
