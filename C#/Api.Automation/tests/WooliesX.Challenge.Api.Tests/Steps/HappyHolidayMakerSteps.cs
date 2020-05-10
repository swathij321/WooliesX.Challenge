using FluentAssertions;
using System;
using System.Linq;
using TechTalk.SpecFlow;
using WooliesX.Challenge.Api.Tests.Services;
using WooliesX.Challenge.Api.Tests.Utilities;

namespace WooliesX.Challenge.Api.Tests.Steps
{
    [Binding]
    public class HappyHolidayMakerSteps
    {
        private readonly OpenWeatherMapApi _openWeatherMapApi;

        public HappyHolidayMakerSteps(OpenWeatherMapApi openWeatherMapApi)
        {
            _openWeatherMapApi = openWeatherMapApi;
        }

        [Given(@"I like to holiday in (.*)")]
        public void GivenILikeToHolidayIn(string city)  
        {
            _openWeatherMapApi.City = city;
        }
        
        [Given(@"I only like to holiday on (.*)")]
        public void GivenIOnlyLikeToHolidayOn(string day)
        {
            DayOfWeek dayOfHoliday;

            if (Enum.TryParse(day, true, out dayOfHoliday))
            {
                _openWeatherMapApi.DayOfHoliday = dayOfHoliday;
            }
        }
        
        [When(@"I look up the weather forecast")]
        public void WhenILookUpTheWeatherForecast()
        {
            _openWeatherMapApi.Lookup();
        }
        
        [Then(@"I receive the weather forecast")]
        public void ThenIReceiveTheWeatherForecast()
        {
            var responseJson = _openWeatherMapApi.ResponseText;

            // Assert the response is valid json
            JsonUtil.IsValidJson(responseJson).Should().BeTrue();

            // Assert forecast data for the city should be Sydney
            _openWeatherMapApi.ResponseData.City.Name.Should().Be(_openWeatherMapApi.City);

            // Assert forecast data should contain data for Thursday
            _openWeatherMapApi.ResponseData.ForecastList
                .Where(fc => DateTime.Parse(fc.DateTimeText).DayOfWeek == _openWeatherMapApi.DayOfHoliday)
                .Any().Should().BeTrue();
        }
        
        [Then(@"the temperature is warmer than (.*) degrees")]
        public void ThenTheTemperatureIsWarmerThanDegrees(double temperature)
        {
            // Assert forecast weather should be greater than 10 degrees
            _openWeatherMapApi.ResponseData.ForecastList
                .Where(fc => 
                    DateTime.Parse(fc.DateTimeText).DayOfWeek == _openWeatherMapApi.DayOfHoliday
                    && fc.MainDetail.MinimumTemperature > temperature)
                .Any().Should().BeTrue();
        }
    }
}
