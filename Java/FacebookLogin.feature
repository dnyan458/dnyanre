Feature : Facebook Login

description : To test valid and in valid data sets over facebook

Background :
Given user is on facebook login page

scenario: valid facebook login
When user enter username
And  user enter password
And user click on login button
Then user navigate to facebook home page

scenario: invalid facebook login
When user enter  invalid username
And  user enter  invalid password
And user click on login button
Then user will get error message please enter correct username and password