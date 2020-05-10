## Woolworths Coding Challenge

### Challenge

Create an API automation test suite for http://openweathermap.org/forecast16 with the below Acceptance Criteria,

**Acceptance Criteria**

```
	Scenario: A happy holidaymaker
		Given I like to holiday in Sydney
		And I only like to holiday on Thursdays
		When I look up the weather forecast
		Then I receive the weather forecast
		And the temperature is warmer than 10 degrees
```

### Framework

This coding challenge has been written using **Java-Cucumber-Maven-JUnit** frameworks.

This is light-weight automation framework which has the following features: 

1. JAVA as programming language
2. Maven as Build & Project Management tool
3. BDD - Behavior Driven Development with Cucumber
4. Modular Design
5. Report Generation (html/json) 

Framework Architecture
--------------
	api.automation
		|
		|_src/main/java
		|	|...
		|_src/test/java
		|	|...
		|	|_wooliesx.challenge.features
		|	|	|_HolidayMakerFeature.feature
		|	|_wooliesx.challenge.models
		|	|	|_...
		|	|	|_OpenWeatherMapData.java
		|	|	|_...
		|	|_wooliesx.challenge.runners
		|	|	|_Runner.java
		|	|_wooliesx.challenge.services
		|	|	|_OpenWeatherMapApi.java
		|	|_wooliesx.challenge.stepDefinations
		|	|	|_HappyHolidayMakerSteps.java

* **src/test/java/wooliesx/challenge/features** - All the cucumber features files (*.feature files) goes here.
* **src/test/java/wooliesx/challenge/stepDefinations** - All the step definations of the required features goes under this package.
* **src/test/java/wooliesx/challenge/runners** - This package contains all the cucumber runners where glue code location (step definations), test result output format (html, json, xml) and Hooks can be configured.
* **src/test/java/wooliesx/challenge/services** - All the services will go here to call external API such as open weather map api etc.
* **src/test/java/wooliesx/challenge/models** - All the model files will go here to transform the json data to business objects.

### Cucumber Report

There is a feature overview page:

![Automation Test Report](https://raw.githubusercontent.com/swathij321/WooliesX.Challenge/master/Java/api.automation/report.jpg)

