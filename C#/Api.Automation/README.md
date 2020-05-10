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

This coding challenge has been written using **DotNetCore-C#-Specflow-MSTest** frameworks.

This is light-weight automation framework which has the following features: 

1. DOT NET Core as Run time framework 
2. C# as programming language
3. BDD - Behavior Driven Development with Specflow
4. Modular Design

Framework Architecture
--------------
	Api.Automation
		|
		|_tests/WooliesX.Challenge.Api.Tests
		|	|...
		|	|_Features
		|	|	|_HolidayMakerFeature.feature
		|	|_Models
		|	|	|_...
		|	|	|_OpenWeatherMapData.cs
		|	|	|_...
		|	|_Services
		|	|	|_OpenWeatherMapApi.cs
		|	|_Steps
		|	|	|_HappyHolidayMakerSteps.cs
		|	|_Utilities
		|	|	|_JsonUtil.cs
		|	|	|_RestApiUtil.cs
		|	|	|_TestConfiguration.cs

* **tests/WooliesX.Challenge.Api.Tests/Features** - All the specflow features files (*.feature files) goes here.
* **tests/WooliesX.Challenge.Api.Tests/Steps** - All the step definations of the required features goes under this directory.
* **tests/WooliesX.Challenge.Api.Tests/Services** - All the services will go here to call external API such as open weather map api etc.
* **tests/WooliesX.Challenge.Api.Tests/Models** - All the model files will go here to transform the json data to business objects.
* **tests/WooliesX.Challenge.Api.Tests/Utilities** - This directory contains all the helper utilities to make rest api call, json conversion etc.
