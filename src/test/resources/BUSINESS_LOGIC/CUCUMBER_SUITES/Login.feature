Feature: Login functionality

Background: User is successfully LaunchedApplication
When user opens "Chrome" browser with exe as "G:\\March2022FlipkartFinal\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user opens URL as "https://www.flipkart.com"
When user cancle initial login page

@SmokeTest
Scenario: Login functionality with valid credentials
When user move on Login
When user click on My Profile
When user enter "9168313434" as username
When user enter "abcd@123" as password
When user click on Login 
Then application shows user logged successfully

