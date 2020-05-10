## Woolworths Coding Challenge

### Challenge

Create an automated smoke test suite for the below Acceptance Criteria,

**Acceptance Criteria**: I want to be able to add 2 items to the cart and place an order in http://automationpractice.com/index.php

### Framework

This coding challenge has been written using **Java-Selenium-Cucumber-Maven-JUnit** frameworks.

This is light-weight automation framework which has the following features: 

1. JAVA as programming language
2. Maven as Build & Project Management tool
3. Selenium as UI Automation tool
4. BDD - Behavior Driven Development with Cucumber
5. POM - Page Object Model
6. Modular Design
7. Cucumber Hooks
8. Report Generation (html/json) 
9. Screenshots
10. Centralized Configurations (Using Properties file)
11. Multi-Browser support through configuration
12. Multiple Environments support

Framework Architecture
--------------
	ui.automation
		|
		|_src/main/java
		|	|...
		|_src/test/java
		|	|...
		|	|_wooliesx.challenge.core
		|	|	|_PageBase.java
		|	|	|_TestBase.java
		|	|	|_TestContext.java
		|	|_wooliesx.challenge.core.browsers
		|	|	|_Browser.java
		|	|	|_ChromeBrowser.java
		|	|	|_FirefoxBrowser.java
		|	|	|_IEBrowser.java
		|	|_wooliesx.challenge.core.interfaces
		|	|	|_IConfiguration.java
		|	|_wooliesx.challenge.core.utilities
		|	|	|_BrowserHelper.java
		|	|	|_Configuration.java
		|	|	|_Utilities.java
		|	|_wooliesx.challenge.features
		|	|	|_OrdersFeature.feature
		|	|_wooliesx.challenge.resources.drivers
		|	|	|_chromedriver.exe
		|	|	|_geckodriver.exe
		|	|	|_IEDriverServer.exe
		|	|_wooliesx.challenge.resources.properties
		|	|	|_development.properties
		|	|	|_global.properties
		|	|_wooliesx.challenge.resources.utilities
		|	|	|_ResourceHelper.java
		|	|_wooliesx.challenge.runners
		|	|	|_Runner.java
		|	|_wooliesx.challenge.stepDefinations
		|	|	|_CartSteps.java
		|	|	|_Hooks.java
		|	|	|_LoginSteps.java
		|	|	|_OrdersSteps.java
		|	|_wooliesx.challenge.ui.pages
		|	|	|_AddressPage.java
		|	|	|_AuthenticationPage.java
		|	|	|_...

* **src/test/java/wooliesx/challenge/features** - All the cucumber features files (*.feature files) goes here.
* **src/test/java/wooliesx/challenge/stepDefinations** - All the step definations of the required features goes under this package.
* **src/test/java/wooliesx/challenge/runners** - This package contains all the cucumber runners where glue code location (step definations), test result output format (html, json, xml) and Hooks can be configured.
* **src/test/java/wooliesx/challenge/resources** - All the resource files/configurations goes here such as drivers, global and environment based settings etc.
* **src/test/java/wooliesx/challenge/core** - This is the reusability layer where all the base classes, browser and configuration helpers exist.

### To change the Environment and it's configurations

- Under `src/test/java/resources/properties`, modify the environment file `<environment>.properties` in case of any modifications required.
- Then, modify the `global.properties` file as below to switch to the respective environment.

```java
	environment = <environment-to-be-switched>
```

### To change the browser to run the automation

- Under `src/test/java/resources/properties`, modify the `global.properties` file as below to change the browser.

```java
	browser = <browser-to-be-switched>
```

### Cucumber Report

There is a feature overview page:

![Automation Test Report](https://github.com/swathij321/WooliesX.Challenge/Java/raw/master/.README/report.jpg)

