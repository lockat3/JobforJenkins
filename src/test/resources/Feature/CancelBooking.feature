Feature: Validate the Cancel Booking in AdactinHotel
@Go
Scenario Outline: Vallidate the generation of Booking Id
Given User should enter the login Page
When User should enter "<userName>" and "<password>"
When User should select "<location>" and "<hotel>" and "<roomType>" and "<roomNo>" and  "<dateIn>" and "<dateOut>" and "<adult>" and "<childRoom>"
When User should select hotel
When User should enter Booking details "<firstName>" and "<lastName>" and "<address>" and "<ccnum>" and "<cctype>" and "<ccyear>" and "<ccexpmonth>" and "<cccvv>"
When User should get BookingId
When User should enter Itinery page and Search BookingId
When User should cancel the BookingId
When User should verify the cancelation message "Bookind id is cancelled"
Examples: 
|userName|password|location|hotel|roomType|roomNo|dateIn|dateOut|adult|childRoom|firstName|lastName|address|ccnum|cctype|ccyear|ccexpmonth|cccvv|
|chethrakamaraj|ck7200565947|Sydney|Hotel Sunshine|Standard|3 - Three|23/12/2021|23/12/2021|3 - Three|3 - Three|sample first name|sample last name|address likne 1|1111222233334440|American Express|2013|October|1122|

Scenario Outline: Validate the Cancelation of existing Booking id in AdactinHotel
Given User should enter the login Page
When User should enter "<userName>" and "<password>"
When User should enter Itinery page and Search BookingId"<Orderid>"
When User should cancel the BookingId
When User should verify the cancelation message "Bookind id is cancelled"
Examples: 
|userName|password|Orderid|
|chethrakamaraj|ck7200565947|GHJKIK123|