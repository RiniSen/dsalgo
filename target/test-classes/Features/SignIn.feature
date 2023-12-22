@tag
Feature: Sign-In feature
  I want to use this template for my feature file

 # @tag3
 # Scenario Outline: Sign-In Scenario outline
 #   Given The user is in the Home page of ds-algo portal
 #   When The user clicks on the Sign-In link
 #   Then The user is taken to the Login page
 #   When The user enters <Username> and <Password> and clicks the login button
 #   Then Verify the <status>
#
 #   Examples: 
  #    | Username            | Password      | status                                               |
  #    |                     |               | Please fill out this field, below username           |
  #    | Cera                |               | Please fill out this field, below passord            |
  #    |                     | ninja         | Please fill out this field                           |
  #    | Payal               | johanna       | Invalid Username and Password                        |
  #    | anjumjohn@gmail.com | shaunthesheep | You are logged in, and with the user name on the top |

 @tag4
 Scenario: Sign-Out scenario
  Given The user is logged in
   #When The user clicks on Sign-Out link
   #Then The user gets the message - Logged out successfully
