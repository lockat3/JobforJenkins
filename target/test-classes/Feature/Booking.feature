Feature: Validate the Booking Page in AdactinHotel
@Regq
Scenario Outline: Vallidate the generation of Booking Id
Given User should enter the login Page
When User should enter "<userName>" and "<password>"
When User should select "<location>" and "<hotel>" and "<roomType>" and "<roomNo>" and  "<dateIn>" and "<dateOut>" and "<adult>" and "<childRoom>"
When User should select hotel
When User should enter Booking details using table "<firstName>" and "<lastName>" and "<address>"
|ccnum|cctype|ccyear|ccexpmonth|cccvv|
|1111222233334440|American Express|2029|October|1122|
|8888777766665555|Master Card|2025|June|1122|
Then User should get BookingId
Examples: 
|userName|password|location|hotel|roomType|roomNo|dateIn|dateOut|adult|childRoom|firstName|lastName|address|
|chethrakamaraj|ck7200565947|Sydney|Hotel Sunshine|Standard|3 - Three|23/12/2021|23/12/2021|3 - Three|3 - Three|sample first name|sample last name|address likne 1|

Scenario Outline: Vallidate the error message for 7 feilds
Given User should enter the login Page
When User should enter "<userName>" and "<password>"
When User should select "<location>" and "<hotel>" and "<roomType>" and "<roomNo>" and  "<dateIn>" and "<dateOut>" and "<adult>" and "<childRoom>"
When User should select hotel
When User should click Book hotel
Then User should verify the 7 error messages
|Please Enter your First Name|
|Please Enter you Last Name|
|Please Enter your Address|
|Please Enter your 16 Digit Credit Card Number|
|Please Select your Credit Card Type|
|Please Select your Credit Card Expiry Month|
|Please Enter your Credit Card CVV Number|
Examples:
|userName|password|location|hotel|roomType|roomNo|dateIn|dateOut|adult|childRoom|
|chethrakamaraj|ck7200565947|Sydney|Hotel Sunshine|Standard|3 - Three|23/12/2021|23/12/2021|3 - Three|3 - Three|
@Reg
Scenario Outline: Vallidate the generation of Booking Id
Given User should enter the login Page
When User should enter "<userName>" and "<password>"
When User should select "<location>" and "<hotel>" and "<roomType>" and "<roomNo>" and  "<dateIn>" and "<dateOut>" and "<adult>" and "<childRoom>"
When User should select hotel
When User should enter Booking details "<firstName>" and "<lastName>" and "<address>" and "<ccnum>" and "<cctype>" and "<ccyear>" and "<ccexpmonth>" and "<cccvv>"
Then User should get BookingId
Examples: 
|userName|password|location|hotel|roomType|roomNo|dateIn|dateOut|adult|childRoom|firstName|lastName|address|ccnum|cctype|ccyear|ccexpmonth|cccvv|
|chethrakamaraj|ck7200565947|Sydney|Hotel Sunshine|Standard|3 - Three|23/12/2021|23/12/2021|3 - Three|3 - Three|sample first name|sample last name|address likne 1|1111222233334440|American Express|2013|October|1122|