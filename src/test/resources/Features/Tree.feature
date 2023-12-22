@tree
Feature: User tests the Tree page on the Ds algo application

	@TreeScenario_01
  Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "arshsquashers@gmail.com" and "Welcome12#"
    And The user click on login button
    Then The user redirected to homepage

  @TreeScenario_02
  Scenario: The user is directed to "Tree" Page
    Given The user is on the Home page after login with cred "<Sheetname>" and <RowNumber>
    When The user selects Tree item from the drop down menu
    Then The user should be directed to the "Tree" Page
          Examples: 
      | Sheetname  | RowNumber |
      | Login      |         3 | 
      
  @TreeScenario_03
  Scenario: The user is able to navigate to "Overview of Trees" page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Overview of Trees link
    Then The user should be directed to the "Overview of Trees" of tree Page

  @TreeScenario_04
  Scenario: The user is able to navigate to a page having an tryEditor from Overview of Trees page
    Given The user is on the "overview of trees" after logged in
    When The user clicks "Try Here" button in a "tree" page
    Then The user should be redirected to a page having tryEditor with a Run button to test

  @TreeScenario_05
  Scenario Outline: The user is able to run code in tryEditor for Overview of Trees page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TreeScenario_06
  Scenario Outline: The user is able to get the error message for invalid syantax for Overview of Trees page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |        0  |

  @TreeScenario_07
  Scenario: The user is able to navigate to "Terminologies" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Terminologies button
    Then The user should be directed to the "Terminologies" of tree Page

  @TreeScenario_08
  Scenario: The user is able to navigate to Terminologies page having an tryEditor
    Given The user is on the "terminologies page" after logged in
    When The user clicks "Try Here" button in a "Terminologies" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TreeScenario_09
  Scenario Outline: The user is able to run code in tryEditor for Terminologies page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TreeScenario_10
  Scenario Outline: The user is able to get the error message for invalid syntax for Terminologies page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TreeScenario_11
  Scenario: The user is able to navigate to "Types of Trees" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Types of Trees button
    Then The user should be directed to the "Types of Trees" of tree Page

  @TreeScenario_12
  Scenario: The user is able to navigate to a page having an tryEditor from Types of Trees page
    Given The user is on the "types of trees" after logged in
    When The user clicks "Try Here" button in a "types of tree" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TreeScenario_13
  Scenario Outline: The user is able to run code in tryEditor for Types of Trees page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TreeScenario_14
  Scenario Outline: The user is able to get the error message for invalid syntax for Types of Trees page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TreeScenario_15
  Scenario: The user is able to navigate to "Tree Traversals" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Tree Traversals button
    Then The user should be directed to the "Tree Traversals" of tree Page

  @TreeScenario_16
  Scenario: The user is able to navigate to a page having an tryEditor from Tree Traversals Page
    Given The user is on the "tree traversals" after logged in
    When The user clicks "Try Here" button in a "tree traversals" page 
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TreeScenario_17
  Scenario Outline: The user is able to run code in tryEditor for Tree Traversals Page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TreeScenario_18
  Scenario Outline: The user is able to get the error message for invalid syntax for Tree Traversals Page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TreeScenario_19
  Scenario: The user is able to navigate to "Traversals illustration" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Traversal illustration button
    Then The user should be directed to the "Traversals-Illustration" of tree Page

  @TreeScenario_20
  Scenario: The user is able to navigate to a page having an tryEditor from Traversals-Illustration Page
    Given The user is on the "traversal illustration" after logged in
    When The user clicks "Try Here" button in a "traversal illustration" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TreeScenario_21
  Scenario Outline: The user is able to run code in tryEditor for Traversals-Illustration Page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TreeScenario_22
  Scenario Outline: The user is able to get the error message for invalid syntax for Traversals-Illustration Page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TreeScenario_23
  Scenario: The user is able to navigate to "Binary trees" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the binary trees button
    Then The user should be directed to the "Binary Trees" of tree Page

  @TreeScenario_24
  Scenario: The user is able to navigate to a page having an tryEditor from Binary Trees Page
    Given The user is on the "binary trees" after logged in
    When The user clicks "Try Here" button in a "binary tree" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TreeScenario_25
  Scenario Outline: The user is able to run code in tryEditor for Binary Trees Page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TreeScenario_26
  Scenario Outline: The user is able to get the error message for invalid syntax for Binary Trees Page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TreeScenario_27
  Scenario: The user is able to navigate to "Types of Binary trees" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the types of binary trees button
    Then The user should be directed to the "Types of Binary Trees" of tree Page

  @TreeScenario_28
  Scenario: The user is able to navigate to a page having an tryEditor from Types of Binary Trees Page
    Given The user is on the "types of binary trees" after logged in
    When The user clicks "Try Here" button in a "types of binary trees" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TreeScenario_29
  Scenario Outline: The user is able to run code in tryEditor for Types of Binary Trees Page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TreeScenario_30
  Scenario Outline: The user is able to get the error message for invalid syntax for Types of Binary Trees Page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TreeScenario_31
  Scenario: The user is able to navigate to Implementation in Python Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Implementation in Python button
    Then The user should be directed to the "Implementation in Python" of tree Page

  @TreeScenario_32
  Scenario: The user is able to navigate to a page having an tryEditor from Implementation in Python Page
    Given The user is on the "Implementation in Python" after logged in
    When The user clicks "Try Here" button in a "implementation in python" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TreeScenario_33
  Scenario Outline: The user is able to run code in tryEditor for Implementation in Python Page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TreeScenario_34
  Scenario Outline: The user is able to get the error message for invalid syntax for Implementation in Python Page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TreeScenario_35
  Scenario: The user is able to navigate to binary tree traversals Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the binary tree traversals button
    Then The user should be directed to the "Binary Tree Traversals" of tree Page

  @TreeScenario_36
  Scenario: The user is able to navigate to a page having an tryEditor from Binary Tree Traversals page
    Given The user is on the "Binary Tree Traversals" after logged in
    When The user clicks "Try Here" button in a "binary tree traversals" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TreeScenario_37
  Scenario Outline: The user is able to run code in tryEditor for Binary Tree Traversals page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TreeScenario_38
  Scenario Outline: The user is able to get the error message for invalid syntax for Binary Tree Traversals page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TreeScenario_39
  Scenario: The user is able to navigate to Implementation of Binary Trees Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Implementation of Binary Trees button
    Then The user should be directed to the "Implementation of Binary Trees" of tree Page

  @TreeScenario_40
  Scenario: The user is able to navigate to a page having an tryEditor from Implementation of Binary Trees Page
    Given The user is on the "Implementation Of Binary Trees" after logged in
    When The user clicks "Try Here" button in a "Implementation of binary trees" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TreeScenario_41
  Scenario Outline: The user is able to run code in tryEditor for Implementation of Binary Trees Page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TreeScenario_42
  Scenario Outline: The user is able to get the error message for invalid syntax for Implementation of Binary Trees Page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TreeScenario_43
  Scenario: The user is able to navigate to Applications of Binary Trees Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Applications of Binary Trees button
    Then The user should be directed to the "Applications of Binary trees" of tree Page

  @TreeScenario_44
  Scenario: The user is able to navigate to a page having an tryEditor from Applications of Binary trees Page
    Given The user is on the "Applications Of Binary Trees" after logged in
    When The user clicks "Try Here" button in a "Applications of binary trees" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TreeScenario_45
  Scenario Outline: The user is able to run code in tryEditor for Applications of Binary trees Page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TreeScenario_46
  Scenario Outline: The user is able to get the error message for invalid syntax for Applications of Binary trees Page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TreeScenario_47
  Scenario: The user is able to navigate to "Binary Search Trees" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Binary Search Trees button
    Then The user should be directed to the "Binary Search Trees" of tree Page

  @TreeScenario_48
  Scenario: The user is able to navigate to a page having an tryEditor from Binary Search Trees Page
    Given The user is on the "Binary Search Trees" after logged in
    When The user clicks "Try Here" button in a "Binary Search Trees" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TreeScenario_49
  Scenario Outline: The user is able to run code in tryEditor for Binary Search Trees Page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TreeScenario_50
  Scenario Outline: The user is able to get the error message for invalid syntax for Binary Search Trees Page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TreeScenario_51
  Scenario: The user is able to navigate to "Implementation of BST" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Implementation of BST button
    Then The user should be directed to the "Implementation Of BST" of tree Page

  @TreeScenario_52
  Scenario: The user is able to navigate to a page having an tryEditor from Implementation Of BST Page
    Given The user is on the "Implementation Of BST" after logged in
    When The user clicks "Try Here" button in a "Implementation of BST" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TreeScenario_53
  Scenario Outline: The user is able to run code in tryEditor for Implementation Of BST Page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TreeScenario_54
  Scenario Outline: The user is able to get the error message for invalid syntax for Implementation Of BST Page
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TreeScenario_55
  Scenario: The user validating "Practice Questions" page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Overview of Trees link
    When The user clicks on the Practice Questions in Overview of Trees
    Then The user should be directed to Practice Questions of tree page Page