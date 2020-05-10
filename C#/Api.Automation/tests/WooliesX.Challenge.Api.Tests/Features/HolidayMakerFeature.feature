Feature: A Happy Holiday Maker
	In order to have a holiday in Sydney on Thursdays
	As a happy holidaymaker
	I want to look up the weather forecast


@ApiTest
Scenario Outline: A happy holidaymaker
	Given I like to holiday in <city>
	And I only like to holiday on <day>
	When I look up the weather forecast
	Then I receive the weather forecast
	And the temperature is warmer than <temperature> degrees

	Examples:
	| city      | day      | temperature |
	| Sydney | Thursday | 10          |