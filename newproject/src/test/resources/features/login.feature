Feature: 
Automation of DsPortal app  site

Scenario: Open Ds Education site to get start
Given The user opens site link
Then Site will load 
When Click get started to enter into the site
Then Home page will get load

Scenario: Trying to get started in Home page
Given Trys to get start by clicking Get started
Then  Alerts You are not logged in
When  Clicks Data Structure drop down
Then  Shows six lists of data structure
When  Clicks List in Data structure
Then  Alerts You are not logged in
When  Clicks Sign in To login
Then  Navigates to login page

Scenario: Registerion for the new user
Given Clicks register to create username and password
Then Register page will load 
When Clicks NumpyNinja
Then Returns back to First page to Get started And click back to register your account
When clicks register button with null values
Then Shows Error message Please fill out this field in username
When Enters only user name without other fields
Then Shows Error message Please fill out this field in password
When clicks register without confirm password
Then Shows Error message Please fill out this field in confirm password
When Enters mismatch password
 And  Clicks Register 
Then Shows Error message password_mismatch:The two password fields didn’t match
When Enters Username with symbols except numbers and letters 
And  Clicks Register 
Then Shows Error message password_mismatch:The two password fields didn’t match
When Enters password below eight characters
 And  Clicks Register 
Then Shows Error message password_mismatch:The two password fields didn’t match
When Enters Password only with numbers 
And  Clicks Register 
Then Shows Error message password_mismatch:The two password fields didn’t match
When Enters valid username and passwords
And  Clicks Register 
Then Accepts user name and password and navigate to home page with username And Shows New Account credited with username
When clicks Sign out 
Then Displays Logged out successfully
When User registered already clicks Login 
Then Navigates to login page

Scenario Outline: Signing in
Given User registered already clicks Login
When  Enters Different combination of username and password from Excel "<sheetname>" file
Then Shows respective messages And Navigates to home page when enters correct username and password
Examples:
 | sheetname| 
 |login     |       
   

 Scenario: Automation of Data Structures Introduction
 Given User in Home page with logged username
 When Clicks Get Started to read about DS Introduction
 Then Goes to DS Introduction page
 When Clicks Time complexity to explore
 Then Navigates to Time complexity page
 When clicks Try here And Enters  phython program And clicks Run
 Then It runs progam And shows Output


