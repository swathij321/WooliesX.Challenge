$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/wooliesx/challenge/features/HolidayMakerFeature.feature");
formatter.feature({
  "name": "A Happy Holiday Maker",
  "description": "\tIn order to have a holiday in Sydney on Thursdays\n\tAs a happy holidaymaker\n\tI want to look up the weather forecast",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "A happy holidaymaker",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ApiTest"
    }
  ]
});
formatter.step({
  "name": "I like to holiday in \u003ccity\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "I only like to holiday on \u003cday\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I look up the weather forecast",
  "keyword": "When "
});
formatter.step({
  "name": "I receive the weather forecast",
  "keyword": "Then "
});
formatter.step({
  "name": "the temperature is warmer than \u003ctemperature\u003e degrees",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "city",
        "day",
        "temperature"
      ]
    },
    {
      "cells": [
        "Sydney",
        "Thursday",
        "10"
      ]
    }
  ]
});
formatter.scenario({
  "name": "A happy holidaymaker",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ApiTest"
    }
  ]
});
formatter.step({
  "name": "I like to holiday in Sydney",
  "keyword": "Given "
});
formatter.match({
  "location": "HappyHolidayMakerSteps.i_like_to_holiday_in(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I only like to holiday on Thursday",
  "keyword": "And "
});
formatter.match({
  "location": "HappyHolidayMakerSteps.i_only_like_to_holiday_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I look up the weather forecast",
  "keyword": "When "
});
formatter.match({
  "location": "HappyHolidayMakerSteps.i_look_up_the_weather_forecast()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I receive the weather forecast",
  "keyword": "Then "
});
formatter.match({
  "location": "HappyHolidayMakerSteps.i_receive_the_weather_forecast()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the temperature is warmer than 10 degrees",
  "keyword": "And "
});
formatter.match({
  "location": "HappyHolidayMakerSteps.the_temperature_is_warmer_than_degrees(double)"
});
formatter.result({
  "status": "passed"
});
});