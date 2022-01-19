Feature: Verify the select Hotel page
Scenarios: Verify the navigation to the select Hotel
Given User should enter the login page
When User should be able to login with "<userName>" and "<password>"
When User should select Hotel details "<location>" and "<hotel>" and "<roomType>" and "<roomNo>" and  "<dateIn>" and "<dateOut>" and "<adult>" and "<childRoom>"
Then User should verify the Select hotel page
Examples: 
|userName|password|location|hotel|roomType|roomNo|dateIn|dateOut|adult|childRoom|
|chethrakamaraj|ck7200565947|Sydney|Hotel Sunshine|Standard|3 - Three|23/12/2021|23/12/2021|3 - Three|3 - Three|

Scenarios: Verify the mandatory fields and navigate to select hotel
Given User should enter the login page
When User should be able to login with "<userName>" and "<password>"
When User should select mandatory  details "<location>" and "<hotel>" and "<roomType>" and "<roomNo>"  and "<adult>" and "<childRoom>"
Then User should verify the Select hotel page
Examples: 
|userName|password|location|hotel|roomType|roomNo|adult|childRoom|
|chethrakamaraj|ck7200565947|Sydney|Hotel Sunshine|Standard|3 - Three|3 - Three|3 - Three|

Scenarios: Verify the verify the indate and outdate and navigate to select hotel
Given User should enter the login page
When User should be able to login with "<userName>" and "<password>"
When User should select  details with indate and outdate "<location>" and "<hotel>" and "<roomType>" and "<roomNo>" and  "<dateIn>" and "<dateOut>" and "<adult>" and "<childRoom>"
Then User should verify the Select hotel page
 Examples: 
|userName|password|location|hotel|roomType|roomNo|dateIn|dateOut|adult|childRoom|
|chethrakamaraj|ck7200565947|Sydney|Hotel Sunshine|Standard|3 - Three|23/12/2021|23/12/2021|3 - Three|3 - Three|

Scenarios: Verify the error message for no feild selection
Given User should enter the login page
When User should be able to login with "<userName>" and "<password>"
When User should click search hotel
Then User should verify the error message "Please select a location"
 Examples: 
|userName|password|
|chethrakamaraj|ck7200565947|