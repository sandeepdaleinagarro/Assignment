Feature: Verifying few critical functionalities of New York Times Web Page

Scenario Outline: [1] Verify that User should be able to login successfully
Given User is on Home Page
And User clicks the login button
And User is on Login Page
And User enters the email id <emailId>
And User clicks the continue button
And User enters the password <password>
And user clicks the login button on Login Page
When User clicks the continue without subscription button
Then User should verify the page title on Home Page as <pageTitle>
Examples:
|emailId                  |password     |pageTitle                                                           |
|sandeep.dalei@nagarro.com|Sandeep@32127|The New York Times - Breaking News, US News, World News and Videos  |

Scenario: [2] Verify the Navigation items present in the Home screen
Given User is on Home Page
Then User should be able to verify the Navigation items in Home Screen

Scenario Outline: [3] Verify the Search action in Home Page
Given User is on Home Page
And User clicks on the search icon present at top left corner
And User enters the search item in the search box opened <searchItem>
Then User is on Search Page
And User should verify the search Page Title <pageTitle>
Examples:
|searchItem|pageTitle|
|Olympics  |The New York Times - Search|

Scenario Outline: [4] Verify the U.S. Navigation Link Present in Home Screen
Given User is on Home Page
And User mouse hovers on the U.S. Navigation Link
Then User clicks the U.S. section news under the U.S. Navigation Link
And User lands on the U.S. News page <pageTitle>
Examples:
|pageTitle                     |
|U.S. News - The New York Times|
