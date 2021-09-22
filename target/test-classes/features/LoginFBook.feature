Feature: validate the Login functionality of facebook

Scenario: validate the login functionality with valid credentials
Given launch the browser
And open the facebook application
When enter the username and password
When  click the login button
Then validate the message
Then close the browser
