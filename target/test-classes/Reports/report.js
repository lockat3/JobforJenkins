$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Adactin.feature");
formatter.feature({
  "name": "Validate the Booking in AdactinHotel",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Vallidate the generation of Booking Id",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User should enter the login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should select \"\u003clocation\u003e\" and \"\u003chotel\u003e\" and \"\u003croomType\u003e\" and \"\u003croomNo\u003e\" and  \"\u003cdateIn\u003e\" and \"\u003cdateOut\u003e\" and \"\u003cadult\u003e\" and \"\u003cchildRoom\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should select hotel",
  "keyword": "When "
});
formatter.step({
  "name": "User should enter Booking details \"\u003cfirstName\u003e\" and \"\u003clastName\u003e\" and \"\u003caddress\u003e\" and \"\u003cccnum\u003e\" and \"\u003ccctype\u003e\" and \"\u003cccyear\u003e\" and \"\u003cccexpmonth\u003e\" and \"\u003ccccvv\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should get BookingId",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "location",
        "hotel",
        "roomType",
        "roomNo",
        "dateIn",
        "dateOut",
        "adult",
        "childRoom",
        "firstName",
        "lastName",
        "address",
        "ccnum",
        "cctype",
        "ccyear",
        "ccexpmonth",
        "cccvv"
      ]
    },
    {
      "cells": [
        "chethrakamaraj",
        "ck7200565947",
        "Sydney",
        "Hotel Sunshine",
        "Standard",
        "3 - Three",
        "23/12/2021",
        "23/12/2021",
        "3 - Three",
        "3 - Three",
        "sample first name",
        "sample last name",
        "address likne 1",
        "1111222233334440",
        "American Express",
        "2013",
        "October",
        "1122"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Vallidate the generation of Booking Id",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User should enter the login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionClass.user_should_enter_the_login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"chethrakamaraj\" and \"ck7200565947\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionClass.user_should_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select \"Sydney\" and \"Hotel Sunshine\" and \"Standard\" and \"3 - Three\" and  \"23/12/2021\" and \"23/12/2021\" and \"3 - Three\" and \"3 - Three\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionClass.user_should_select_and_and_and_and_and_and_and(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select hotel",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionClass.user_should_select_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter Booking details \"sample first name\" and \"sample last name\" and \"address likne 1\" and \"1111222233334440\" and \"American Express\" and \"2013\" and \"October\" and \"1122\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionClass.user_should_enter_Booking_details_and_and_and_and_and_and_and(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should get BookingId",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.user_should_get_BookingId()"
});
formatter.result({
  "status": "passed"
});
});