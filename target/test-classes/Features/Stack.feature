@Stack
Feature: Stack: Luanch the DS-Algo portal and test Stack module
  
 @StackScenario_1 
  Scenario: The user is logged in to DS Algo portal
   Given The user is on Signin page of DS Algo portal
    When The user enter valid "arshsquashers@gmail.com" and "Welcome12#"
    And The user click on login button
    Then The user redirected to homepage

  @StackScenario_2
  Scenario: The user is able to navigate to Stack home page
   Given The user is on the Home page after login with credential "<Sheetname>" and <RowNumber>
   When The user clicks on the Get Started button on Stack or select Stack item from the drop down menu
   Then The user is redirected to the "Stack" page
    
      Examples: 
      | Sheetname  | RowNumber |
      | Login      |         3 |  
      
  @StackScenario_3
  Scenario: The user is able to navigate to Stack Stack page
    Given The user is in "Stack url" page
    When The user clicks on the Operations in Stack link on Stack page
    Then The user should be redirected to "Operations in Stack url" page
    
  @StackScenario_4
  Scenario: The user should be redirected to tryeditor page with run button to test python code
    Given The user is in "Operations in Stack url" page
    When The user clicks on "Tryhere" button on "Operations in Stack url" page
    Then The user should be redirected to tryEditor page with Run button
   
  @StackScenario_5
  Scenario Outline: The user is able to run code in Editor for Stack page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @StackScenario_6
  Scenario Outline: The user is presented with error message for invalid code in Editor for Stack page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'hello' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
    
  @StackScenario_7
  Scenario: The user is able to navigate to Stack page and click on Stack Implementation link
    Given The user in "try editor url" page and navigates to get "Stack url" page
    When The user clicks on Stack Implementation link
    Then The user is navigated to "Stack Implementation url" page

  @StackScenario_8
  Scenario: The user should be redirected to tryeditor page with run button to test python code
    Given The user is in "Stack Implementation url" page
    When The user clicks on "Tryhere" button on "Stack Implementataion url" page
    Then The user should be redirected to tryEditor page with Run button

  @StackScenario_9
  Scenario Outline: The user is able to run code in Editor for Stack Representations page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @StackScenario_10
  Scenario Outline: The user is presented with error message for invalid code in Editor for Stack Representations page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'hello' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
   @StackScenario_11
  Scenario: The user is able to navigate to Stack page and click on Stack Applications link
    Given The user in "try editor url" page and navigates to get "Stack url" page
    When The user clicks on Stack Applications link
    Then The user is navigated to "Stack Applications url" page

  @StackScenario_12
  Scenario: The user should be redirected to tryeditor page with run button to test python code
    Given The user is in "Stack Applications url" page
    When The user clicks on "Tryhere" button on "Stack Applications url" page
    Then The user should be redirected to tryEditor page with Run button

  @StackScenario_13
  Scenario Outline: The user is able to run code in Editor for Stack Representations page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @StackScenario_14
  Scenario Outline: The user is presented with error message for invalid code in Editor for Stack Representations page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message as "NameError: name 'hello' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @StackScenario_15
  Scenario: The user is able to navigate to Stack representations page and click on Practice Questions
    Given The user is in "try editor url" and navigates to get "Stack representations url" page
    When the user clicks on Practice Questions link on Stack representations page
    Then The user is directed to "Stack practiceq url" page
    